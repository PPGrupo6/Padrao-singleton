package main.singleton;

public class Connection {

    public boolean conectado;

    public Connection() {}

    public boolean estaConectado() {
        return conectado;
    }

    public void conectar() {
        conectado = true;
        System.out.println("Conexao iniciada com sucesso!");
    }

    public void desconectar() {
        conectado = false;
        System.out.println("Conexao fechada!");
    }

}
