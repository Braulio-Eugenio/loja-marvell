package br.com.zup.pgg.programaprincipal.service;

import java.util.ArrayList;
import java.util.List;

import br.com.zup.pgg.programaprincipal.dao.ClienteDao;
import br.com.zup.pgg.programaprincipal.entity.Cliente;

public class ClienteService {
	ClienteDao clienteDao = new ClienteDao();

	public Cliente adicionaCliente(Cliente cliente) {
		clienteDao.insereCliente(cliente);

		return cliente;
	}

	public List<Cliente> buscaCliente(String cpf) {

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

	public void excluirCadastro(String cpf) {

		clienteDao.deletaCliente(cpf);
	}


}
