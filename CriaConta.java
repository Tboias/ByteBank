public class CriaConta {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;

        primeiraConta.saldo += 100;

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        segundaConta.saldo += 100;

        System.out.println(" Primeira conta tem : " + primeiraConta.saldo);

        System.out.println(" Segunda conta tem : " + segundaConta.saldo);

    }
}