/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mateusgomes
 */

public class Alunos{
    private String matricula;
    private String nome;
    private String turno;
    private int periodo;
    private String enfase;
    private String curso;

    // Construtor padrão
    public Alunos() {
        this.matricula = "";
        this.nome = "";
        this.turno = "";
        this.periodo = 0;
        this.enfase = "";
        this.curso = "";
    }

    // Construtor com parâmetros
    public Alunos(String matricula, String nome, String turno, int periodo, String enfase, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.turno = turno;
        this.periodo = periodo;
        this.enfase = enfase;
        this.curso = curso;
    }

    // Getters e Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String getEnfase() {
        return enfase;
    }

    public void setEnfase(String enfase) {
        this.enfase = enfase;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}

