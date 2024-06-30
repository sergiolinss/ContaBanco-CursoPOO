package org.example;

import org.example.heranca.Aluno;
import org.example.heranca.Funcionario;
import org.example.heranca.PessoaEscola;
import org.example.heranca.Professor;
import org.example.heranca2.Aluno2;
import org.example.heranca2.Bolsista2;
import org.example.heranca2.Professor2;
import org.example.heranca2.Visitante2;
import org.example.polimorfismo.*;
import org.example.polimorfismo2.Cachorro2;

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
        lutadores[1].Status();

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

        PessoaEscola p1 = new PessoaEscola();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("joao");
        p2.setNome("maria");
        p3.setNome("claudio");
        p4.setNome("fabiana");
        p1.setSexo("masculino");
        p4.setSexo("feminino");
        p2.setIdade(18);
        p2.setCurso("informatica");
        p3.setSalario(2500.50f);
        p4.setSetor("estoque");
        p3.receberAumento(400f);


        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        Visitante2 v1 = new Visitante2();
        v1.setNome("Joao");
        v1.setIdade(22);
        v1.setSexo("m");
        System.out.println(v1.toString());
        Aluno2 a1 = new Aluno2();
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("informatica");
        a1.setIdade(16);
        a1.setSexo("m");
        a1.pagarMensalidade();
        Bolsista2 b1 = new Bolsista2();
        b1.setMatricula(2222);
        b1.setNome("Mateus");
        b1.setBolsa(12.5f);
        b1.setSexo("m");
        b1.pagarMensalidade();
        Professor2 p1 = new Professor2();
        p1.setNome("Carlos");
        p1.setSalario(1500f);
        p1.receberAumento(230f);
        Mamifero m = new Mamifero();
        Ave a = new Ave();
        m.setPeso(35.3f);
        m.setCorPelo("marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        a.locomover();
        Canguru c = new Canguru();
        c.locomover();
        Arara arara = new Arara();
        arara.locomover();
        Jabuti j = new Jabuti();
        j.locomover();
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom(); */

        Cachorro2 c = new Cachorro2();
        c.reagir("Olá");
        c.reagir("vai apanhar");
        c.reagir(11, 45);
        c.reagir(21, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);

    }
}