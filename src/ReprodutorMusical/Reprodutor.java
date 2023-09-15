package ReprodutorMusical;

public interface Reprodutor {
    public default void selecionarMusica() {
        System.out.println("Selecione a música que deseja ouvir:");
    }

    public default void tocarMusica() {
        System.out.println("Iniciando a música.");
    }

    public default void pausarMusica() {
        System.out.println("Música pausada.");
    }
}
