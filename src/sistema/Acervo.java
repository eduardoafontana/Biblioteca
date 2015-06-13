package sistema;
import java.util.ArrayList;

public class Acervo {
	private static ArrayList<Livro> acervo;

	public static boolean Adicionar(Livro livro) {
		if(acervo == null)
			acervo = new ArrayList<Livro>();
		
		acervo.add(livro);
		
		return true;
	}
	
	public static int Quantidade() {
		return acervo.size();
	}

	public static ArrayList<Livro> Pesquisar(String titulo) {
		ArrayList<Livro> retorno = new ArrayList<Livro>();
		
		for (Livro livros : acervo) {
			if (livros.getTitulo() == titulo) 
				retorno.add(livros);		
		}
		
		return retorno;
	}
}
