package br.edu.infnet.enderecoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.enderecoapp.model.service.EstadoService;

@Controller
public class EstadoController {

	@Autowired
	private EstadoService estadoService;
	
	@GetMapping(value = "/estados")
	public String telaLista(Model model) {
		
		model.addAttribute("lista", estadoService.obterLista());
		
		return "estado/lista";
	}
	
}
