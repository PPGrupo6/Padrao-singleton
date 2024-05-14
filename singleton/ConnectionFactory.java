package main.singleton;

public class ConnectionFactory {

    private static Connection conexao;

    private ConnectionFactory() {}

    public static Connection getInstance() {
        if (conexao == null) {
            conexao = new Connection();
            conexao.conectar();
        }
        return conexao;
    }

}
