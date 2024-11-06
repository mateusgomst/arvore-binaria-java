/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaDeDados;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import model.Alunos;

/**
 *
 * @author mateus-gomes
 */
public class ArvoreBinaria implements iArvore{
    //atributos
    private No raiz = null;
    
    //metodos
    public ArvoreBinaria() {
        raiz = null;
    }
    
    public ArvoreBinaria(int elemento){
        raiz = new No();
    }
    
    public No getRaiz() {
        return this.raiz;
    }   
    
    private No inserirRecursivo(No raiz, String chave, Alunos aluno) throws Exception {
        
        chave = removerAcentos(chave).trim();;

        if(raiz == null)raiz = new No(chave, aluno);
        else if(chave.compareTo(removerAcentos(raiz.getChave())) < 0) raiz.setEsquerda(inserirRecursivo(raiz.getEsquerda(), chave, aluno));
        else if(chave.compareTo(removerAcentos(raiz.getChave())) > 0)raiz.setDireita(inserirRecursivo(raiz.getDireita(), chave, aluno));
        
        return raiz;
    }
   
    private void buscarPorNomeOuMatricula(No raiz, String chave, List<Alunos> alunosEncontrados) {
        if (raiz == null) return;
        String chaveBuscar = removerAcentos(chave);
        String chaveNo = removerAcentos(raiz.getChave());
        //ystem.out.println("Buscando: " + chaveBuscar + " - Chave Atual: " + chaveNo); // Debugging
        if (chaveNo.equals(chaveBuscar)) alunosEncontrados.add(raiz.getAluno());
        if (chaveBuscar.compareTo(chaveNo) < 0) buscarPorNomeOuMatricula(raiz.getEsquerda(), chaveBuscar, alunosEncontrados);
        if (chaveBuscar.compareTo(chaveNo) > 0) buscarPorNomeOuMatricula(raiz.getDireita(), chaveBuscar, alunosEncontrados);
        
    }

    private String removerAcentos(String str) {
        if (str == null) return null;
        // Normaliza a string, transformando "ã" em "a", por exemplo
        String normalized = Normalizer.normalize(str, Normalizer.Form.NFD);
        // Retornamos a string sem os acentos
        return normalized.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }
    
    //crescente
    public List<Alunos> obterAlunosOrdemCrescente(No raiz) {
        List<Alunos> alunosOrdenados = new ArrayList<>();
        if (raiz != null) {
            alunosOrdenados.addAll(obterAlunosOrdemCrescente(raiz.getEsquerda()));
            alunosOrdenados.add(raiz.getAluno()); 
            alunosOrdenados.addAll(obterAlunosOrdemCrescente(raiz.getDireita()));
        }
        return alunosOrdenados;
    }

   //decrescente
    public List<Alunos> obterAlunosOrdemDecrescente(No raiz) {
        List<Alunos> alunosOrdenados = new ArrayList<>();
        if (raiz != null) {
            
            alunosOrdenados.addAll(obterAlunosOrdemDecrescente(raiz.getDireita()));
            alunosOrdenados.add(raiz.getAluno());
            alunosOrdenados.addAll(obterAlunosOrdemDecrescente(raiz.getEsquerda()));
        }
        return alunosOrdenados;
    }


    @Override
    public void incluir(String chave, Alunos aluno) throws Exception {
        try {
            raiz = inserirRecursivo(raiz, chave, aluno);
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public List<Alunos> OrdemCrescente(No raiz) throws Exception {
        return obterAlunosOrdemCrescente(raiz);
    }

    @Override
    public List<Alunos> OrdemDecrescente(No raiz) throws Exception {
        return obterAlunosOrdemDecrescente(raiz);
    }

    @Override
    public List<Alunos> chamarOBuscarPorNomeOuMatricula(No raiz, String nomeOuMatricula) throws Exception {
        List<Alunos> alunosEncontrados = new ArrayList<>();
        buscarPorNomeOuMatricula(raiz, removerAcentos(nomeOuMatricula), alunosEncontrados);
        return alunosEncontrados;
    }

    
   
}
