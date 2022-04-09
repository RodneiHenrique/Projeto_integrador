package br.com.project.adv.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.project.adv.models.Clientes;
import br.com.project.adv.repository.ClienteRepository;

@Controller
public class ClientesController {
	
	@Autowired
	private ClienteRepository cr;

	@RequestMapping(value="/cadastrarCliente", method=RequestMethod.GET)
	public String form() {
		return "/formCliente";
	}
	
	@RequestMapping(value="/cadastrarCliente", method=RequestMethod.POST)
	public String form(Clientes clientes) {
		
		cr.save(clientes);
		
		return "redirect:/cadastrarCliente";
		
		
	}
}
