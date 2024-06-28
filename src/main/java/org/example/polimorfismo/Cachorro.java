package org.example.polimorfismo;

public class Cachorro extends Mamifero {

    public void enterrarOsso(){
        System.out.println(" Osso enterrado ");
    }
    public void abanarRabom(){
        System.out.println("Abanando rabo");
    }
    @Override
    public void emitirSom(){
        System.out.println("Au au");
    }
}
