package Fatura;

import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {
        
        //add scanner
          Scanner sc = new Scanner(System.in);
          
        //construtor padr�o
        fatura c1 = new fatura ("1234", "Fatura1", 5, 29.9);

        
        System.out.println("Insira o n�mero da fatura:");
        String numeroFat = sc.nextLine();
        c1.setNumeroFat(numeroFat);
        
        System.out.println("Insira uma descri��o:");
        String descricao = sc.nextLine();
        c1.setDescricao(descricao);
        
        System.out.println("Insira a quantidade de itens:");
        int QtdItem = sc.nextInt();
        c1.setQtdItem(QtdItem);
        
        System.out.println("Insira o pre�o por item:");
        double PrecoItem = sc.nextDouble();
        c1.setPrecoItem(PrecoItem);
        
        double getTotalFatura = QtdItem * PrecoItem;
        
        
        System.out.println("Confira os dados:\nNumero da Fatura: " + c1.getNumeroFat()
                + "\nDescri��o: " + c1.getDescricao()
                + "\nQtd. Itens: " + c1.getQtdItem()
                + "\nPre�o por item: " + c1.getPrecoItem()
                + "\nValor da fatura: " + getTotalFatura
        );
    }
    
}
