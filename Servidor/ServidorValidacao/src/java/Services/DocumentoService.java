/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DAO.DocumentoDAO;
import Model.Documento;
import java.util.Vector;

/**
 *
 * @author Saulo
 */
public class DocumentoService {
    public static Documento buscaDocumentoCheckSum(String checkSum){
        //checagem da informação esta sendo repassada
        return DocumentoDAO.buscaDocumentoCheckSum(checkSum);
    }
    
    public static Vector<Documento> buscaDocumentoAluno(String cpf){
        //checagem do cpf que esta sendo repassado
        return DocumentoDAO.buscaDocumentoAluno(cpf);
    }
    
    public static void cadastraDocumento(Documento novoDocumento){
        
    }
    
}
