package CompositeFS;

public class AppFS {
    public static void main(String[] args) {
        Pasta raiz = new Pasta("raiz");
        Pasta docs = new Pasta("docs");
        Pasta imgs = new Pasta("imagens");

        raiz.adicionar(new Arquivo("README.txt"));
        docs.adicionar(new Arquivo("contrato.pdf"));
        imgs.adicionar(new Arquivo("logo.png"));
        imgs.adicionar(new Arquivo("banner.jpg"));

        raiz.adicionar(docs);
        raiz.adicionar(imgs);

        raiz.exibir("");
    }
}
