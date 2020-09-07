/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadetarefas;

import java.util.Scanner;

/**
 *
 * @author Regikillbert
 */
public class ListaDeTarefas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("==================Cadastro de Usuários===============");
        System.out.print("Digite o email");
        String email = scanner.nextLine();
        System.out.print("Digite a senha");
        String senha = scanner.nextLine();
        
        Usuario u = new Usuario();
       
        u.atribuirEmail(email);
   
        u.atribuirSenha(senha);
        
       
        System.out.println("==================Cadastro de Usuários U2===============");
        System.out.print("Digite o email de U2");
         email = scanner.nextLine();
        System.out.print("Digite a senha de U2");
         senha = scanner.nextLine();
         Usuario u2 = new Usuario();
        u2.atribuirEmail(email);
   
        u2.atribuirSenha(senha);
        
        System.out.println("O email cadastrado foi u :"+ u.pegarEmail());
        System.out.println("A senha cadastrada foi u:"+ u.pegarSenha());
         System.out.println("O email cadastrado foi u2 :"+ u2.pegarEmail());
        System.out.println("A senha cadastrada foi u2:"+ u2.pegarSenha());
    }
    
}
