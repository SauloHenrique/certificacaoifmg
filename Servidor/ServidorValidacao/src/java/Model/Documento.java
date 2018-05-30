/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import java.util.Date;

/**
 *
 * @author Saulo
 */
public class Documento {
    private long id;
    private String nomeArquivo;
    private Aluno aluno;
    private Date dataEmissao;
    private Date dataVencimento;
    private String textoPrincipal;
    private File arquivoDisco;
    private File anexo;
    private String checkSum;
    private String tipoArquivo;

    public Documento(long id, String nomeArquivo, Aluno aluno, Date dataEmissao, String textoPrincipal, File arquivoDisco, File anexo, String checkSum, String tipoArquivo) {
        this.id = id;
        this.nomeArquivo = nomeArquivo;
        this.aluno = aluno;
        this.dataEmissao = dataEmissao;
        this.textoPrincipal = textoPrincipal;
        this.arquivoDisco = arquivoDisco;
        this.anexo = anexo;
        this.checkSum = checkSum;
        this.tipoArquivo = tipoArquivo;
    }

    public Documento(String nomeArquivo, Aluno aluno, Date dataEmissao, String textoPrincipal, String checkSum, String tipoArquivo) {
        this.nomeArquivo = nomeArquivo;
        this.aluno = aluno;
        this.dataEmissao = dataEmissao;
        this.textoPrincipal = textoPrincipal;
        this.checkSum = checkSum;
        this.tipoArquivo = tipoArquivo;
    }

    public Documento(long id, String nomeArquivo, Aluno aluno, Date dataEmissao, Date dataVencimento, String textoPrincipal, File arquivoDisco, File anexo, String checkSum, String tipoArquivo) {
        this.id = id;
        this.nomeArquivo = nomeArquivo;
        this.aluno = aluno;
        this.dataEmissao = dataEmissao;
        this.dataVencimento = dataVencimento;
        this.textoPrincipal = textoPrincipal;
        this.arquivoDisco = arquivoDisco;
        this.anexo = anexo;
        this.checkSum = checkSum;
        this.tipoArquivo = tipoArquivo;
    }

    
    
    public Documento() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getTextoPrincipal() {
        return textoPrincipal;
    }

    public void setTextoPrincipal(String textoPrincipal) {
        this.textoPrincipal = textoPrincipal;
    }

    public File getArquivoDisco() {
        return arquivoDisco;
    }

    public void setArquivoDisco(File arquivoDisco) {
        this.arquivoDisco = arquivoDisco;
    }

    public File getAnexo() {
        return anexo;
    }

    public void setAnexo(File anexo) {
        this.anexo = anexo;
    }

    public String getCheckSum() {
        return checkSum;
    }

    public void setCheckSum(String checkSum) {
        this.checkSum = checkSum;
    }

    public String getTipoArquivo() {
        return tipoArquivo;
    }

    public void setTipoArquivo(String tipoArquivo) {
        this.tipoArquivo = tipoArquivo;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    
}
