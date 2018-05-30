/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Saulo
 */
public class Aluno {
    private String nome;
    private String curso;
    private boolean ativo;
    private int ano;
    private int semestre;
    private String numeroMatricula;
    private String senha;
    private String cpf;
    
    public Aluno() {
    }

    public Aluno(String nome, String curso, boolean ativo, int ano, int semestre, String numeroMatricula,String senha,String cpf) {
        this.nome = nome;
        this.curso = curso;
        this.ativo = ativo;
        this.ano = ano;
        this.semestre = semestre;
        this.numeroMatricula = numeroMatricula;
        this.senha = senha;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    /*public String toString(){
        
    }*/

}
