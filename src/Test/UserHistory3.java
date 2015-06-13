package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import sistema.*;

public class UserHistory3 {
	@Test
	public void Emprestimo() {
		
		Livro livro = new Livro();
		livro.setTitulo("Livro para emprestimo");
		
		Emprestimo emprestimo = livro.solicitarEmprestimo();
		
		assertEquals(emprestimo.Livro, livro);
	}
}
