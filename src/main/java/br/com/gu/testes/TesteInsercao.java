package br.com.gu.testes;

import java.sql.SQLException;
import java.util.Calendar;

import br.com.gu.jdbc.ContatoDao;
import br.com.gu.model.Contato;

public class TesteInsercao {

	public static void main(String[] args) throws SQLException  {
		Contato gustavo = new Contato();
		gustavo.setNome("gustavo");
		gustavo.setEmail("gustavo@fainor.com");
		gustavo.setEndereco("sei nao");
		gustavo.setDataNascimento(Calendar.getInstance());
		
		ContatoDao dao  = new ContatoDao();		
		dao.adiciona(gustavo);
		
		System.out.println("contato: " + gustavo.getNome() + " Cadastrado!");

	}

}

