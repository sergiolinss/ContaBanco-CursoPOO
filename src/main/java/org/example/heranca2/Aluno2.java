package org.example.heranca2;
// herança pra diferança, Aluno2 tem tudo que Pessoa2 tem e também uma Especialização
// Aluno2 é uma Especialização de pessoa, e Pessoa2 é uma generalização de Aluno
public class Aluno2 extends Pessoa2 {
    private int matricula;
    private String curso;

    public void pagarMensalidade (){
        System.out.println(" Você pagou a mensalidade do mês do aluno " + this.nome);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
