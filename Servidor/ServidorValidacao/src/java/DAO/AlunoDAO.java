/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Aluno;
import java.util.Vector;

/**
 *
 * @author Saulo
 */
public class AlunoDAO {
    private Vector<Aluno> bancoAluno;

    public AlunoDAO() {
        this.bancoAluno = new Vector<>();
        populaBancoMOC();
    }
    
    public void populaBancoMOC(){
        this.bancoAluno.add(new Aluno("Saulo", "Informática", true, "skdjfhjdscvbdshvbhdsbvhdsbhjvsih",
                2018, 1, "00001", "123456789", "09346938625"));
        this.bancoAluno.add(new Aluno("Mauro", "Informática", true, "sdfgedrhtrfhjyhkjyggdfbvrtjgyyty",
                2017, 2, "00002", "684835514", "12345678910"));
        this.bancoAluno.add(new Aluno("Seu José", "Nutrição", false, "gkjjnkgfrijkojdnkfhdhfhdkjgjbnh",
                2010, 1, "00011", "5665561551", "98765432178"));
        this.bancoAluno.add(new Aluno("Carolina", "Biologia", true, "dftrhbgchfnhsndknjhsbghvbdsjknvk",
                2018, 2, "00456", "58468626", "45678912365"));
        this.bancoAluno.add(new Aluno("João", "Informática", false, "fkghuiedroirkdnjkvgbhjxdfbjvbjrb",
                2019, 2, "00020", "123456789", "12378945678"));
        this.bancoAluno.add(new Aluno("Karen", "Policia", true, "ckfbgidernkjuvhswbkjnefdndshgvbrjrh",
                2018, 1, "00001", "123456789", "14785236998"));
    }
    
    
    
    public Aluno buscaAluno(String cpf, String senha){
        for(Aluno a:bancoAluno){
            if(cpf.equalsIgnoreCase(a.getCpf()) && senha.equals(a.getSenha())){
                return a;
            }
        }
        
        return null;
    }
    
}
