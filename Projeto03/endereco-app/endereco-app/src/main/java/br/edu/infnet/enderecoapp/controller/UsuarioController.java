package br.edu.infnet.enderecoapp.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.enderecoapp.model.domain.Endereco;
import br.edu.infnet.enderecoapp.model.domain.Role;
import br.edu.infnet.enderecoapp.model.domain.Usuario;
import br.edu.infnet.enderecoapp.model.service.RoleService;
import br.edu.infnet.enderecoapp.model.service.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private RoleService roleService;
	
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@GetMapping(value = "/usuario")
	public String telaCadastro(Model model) {

		model.addAttribute("roles", roleService.obterLista());

		return "usuario/cadastro";
	}

	@PostMapping(value = "/usuario/incluir")
	public String login(Usuario usuario, Endereco endereco, Integer acesso) {
		
		usuario.setSenha(bCryptPasswordEncoder.encode(usuario.getSenha()));

		usuario.setEndereco(endereco);
		
		usuario.setRoles(Arrays.asList(new Role(acesso)));
		
		usuarioService.incluir(usuario);
		
		usuario.toString();

		return "redirect:/";
	}

}
