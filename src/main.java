public class main {

    public static void main(String[] args) {

        Caixa<String> nome = new Caixa<>();
        Caixa<Integer> quantidade = new Caixa<>();
        Caixa<Double> preco = new Caixa<>();

        nome.guardar("Caderno");
        quantidade.guardar(10);
        preco.guardar(25.50);

        System.out.println("=== DADOS DO PRODUTO ===");
        System.out.println("Nome: " + nome.obter());
        System.out.println("Quantidade: " + quantidade.obter());
        System.out.println("Preço: R$ " + preco.obter());
    }
}
