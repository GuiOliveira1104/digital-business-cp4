

import java.util.List;

public class ProgramaBiblioteca {

	public static void main(String[] args) {
		
        Livro livro1 = new Livro("Livro 1", "Autor 1", "ISBN1", 5);
        Livro livro2 = new Livro("Livro 2", "Autor 2", "ISBN2", 3);
        Livro livro3 = new Livro("Livro 3", "Autor 3", "ISBN1", 1);
        Livro livro4 = new Livro("Livro 4", "Autor 4", "ISBN2", 8);

        Aluno aluno1 = new Aluno("Aluno 1", 1);
        Aluno aluno2 = new Aluno("Aluno 2", 2);
        Aluno aluno3 = new Aluno("Aluno 3", 3);
        Aluno aluno4 = new Aluno("Aluno 4", 4);

        GerenciadorSingleton livraria = GerenciadorSingleton.getInstance();
        
        livraria.addLivro(livro1);
        livraria.addLivro(livro2);
        livraria.addLivro(livro3);
        livraria.addLivro(livro4);
        
        System.out.println("-=--=-=-=--=-");
        livraria.emprestarLivro(livro3, aluno1);
        livraria.emprestarLivro(livro4, aluno2);
        livraria.emprestarLivro(livro3, aluno3);
        livraria.emprestarLivro(livro2, aluno4);
        livraria.emprestarLivro(livro4, aluno1);
        livraria.emprestarLivro(livro4, aluno2);
        livraria.emprestarLivro(livro2, aluno3);
        livraria.emprestarLivro(livro1, aluno4);
        System.out.println("-=--=-=-=--=-");
        livraria.devolverLivro(livro1, aluno1);
        livraria.devolverLivro(livro2, aluno3);
        livraria.devolverLivro(livro4, aluno2);
        System.out.println("-=--=-=-=--=-");
        livraria.mostrarInformacoesLivros();
        
	}

}
