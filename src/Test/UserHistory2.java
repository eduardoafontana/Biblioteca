package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import sistema.*;

public class UserHistory2 {

	
	
	@BeforeClass
	public static void setUp() {
		Livro livro1 = new Livro();
		livro1.setTitulo("50 tons de Java");
		
		Acervo.Adicionar(livro1);
		
		Livro livro2 = new Livro();
		livro2.setTitulo("Livro 2");
		
		Acervo.Adicionar(livro2);
		
		Livro livro3 = new Livro();
		livro3.setTitulo("Livro 3");
		
		Acervo.Adicionar(livro3);
	}	
	
	@Test
	public void PesquisarLivroNoAcervoEncontra0Livros() {
		ArrayList<Livro> listaDelivros = Acervo.Pesquisar("");
		assertEquals(listaDelivros.size(), 0);		
	}

	@Test
	public void PesquisarLivroNoAcervoEncontra1Livro() {
		ArrayList<Livro> listaDelivros = Acervo.Pesquisar("50 tons de Java");
		assertEquals(listaDelivros.size(), 1);		
	}
	
	@Test
	public void PesquisarLivroNoAcervoEncontra2Livros() {
		ArrayList<Livro> listaDelivros = Acervo.Pesquisar("Livro");
		assertEquals(listaDelivros.size(), 2);
	}	

}
