package Services;

import DAO.AlunoDAO;
import Model.Aluno;

/**
 *
 * @author Saulo
 */
public class AlunoService {
    public Aluno buscaAluno(String cpf, String senha){
        AlunoDAO dao = new AlunoDAO();
        return dao.buscaAluno(cpf, senha);
    }
}
