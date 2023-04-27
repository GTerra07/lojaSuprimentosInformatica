public class main { //Fatura teste
    
    public static void main(String[] args) {
        
        fatura fatura1 = new fatura("001", "Teclado", 2, 50.0);
        System.out.println("Número: " + fatura1.getNumero());
        System.out.println("Descrição: " + fatura1.getDescricao());
        System.out.println("Quantidade: " + fatura1.getQuantidade());
        System.out.println("Preço: " + fatura1.getPreco());
        System.out.println("Total da fatura: " + fatura1.getTotalFatura());

        System.out.println();

        fatura fatura2 = new fatura("002", "Mouse", -3, -20.0);
        System.out.println("Número: " + fatura2.getNumero());
        System.out.println("Descrição: " + fatura2.getDescricao());
        System.out.println("Quantidade: " + fatura2.getQuantidade());
        System.out.println("Preço: " + fatura2.getPreco());
        System.out.println("Total da fatura: " + fatura2.getTotalFatura());
        
    }
    
}
