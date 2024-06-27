package org.example.heranca;

public class Aluno extends PessoaEscola {
    private int matricula;
    private String curso;



    public void cancelarMatricula(int matricula){
        System.out.println(" Matrícula será cancelada");

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
