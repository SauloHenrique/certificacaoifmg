/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Aluno;
import Model.Documento;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author Saulo
 */
public class DocumentoDAO {
    
    public static Documento buscaDocumentoCheckSum(String checkSum){
        
        //neste ponto deve ocorrer a busca através da execução da SQL junto ao banco dedados do projeto
        Documento temp = new Documento("09346938625", new Aluno(), new Date(), "Declaração para atestar...", 
                "jusudfjuswiheouoq688", "declaracao");
        
        return temp;
    }
    
    public static Vector<Documento> buscaDocumentoAluno(String cpf){
        
        //neste ponto deve ocorrer a busca através da execução da SQL junto ao banco dedados do projeto
        Vector<Documento> resultado = new Vector<>();
        
        return resultado;
    }
    
}
