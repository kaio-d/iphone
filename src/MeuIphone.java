public class MeuIphone implements Navegador{
    public static void main(String[] args) {
        Navegador navegador = new Navegador() {
            @Override
            public void abrirPagina() {
                Navegador.super.abrirPagina();
            }
        };
        navegador.abrirPagina();
        navegador.adicionarNovaPagina();
        navegador.atualizarPagina();
        navegador.fecharPagina();
    }
}

