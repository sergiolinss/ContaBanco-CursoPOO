package org.example.exercicioFinal;

public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    private int totalAvaliacoes;
    private int numAvaliacoes;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
        this.totalAvaliacoes = 1;
        this.numAvaliacoes = 1;

    }
    public double getMediaAvaliacoes(){
        if (numAvaliacoes == 0){
            return 0;
        } return (double) this.totalAvaliacoes / this.numAvaliacoes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
       this.totalAvaliacoes += avaliacao;
       this.numAvaliacoes++;
       this.avaliacao = this.totalAvaliacoes / this.numAvaliacoes;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        this.reproduzindo = true;

    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", avaliacao=" + avaliacao +
                ", views=" + views +
                ", curtidas=" + curtidas +
                ", reproduzindo=" + reproduzindo +
                ", totalAvaliacoes=" + totalAvaliacoes +
                ", numAvaliacoes=" + numAvaliacoes +
                ", mediaAvaliacoes=" + getMediaAvaliacoes() +
                '}';
    }
}
