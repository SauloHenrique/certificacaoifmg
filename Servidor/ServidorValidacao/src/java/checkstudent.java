
import Model.Aluno;
import Services.AlunoService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.codehaus.jackson.map.ObjectMapper;
import validators.Validator;

/**
 *
 * @author Saulo
 */
@WebServlet(urlPatterns = {"/checkstudent"})
public class checkstudent extends HttpServlet {

    //metodo para geração do json utilizado como resposta
    public String generateJson(Aluno x){
        ObjectMapper mapper = new ObjectMapper();
        if(x != null){
            try {
                String jsonInString = mapper.writeValueAsString(x);
                return jsonInString;

            } catch (IOException ex) {
                return "{\"cod\":406}";
            }
        }else{
            return "{\"cod\":406}";
        }
    }
    
    
    //metodo para verificar cpf dos usuários (reduzir requisições erradas ao banco de dados)
    public int verificaCPF(String cpf[]){
        if(cpf == null || cpf.length == 0){
            return 422;
        }
        
        if(!Validator.verificaCPF(Validator.limpaCPF(cpf[0]))){
            return 400;
        }
        
        return 200;
    }
    
    
    //verificações do campo de senha
    public int verificaSenha(String senha[]){
        if(senha.length == 0){
            return 422;
        }
        
        if(senha[0].length() < 6){
            return 400;
        }
        return 200;
    }
    
    //metodo que efetua o meio de campo valida e repassa as buscas para os respectivos services
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        
        String cpf[] = request.getParameterValues("cpf");
        String senha[] = request.getParameterValues("senha");
        
        int codCPF = verificaCPF(cpf);
        int codSenha = verificaSenha(senha);
        
        String resposta = "";
        if(codCPF == 200 && codSenha == 200){
            //aqui podemos fazer uma requisição ao nosso AlunosServer
            AlunoService service = new AlunoService();
            Aluno temp = service.buscaAluno(cpf[0], senha[0]);
            resposta = generateJson(temp);
            
        }else{
            resposta = "{\"cod\":400,\"cpf\":"+codCPF+", \"senha\":"+codSenha+"}";
        }
        
        
        PrintWriter out = response.getWriter();
        out.print(resposta);
        out.flush();
    }

    //requisiç~eos tipo get pra este servlet
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
