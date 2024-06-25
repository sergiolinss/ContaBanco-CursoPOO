package org.example;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {

        System.out.println("= DETALHES DO LIVRO = ");
        System.out.println("Título: " + this.getTitulo() + ", Autor: " + this.getAutor() + ", Total de páginas: " + this.getTotalPaginas());
        System.out.println(" = detalhes adicionais = ");
        System.out.println("Página atual: " + this.getPaginaAtual() + ", Está aberto? " + this.getAberto());
        System.out.println("Leitor atual: " + this.leitor.getNome());
        return "";
    }

    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.leitor = leitor;
        this.aberto = false;
        this.paginaAtual = 0;

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
    public void folhear(int pagina) {
        if (pagina > this.getTotalPaginas()) {
            this.setPaginaAtual(0);
            System.out.println(" Você excedeu o limite de paginas.");
        } else {
            this.paginaAtual = pagina;
        }

    }

    @Override
    public void avancarPag() {
        this.setPaginaAtual(getPaginaAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPaginaAtual(getPaginaAtual() - 1);
    }
}
