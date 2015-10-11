package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		testeExcluir();
		

	}
	
	public static void testeExcluir(){
		//criando usuário
		Usuario usu = new Usuario();
		usu.setId(4);
		//excluir usuário
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);
		System.out.println("Excluido com Sucesso");
	}
	
	public static void testealterar(){
		//criando usuário
		Usuario usu = new Usuario();
		usu.setId(4);
		usu.setNome("Eunice a linda");
		usu.setLogin("nicinha");
		usu.setSenha("123456789");
	
		//cadastrar usuário
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);
		System.out.println("Alterado com Sucesso");
	}
	
	public static void testeCadastrar(){
		//criando usuário
		Usuario usu = new Usuario();
		usu.setNome("Eunice");
		usu.setLogin("nice");
		usu.setSenha("852");
	
		//cadastrar usuário
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);
		System.out.println("cadastrado com Sucesso");
	}

	
	
}
