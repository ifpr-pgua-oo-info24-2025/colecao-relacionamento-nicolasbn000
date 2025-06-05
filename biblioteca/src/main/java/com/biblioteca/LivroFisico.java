package com.biblioteca;

public class LivroFisico extends Livro {
    private int numeroDePaginas;

    public LivroFisico(String titulo, int anoPublicacao, Autor autor, int numeroDePaginas) {
        super(titulo, anoPublicacao, autor);
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    
    public void exibirDetalhes() {
        System.out.println("Livro Físico - Título: " + getTitulo() + ", Ano: " + getAnoPublicacao() + ", Páginas: " + numeroDePaginas);
        System.out.println("Autor: " + getAutor().getNome() + ", Nacionalidade: " + getAutor().getNacionalidade());
    }
}
