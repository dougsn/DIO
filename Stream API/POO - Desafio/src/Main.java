import model.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("Iphone XXV");

        System.out.println("\n");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        System.out.println("\n");

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioDeVoz();

        System.out.println("\n");
        iphone.exibirPagina();
        iphone.adicionarNovaPagina();
        iphone.atualizarPagina();
    }
}
