package com.biblioteca;


public class LivroDigital extends Livro {
    private double tamanhoDoArquivoMB;

    public LivroDigital(String titulo, int anoPublicacao, Autor autor, double tamanhoDoArquivoMB) {
        super(titulo, anoPublicacao, autor);
        this.tamanhoDoArquivoMB = tamanhoDoArquivoMB;
    }

    public double getTamanhoDoArquivoMB() {
        return tamanhoDoArquivoMB;
    }

    public void setTamanhoDoArquivoMB(double tamanhoDoArquivoMB) {
        this.tamanhoDoArquivoMB = tamanhoDoArquivoMB;
    }

    
    public void exibirDetalhes() {
        System.out.println("Livro Digital - Título: " + getTitulo() + ", Ano: " + getAnoPublicacao() + ", Tamanho: " + tamanhoDoArquivoMB + "MB");
        System.out.println("Autor: " + getAutor().getNome() + ", Nacionalidade: " + getAutor().getNacionalidade());
    }
}
