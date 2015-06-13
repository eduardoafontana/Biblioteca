package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sistema.*;;

public class UserHistory1 {

	private Livro livro;
	
	@Before
	public void setUp() {
		livro = new Livro();
		livro.setTitulo("Título do livro");
	}

	@Test
	public void AdicionarLivroNoAcervo() {
		Acervo.Adicionar(livro);
		
		assertEquals(Acervo.Quantidade(), 1);
	}

}
