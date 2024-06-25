package org.example;

import java.util.Random;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    public void detalhes(){
        System.out.println("= DETALHES DO LIVRO = ");
        System.out.println("Título: " + this.getTitulo() + " Autor: " + this.getAutor() + " Total de páginas: " + this.getTotalPaginas());
        System.out.println(" = detalhes adicionais = ");
        System.out.println("Página atual: " + this.getPaginaAtual() + " Está aberto? " + this.getAberto());
        System.out.println("Leitor atual: " + this.getLeitor());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
     this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear() {

        if (this.getAberto()){
            Random aleatorio = new Random();
            int totalPaginas = getTotalPaginas();
            int paginaAleatoria = aleatorio.nextInt(totalPaginas) + 1;
            this.setPaginaAtual(paginaAleatoria);
            System.out.println(" Voce folheou para a pagina " + paginaAleatoria);
        } else{
            System.out.println("O livro fechado não tem como folhear ");
        }
    }

    @Override
    public void avancarPag() {
        this.setPaginaAtual(getPaginaAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPaginaAtual(getPaginaAtual() -1);
    }
}
