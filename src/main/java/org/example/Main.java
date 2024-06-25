package org.example;

import org.example.UEC.Luta;
import org.example.UEC.Lutador;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /* Lutador[] lutadores = new Lutador[6];
        lutadores[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        lutadores[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        lutadores[2] = new Lutador("Snapshadow", "Eua", 35, 1.65f, 80.9f, 12, 2, 1);
        lutadores[3] = new Lutador("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
        lutadores[4] = new Lutador("Ufucobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        lutadores[5] = new Lutador("Nerdard", "Eua", 30, 1.81f, 105.7f, 12, 2, 4);


        Luta UEC01 = new Luta();
        UEC01.marcarLuta(lutadores[0], lutadores[0]);
        UEC01.lutar();
        lutadores[0].Status();
        lutadores[1].Status(); */

        Pessoa[] pessoas = new Pessoa[2];
        Livro[] livros = new  Livro[3];

        pessoas[0] = new Pessoa("Carlos", 20, "masculino");
        pessoas[1] = new Pessoa("Maria",25, "feminino");

        livros[0] = new Livro("Aprendendo Java", "José", 300, pessoas[0]);
        livros[1] = new Livro("POO", "André souza", 500, pessoas[1]);
        livros[2] = new Livro("Java avançado", "Carvalho", 100, pessoas[0]);
        livros[0].abrir();
        livros[0].folhear(24);
        livros[0].avancarPag();
        System.out.println(livros[0].detalhes());
        System.out.println(livros[1].detalhes());



    }
}