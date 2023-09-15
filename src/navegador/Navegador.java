package navegador;

public interface Navegador {
    public default void abrirPagina(){
        verificarConexao();
        System.out.println("Página Aberta");
    }
    public default void adicionarNovaPagina(){
        System.out.println("Nova guia Aberta");
    }
    public default void atualizarPagina(){
        System.out.println("Página atualiza");
    }

    public default void fecharPagina(){
        System.out.println("Tem certeza que deseja sair?");
    }

    private void verificarConexao(){
        System.out.println("Conectado a REDE LOCAL");
    }
}
