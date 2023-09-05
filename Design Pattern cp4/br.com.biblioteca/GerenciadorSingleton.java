

import java.util.ArrayList;
import java.util.List;

public class GerenciadorSingleton {
	
	private static GerenciadorSingleton instance;
    private List<Livro> livros;
    private List<AlugaLivro> livrosEmprestados;

    private GerenciadorSingleton() {
    	livros = new ArrayList<>();
    	livrosEmprestados = new ArrayList<>();
    }

    public static GerenciadorSingleton getInstance() {
		if (instance == null) {
            instance = new GerenciadorSingleton();
        }
        return instance;
    }

    public void addLivro(Livro livro) {
    	livros.add(livro);
    }

    public List<Livro> getAllLivros() {
        return livros;
    }
    
    public void emprestarLivro(Livro livro, Aluno aluno) {
        if (livros.contains(livro) && livro.getQuantidadeEstoque() > 0) {
            livro.emprestar();
            AlugaLivro alugaLivro = new AlugaLivro(livro, aluno);
            aluno.addLivroAlugado(alugaLivro);
            livrosEmprestados.add(alugaLivro);
            System.out.println("Haviam " + (livro.getQuantidadeEstoque() + 1) + " livros no estoque");
            System.out.println("Agora há " + livro.getQuantidadeEstoque() + " livros em estoque");
        } else {
            System.out.println("O livro não está disponível para empréstimo: " + livro.getTitulo());
            System.out.println("Estoque: " + livro.getQuantidadeEstoque());
        }
    }

    public void devolverLivro(Livro livro, Aluno aluno) {
        AlugaLivro alugaLivro = new AlugaLivro(livro, aluno);
        if (aluno.getLivrosAlugados().contains(alugaLivro)) {
            livro.devolver();
            livrosEmprestados.remove(alugaLivro);
            aluno.removeLivroAlugado(alugaLivro);
        } else {
            System.out.println("O aluno não possui este livro emprestado: " + livro.getTitulo());
        }
    }
    
    public List<Livro> getLivrosDisponiveis() {
        List<Livro> livrosDisponiveis = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getQuantidadeEstoque() > 0) {
                livrosDisponiveis.add(livro);
            }
        }
        return livrosDisponiveis;
    }

    public List<AlugaLivro> getLivrosAlugados() {
        return livrosEmprestados;
    }
    
    public void mostrarInformacoesLivros() {
        System.out.println("Livros Disponíveis:");
        List<Livro> livrosDisponiveis = getLivrosDisponiveis();
        for (Livro livro : livrosDisponiveis) {
            System.out.println("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor() + ", Quantidade: " + livro.getQuantidadeEstoque());
        }

        System.out.println("\nLivros Alugados:");
        List<AlugaLivro> livrosAlugados = getLivrosAlugados();
        for (AlugaLivro alugaLivro : livrosAlugados) {
            Livro livro = alugaLivro.getLivro();
            Aluno aluno = alugaLivro.getAluno();
            System.out.println("Título: " + livro.getTitulo() + ", Aluno: " + aluno.getNome() + ", Quantidade: " + livro.getQuantidadeEstoque());
        }
    }
    
}
