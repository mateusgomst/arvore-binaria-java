/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package EstruturaDeDados;

import java.util.List;
import model.Alunos;

/**
 *
 * @author mateus-gomes
 */
public interface iArvore {
    public void incluir(String chave, Alunos aluno) throws Exception;
    public List<Alunos> OrdemCrescente(No raiz) throws Exception;
    public List<Alunos> OrdemDecrescente(No raiz) throws Exception;
    public List<Alunos> chamarOBuscarPorNomeOuMatricula(No raiz, String nomeOuMatricula) throws Exception;
}

