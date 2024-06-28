package org.example.polimorfismo;

public class Peixe extends Animal {

    protected String corEscama;

    public void soltarBolha() {
        System.out.println(" Soltando bolhas ");
    }

    @Override
    public void locomover() {
        System.out.println(" Nadando ");

    }

    @Override
    public void alimentar() {
        System.out.println(" Comendo algas ");
    }

    @Override
    public void emitirSom() {
        System.out.println(" Peixe não faz som ");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
