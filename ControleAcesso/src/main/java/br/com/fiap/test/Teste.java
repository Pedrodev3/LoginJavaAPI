package br.com.fiap.test;

import br.com.fiap.bo.UsuarioBO;
import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.to.UsuarioTO;

public class Teste {

	public static void main(String[] args) {
		
		// UsuarioDAO ud = new UsuarioDAO();
		
		UsuarioBO ub = new UsuarioBO();
		
		UsuarioTO ut = new UsuarioTO("Selva", "12345");
		
		// System.out.println("RESPOSTA: " + ud.loginDAO(ut).getLogin());

		System.out.println("RESPOSTA: " + ub.validacao(ut).getLogin());
	}

}
