

import java.util.ArrayList;
import java.util.List;

public class GerenciadorLivrosEmprestados extends TaskComponente {
    private static GerenciadorLivrosEmprestados instance;
    private List<AlugaLivro> livrosEmprestados;

    private GerenciadorLivrosEmprestados() {
        livrosEmprestados = new ArrayList<>();
    }

    public static GerenciadorLivrosEmprestados getInstance() {
        if (instance == null) {
            instance = new GerenciadorLivrosEmprestados();
        }
        return instance;
    }

	public void emprestarLivro(Livro livro, Aluno aluno) {
        AlugaLivro alugaLivro = new AlugaLivro(livro, aluno);
        livrosEmprestados.add(alugaLivro);
    }

    public void devolverLivro(Livro livro, Aluno aluno) {
        AlugaLivro alugaLivro = new AlugaLivro(livro, aluno);
        livrosEmprestados.remove(alugaLivro);
    }

    public List<AlugaLivro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

	@Override
	void mostraInfos() {
		System.out.println("GerenciadorLivrosEmprestados [livrosEmprestados=" + livrosEmprestados + "]");
	}
}
