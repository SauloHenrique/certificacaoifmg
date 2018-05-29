/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validators;

/**
 *
 * @author Saulo
 */
public class Validator {

    public static String limpaCPF(String cpf){
        return cpf.replace(".", "").replace("-", "").replace(" ", "");
    }
    
    public static boolean verificaCPF(String cpf) {
        
        if(cpf.length() == 11){
            if (cpf.equals("00000000000") || cpf.equals("11111111111")
                    || cpf.equals("22222222222") || cpf.equals("33333333333")
                    || cpf.equals("44444444444") || cpf.equals("55555555555")
                    || cpf.equals("66666666666") || cpf.equals("77777777777")
                    || cpf.equals("88888888888") || cpf.equals("99999999999")) {
                return false;
            }

            //separando os números do cpf
            char valores[] = cpf.toCharArray();
            int valoresI[] = new int[11];
            
            for(int i = 0 ;i < 11;i++){
                valoresI[i] = Integer.parseInt(valores[i]+"");
            }
            
            //aqui agora vem os calculos..
            //#parte 1
            int soma = 0;
            int peso = 10;
            for(int i = 0; i < 9;i++){
                soma += valoresI[i] * peso;
                peso--;
            }
            
            soma = 11 - (soma % 11);
            if(soma > 9){
                soma = 0;
            }
            
            if(soma != valoresI[9]){
                return false;
            }
            
            //segunda etapa do calculo
            soma = 0;
            peso = 11;
            for(int i = 0; i < 10;i++){
                soma += valoresI[i] * peso;
                peso--;
            }
            
            soma = 11 - (soma % 11);
            if(soma > 9){
                soma = 0;
            }
            
            if(soma != valoresI[10]){
                return false;
            }
            
            return true;
        }else{
            return false;
        }
    }
}
