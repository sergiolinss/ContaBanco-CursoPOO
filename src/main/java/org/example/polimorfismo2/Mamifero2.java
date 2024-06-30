package org.example.polimorfismo2;

public class Mamifero2 extends Animal2 {
    protected String corPelo;

    @Override
    public void emitirSom() {
        System.out.println(" Som de mamífero ");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
