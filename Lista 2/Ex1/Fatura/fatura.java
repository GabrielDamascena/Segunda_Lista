package Fatura;

public class fatura {
    
    //Criando as variaveis
    public String numeroFat;
    public String descricao;
    public int QtdItem;
    public double PrecoItem;

    
    public fatura (String numeroFat, String descricao, int QtdItem, double PrecoItem){
        this.numeroFat = numeroFat;
        this.descricao = descricao;
        this.QtdItem = QtdItem;
        this.PrecoItem = PrecoItem;
        
        if(this.PrecoItem < 0){
            this.PrecoItem = 0;
        } else {
            this.PrecoItem = PrecoItem;
        }
    }

    public void getTotalFatura (){
        double getTotalFatura = QtdItem * PrecoItem;
    }

    
    //Insereindo os sets e gets
    public String getNumeroFat() {
        return numeroFat;
    }

    public void setNumeroFat(String numeroFat) {
        this.numeroFat = numeroFat;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdItem() {
        return QtdItem;
    }

    public void setQtdItem(int QtdItem) {
        this.QtdItem = QtdItem;
    }

    public double getPrecoItem() {
        return PrecoItem;
    }

    public void setPrecoItem(double PrecoItem) {
        this.PrecoItem = PrecoItem;
    }
}
