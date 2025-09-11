package AdapterPagamento;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class AppPagamento {
    public static void main(String[] args) {
        PayPalApi payPalApi = new PayPalApi();
        List<Pagamento> pagamentos =  new ArrayList<>();
        Pagamento pagamento01 =  new Pix();
        Pagamento pagamento02 = new PayPalAdapter(payPalApi);

        pagamento01.pagar(10);
        pagamento02.pagar(20);

        pagamentos.add(pagamento01);
        pagamentos.add(pagamento02);
    }
}
