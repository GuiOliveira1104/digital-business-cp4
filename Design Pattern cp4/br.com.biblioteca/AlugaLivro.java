

import java.util.Objects;

public class AlugaLivro {
    private Livro livro;
    private Aluno aluno;

    public AlugaLivro(Livro livro, Aluno aluno) {
        this.livro = livro;
        this.aluno = aluno;
    }

    public Livro getLivro() {
        return livro;
    }

    public Aluno getAluno() {
        return aluno;
    }
	
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlugaLivro that = (AlugaLivro) o;
        return livro.equals(that.livro) && aluno.equals(that.aluno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livro, aluno);
    }

    
}
