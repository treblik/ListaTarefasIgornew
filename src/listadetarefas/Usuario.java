 
package listadetarefas;

 
public class Usuario {
    private String email;
    private String senha;
    public void atribuirEmail(String email){
    this.email = email;
    }
    public String pegarEmail(){
        return email;
    }
    public void atribuirSenha(String senha){
    this.senha = senha;
    
    }
    public String pegarSenha(){
        return senha;
    }
    
}
