package AdapterPagamento;

public class PayPalAdapter implements Pagamento{
    private PayPalApi payPalApi;

    public PayPalAdapter(PayPalApi payPalApi){
        this.payPalApi = payPalApi;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Rodando adaptar");
        payPalApi.makeTransaction(valor);
    }
}
