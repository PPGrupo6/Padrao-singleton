package main.singleton;

public class Main {

    public static void main(String[] args) {
        Connection conexao1 = ConnectionFactory.getInstance();
        Connection conexao2 = ConnectionFactory.getInstance();
        if (conexao1 == conexao2) {
            System.out.println("Mesma instancia!");
        } else {
            System.out.println("Instancias diferentes!");
        }
    }

}
