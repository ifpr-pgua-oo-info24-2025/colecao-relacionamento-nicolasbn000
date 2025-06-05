package com.biblioteca;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> biblioteca = new ArrayList<>();

        Autor autor1 = new Autor("Machado de Assis", "Brasileira");
        Autor autor2 = new Autor("Stephenie Meyer", "Americana");
        Autor autor3 = new Autor("Robert C. Martin", "Americana");
        Autor autor4 = new Autor("Colleen Hoover", "Americana");

        LivroFisico livro1 = new LivroFisico("Dom Casmurro", 1899, autor1, 256);
        LivroFisico livro2 = new LivroFisico("1984", 1949, autor3, 328);

        LivroDigital livro3 = new LivroDigital("Crepusculo", 2008, autor2, 1.5);
        LivroDigital livro4 = new LivroDigital("É Assim Que Acaba", 2016, autor4, 2.0);

        biblioteca.add(livro1);
        biblioteca.add(livro2);
        biblioteca.add(livro3);
        biblioteca.add(livro4);

                biblioteca.forEach(livro -> {
            livro.exibirDetalhes();
            System.out.println(); 
        });
    }
}
