package br.com.zup.pgg.programaprincipal.controller;




/*public class ClienteControllerServlet {
	@WebServlet
	public class ControllerCliente extends HttpServlet {
		private static final String CATACTERE_POSICAO_INICIAL = "/";
		private static final int ACRESCENTA_UMA_POSICAO = 1;
		private static final long serialVersionUID = 1L;
		ClienteService clienteService = new ClienteService();
		Gson gson = new Gson();

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String json = req.getReader().lines().collect(Collectors.joining());
			Cliente clienteRequest = gson.fromJson(json, Cliente.class);
			Cliente clienteResposnse = clienteService.insereClinete(clienteRequest);
			String clienteJson = gson.toJson(clienteResposnse);
			PrintWriter out = resp.getWriter();
			out.print(clienteJson);
			out.flush();

		}

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String cpf = req.getParameter("cpf");
			List<Cliente> listaDeCliente = clienteService.buscaClientes(cpf);
			String clienteJson = gson.toJson(listaDeCliente);
			PrintWriter out = resp.getWriter();
			out.print(listaDeCliente);
			out.flush();

		}

		@Override
		protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String uri = req.getRequestURI();
			int indexParam = uri.lastIndexOf(CATACTERE_POSICAO_INICIAL);
			String cpf = uri.substring(indexParam + ACRESCENTA_UMA_POSICAO);

			String json = req.getReader().lines().collect(Collectors.joining());
			Cliente clienteRequest = gson.fromJson(json, Cliente.class);
			Cliente clienteResposnse = clienteService.alteraCadastro(cpf, clienteRequest);

			String clienteJson = gson.toJson(clienteResposnse);
			PrintWriter out = resp.getWriter();
			out.print(clienteJson);
			out.flush();
		}

		@Override
		protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String uri = req.getRequestURI();
			int indexParam = uri.lastIndexOf(CATACTERE_POSICAO_INICIAL);
			String cpf = uri.substring(indexParam + ACRESCENTA_UMA_POSICAO);
			clienteService.deletaCliente(cpf);
		}

	}
} */
