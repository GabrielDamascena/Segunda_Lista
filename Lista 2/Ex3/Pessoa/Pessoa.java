
package Pessoa;

public class Pessoa {
    
    int idade;
    int dia;
    int mes;
    int ano;
    String nome;
    
    public Pessoa(int dia, int mes, int ano, String nome) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.nome = nome;
    }
    
    void calcularIdade(int diax, int mesx, int anox){
        if (mes > mesx){
            idade = anox - ano - 1;
        } else if (mes == mesx) {
            if (dia > diax){
                idade = anox - ano - 1;
            } else{
                idade = anox - ano;
            }
        } else {
            idade = anox - ano;
        }
    }
    
    int informaIdade(){
        return idade;
    }
    
    public String toString() {
        return "Nome: " + nome + ", idade: " + idade + "\nData de nascimento: " + dia + "/" + mes + "/" + ano + "\n";
    }
    
    
}
