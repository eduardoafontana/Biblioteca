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
		
		if(titulo.isEmpty())
			return retorno;
		
		for (Livro livro : acervo) {
			if (livro.getTitulo().toLowerCase().indexOf(titulo.toLowerCase()) > -1) 
				retorno.add(livro);		
		}
		
		return retorno;
	}
}
