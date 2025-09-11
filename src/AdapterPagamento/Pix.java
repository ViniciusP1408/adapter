package AdapterPagamento;

public class Pix implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("Pagando R$"+valor+" pelo PIX");
    }
}
