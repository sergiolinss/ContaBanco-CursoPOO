package org.example.heranca2;

public class Professor2 extends Pessoa2{
    protected String especialidade;
    protected float salario;

    public void receberAumento( float aumento){
        this.salario =+ aumento;

        System.out.println(" O professor " + this.nome + " recebeu aumento! ");
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
