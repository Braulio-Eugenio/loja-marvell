package br.com.zup.pgg.programaprincipal.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.pgg.programaprincipal.entity.Cliente;
import br.com.zup.pgg.programaprincipal.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	ClienteService clienteService;

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insereCliente(@RequestBody Cliente cliente) {

		clienteService.insereCliente(cliente);

	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Cliente> buscaClientes(@PathParam(value = "cpf") String cpf) {

		return clienteService.buscaClientes(cpf);
	}

	@PutMapping(path = "/{cpf}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Cliente atualizaCliente(@PathVariable String cpf, @RequestBody Cliente cliente) {
		return clienteService.alteraCadastro(cpf, cliente);

	}

	@DeleteMapping(path = "/{cpf}")
	public void deletaCliente(@PathVariable String cpf) {
		clienteService.deletaCliente(cpf);
	}

}
