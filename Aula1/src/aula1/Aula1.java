package aula1;

import java.util.Scanner;


public class Aula1 {


    public static void main(String[] args) {
        int ano=0;
        String nome="";
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um nome");
        nome = scan.nextLine();
        
        System.out.println("Informe o ano de nascimento");
        ano = scan.nextInt();
        
        
        int idade = 2020 - ano;
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        
    }
    

}
