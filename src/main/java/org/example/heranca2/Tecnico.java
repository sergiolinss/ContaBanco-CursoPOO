package org.example.heranca2;

public class Tecnico extends Aluno2 {
    protected int registroProfissional;


    public void praticar() {
        System.out.println(this.nome + "Está em uma aula pŕatica");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
