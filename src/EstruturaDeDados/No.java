/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaDeDados;

import model.Alunos;

/**
 *
 * @author mateus-gomes
 */

public class No {
    // Atributos
    private String chave;
    private No esquerda;
    private No direita;
    private Alunos aluno;
    
    // Construtor padrão
    public No() {
        this.chave = "";
        this.esquerda = null;
        this.direita = null;
        this.aluno = null;
    }
    
    // Construtor com chave
    public No(String chave) {
        this.chave = chave;
        this.esquerda = null;
        this.direita = null;
        this.aluno = null;
    }

    // Construtor com chave e aluno
    public No(String chave, Alunos aluno) {
        this.chave = chave;
        this.aluno = aluno;
        this.esquerda = null;
        this.direita = null;
    }

    // Getters e Setters
    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }

    public Alunos getAluno() {
        return aluno;
    }

    public void setAluno(Alunos aluno) {
        this.aluno = aluno;
    }
}
