package Pessoa;


public class Main {

    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa(14, 3,1879,"Albert Einstein");
        Pessoa pessoa2 = new Pessoa(4, 1,1643,"Isaac Newton");

        pessoa1.calcularIdade(21, 04, 2023);
        pessoa2.calcularIdade(21, 04, 2023);

        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
    }
    
}
