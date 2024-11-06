/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author mateusgomes
 */


public class CarregarAlunos {
    
    public static List<Alunos> carregarAlunos(String caminhoArquivo) throws IOException, NumberFormatException {
        List<Alunos> listaAlunos = new ArrayList<>();

        listaAlunos.clear();

        BufferedReader arquivo = new BufferedReader(new FileReader(caminhoArquivo));
        String linha;

        while ((linha = arquivo.readLine()) != null) {
            String[] dadosAluno = linha.split(";");
            listaAlunos.add(new Alunos(dadosAluno[0], dadosAluno[1], dadosAluno[2],
                    Integer.parseInt(dadosAluno[3]), dadosAluno[4], dadosAluno[5]));
        }

        arquivo.close();

        return listaAlunos;
    }
    
    

}


