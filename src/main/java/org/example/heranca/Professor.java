package org.example.heranca;

public class Professor extends PessoaEscola {
    private String especialidade;
    private float salario;



    public void receberAumento(float aumento) {

        this.setSalario(this.salario + aumento);
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
