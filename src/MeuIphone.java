import ReprodutorMusical.ReprodutorMusical;
import navegador.NavegadorInternet;
import telefone.AparelhoTelefonico;

public class MeuIphone {
    public static void main(String[] args) {
        NavegadorInternet navegador = new NavegadorInternet();
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        AparelhoTelefonico telefone = new AparelhoTelefonico();

        navegador.abrirPagina();
        navegador.adicionarNovaPagina();
        navegador.atualizarPagina();
        navegador.fecharPagina();
        System.out.println("/*******************************/");

        reprodutor.selecionarMusica();
        reprodutor.tocarMusica();
        reprodutor.pausarMusica();
        reprodutor.aumentarVolume();
        reprodutor.aumentarVolume();
        reprodutor.diminuirVolume();
        reprodutor.diminuirVolume();
        System.out.println("/*******************************/");

        telefone.ligar();
        telefone.atender();
        telefone.recusar();
        telefone.iniciarCorreioDeVoz();
    }
}
