public class Livro extends TaskComponente {
	private String titulo;
    private String autor;
    private String isbn;
    private int quantidadeEstoque;

    public Livro(String titulo, String autor, String isbn, int quantidadeEstoque) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    void mostraInfos() {
        System.out.println("Livro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Quantidade Disponível: " + quantidadeEstoque);
        System.out.println();
    }
    
    public void emprestar() {
        if (quantidadeEstoque > 0) {
            quantidadeEstoque--;
            System.out.println("Livro emprestado: " + titulo);
        } else {
            System.out.println("O livro não está disponível para empréstimo: " + titulo);
        }
    }

    public void devolver() {
        quantidadeEstoque++;
        System.out.println("Livro devolvido: " + titulo);
    }

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	private void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
}
