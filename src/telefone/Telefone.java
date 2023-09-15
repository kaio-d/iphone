package telefone;

public interface Telefone {
    public default void ligar(){
        System.out.println("Entrando em contato com o número discado");
    }

    public default void atender(){
        System.out.println("Chamada aceita");
    }

    public default void recusar(){
        System.out.println("Chamada recusada");
    }

    public default void iniciarCorreioDeVoz(){
        System.out.println("Ligação perdida, aperte 1 para abrir o Correio de Voz.");
    }
}
