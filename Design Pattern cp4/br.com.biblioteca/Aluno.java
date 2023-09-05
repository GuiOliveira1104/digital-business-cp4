

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
    private int id;
    private List<AlugaLivro> livrosAlugados;

    public Aluno(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.livrosAlugados = new ArrayList<>();
    }
    
    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public List<AlugaLivro> getLivrosAlugados() {
        return livrosAlugados;
    }

    public void addLivroAlugado(AlugaLivro alugaLivro) {
        livrosAlugados.add(alugaLivro);
    }

    public void removeLivroAlugado(AlugaLivro alugaLivro) {
        livrosAlugados.remove(alugaLivro);
    }
}
