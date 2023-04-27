public class fatura {

    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;   
            
    public fatura(String numero, String descricao, int quantidade, double preco) {
    
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    
    }
    
    public String getNumero(){
        
        return numero;
        
    }
    
    public void setNumero(String numero){
        
        this.numero = numero;
        
    }
    
    public String getDescricao() {
        
        return descricao;
        
    }

    public void setDescricao(String descricao) {
        
        this.descricao = descricao;
        
    }

    public int getQuantidade() {
        
        return quantidade;
    
    }
    

    public void setQuantidade(int quantidade) {
                
        this.quantidade = quantidade;
        
    }    
    
    public void setPreco(double preco) {
    if (preco >= 0.0) {
        this.preco = preco;
    } else {
        this.preco = 0.0;
    }
}
    
    public double getPreco() {
                
        return preco;
    
    }
    
    public double getTotalFatura() {
        double totalFatura = quantidade * preco;
        if (totalFatura < 0) {
            totalFatura = 0.0;
        }else{
        totalFatura = totalFatura;
        }
        return totalFatura;
    }    
}