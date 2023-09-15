import ReprodutorMusical.ReprodutorMusical;
import navegador.Navegador;
import navegador.NavegadorInternet;

public class MeuIphone {
    public static void main(String[] args) {
        NavegadorInternet navegador = new NavegadorInternet();
        ReprodutorMusical reprodutor = new ReprodutorMusical();

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

    }
}
