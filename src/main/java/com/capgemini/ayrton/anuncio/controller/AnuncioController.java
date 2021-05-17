package com.capgemini.ayrton.anuncio.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;

import java.util.List;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.capgemini.ayrton.anuncio.service.AnuncioService;
import com.capgemini.ayrton.anuncio.model.Anuncio;

@Controller
@ComponentScan(basePackages= {"com.capgemini.ayrton.anuncio.controller"})
public class AnuncioController {
	
	
	private AnuncioService anuncioService;
	

	@RequestMapping(value="/insert", method = RequestMethod.GET)
	public ModelAndView insert() {
		return new ModelAndView("insert", "anuncio", new Anuncio());
	}
	
	@RequestMapping(value = "/insert", method=RequestMethod.POST)
	public String cadastrarAnuncio(@Validated @ModelAttribute("anuncio") Anuncio anuncio,
			BindingResult result, ModelMap model) {
		if(result.hasErrors()) {
			return "error";
		}
		anuncioService.insert(anuncio);
		return "redirect:";
	}
	
	@RequestMapping(value = "/read", method=RequestMethod.GET)
	public ModelAndView read() {
		ModelAndView mv = new ModelAndView("read");
		mv.addObject("anuncios", anuncioService.findAllAnuncios());
		return mv;
	}
}
