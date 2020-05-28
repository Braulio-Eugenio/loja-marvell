package br.com.zup.pgg.programaprincipal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.zup.pgg.programaprincipal.dao.ClienteDao;
import br.com.zup.pgg.programaprincipal.entity.Cliente;

@Service
public class ClienteService {
	ClienteDao clienteDao = new ClienteDao();

	public void insereCliente(Cliente cliente) {
		clienteDao.insereCliente(cliente);
		
	}

	public List<Cliente> buscaClientes(String cpf) {

		if (cpf != null) {
			List<Cliente> listaCliente = new ArrayList();
			listaCliente.add(clienteDao.listaClientesPorCpf(cpf));
			return listaCliente;
		} else {

			return clienteDao.listaClientes();
		}

	}

	public Cliente alteraCadastro(String cpf, Cliente cliente) {

		clienteDao.alteraCliente(cliente, cpf);

		return cliente;

	}

	public void deletaCliente(String cpf) {

		clienteDao.deletaCliente(cpf);
	}


}
