package Fatura;

import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {
        
        //add scanner
          Scanner sc = new Scanner(System.in);
          
        //construtor padrão
        fatura c1 = new fatura ("1234", "Fatura1", 5, 29.9);

        
        System.out.println("Insira o número da fatura:");
        String numeroFat = sc.nextLine();
        c1.setNumeroFat(numeroFat);
        
        System.out.println("Insira uma descrição:");
        String descricao = sc.nextLine();
        c1.setDescricao(descricao);
        
        System.out.println("Insira a quantidade de itens:");
        int QtdItem = sc.nextInt();
        c1.setQtdItem(QtdItem);
        
        System.out.println("Insira o preço por item:");
        double PrecoItem = sc.nextDouble();
        c1.setPrecoItem(PrecoItem);
        
        double getTotalFatura = QtdItem * PrecoItem;
        
        
        System.out.println("Confira os dados:\nNumero da Fatura: " + c1.getNumeroFat()
                + "\nDescrição: " + c1.getDescricao()
                + "\nQtd. Itens: " + c1.getQtdItem()
                + "\nPreço por item: " + c1.getPrecoItem()
                + "\nValor da fatura: " + getTotalFatura
        );
    }
    
}
