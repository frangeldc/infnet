package br.edu.infnet.votafilipe.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class AppController {

	@GetMapping(value = "/")
	public String index() {
		return "index";
	}
}
