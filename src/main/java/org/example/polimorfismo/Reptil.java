package org.example.polimorfismo;

public class Reptil extends Animal {

    protected String corEscama;

    @Override
    public void locomover() {
        System.out.println(" Rastejando ");

    }

    @Override
    public void alimentar() {
        System.out.println(" Comendo insetos ");
    }

    @Override
    public void emitirSom() {
        System.out.println(" Som de reptil ");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
