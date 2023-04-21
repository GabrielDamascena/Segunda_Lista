package Empregado;

import java.util.Scanner;


public class EmpregadoTeste {

    public static void main(String[] args) {
        //Criando o scanner
        Scanner sc = new Scanner(System.in);
        
        //Objeto 1
        Empregado pessoa1 = new Empregado("Miguel","Medeiros",25000);
        
        //Objeto 2
        Empregado pessoa2 = new Empregado("Beni","Assunção",25000);
        
        //Mostrando salário 
        System.out.println(pessoa1.getSalario());
        System.out.println(pessoa2.getSalario());
        
        pessoa1.aumento();
        pessoa2.aumento();
        
        //MOstrando salário depois do aumento
        System.out.println(pessoa1.getSalario());
        System.out.println(pessoa2.getSalario());
    }
    
}
