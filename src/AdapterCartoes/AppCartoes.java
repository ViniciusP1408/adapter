package AdapterCartoes;

public class AppCartoes {
    public static void main(String[] args) {
        LeitorCartao leitorTarja = new LeitorTarjaAdapter(new LeitorCartaoAntigo());
        LeitorCartao leitorChip = new LeitorChipAdapter(new LeitorCartaoChip());

        System.out.println(leitorTarja.lerDados("1111-2222-3333-4444|12/29|JOAO"));
        System.out.println(leitorChip.lerDados("CHIP:5555-6666-7777-8888|07/30|MARIA"));
    }
}
