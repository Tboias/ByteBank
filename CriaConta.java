public class CriaConta {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;

        primeiraConta.saldo += 100;

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        segundaConta.saldo += 100;

        System.out.println(" Saldo da Primeira conta tem : " + primeiraConta.saldo + " ;");
        System.out.println();

        System.out.println(" Saldo da Segunda conta tem : " + segundaConta.saldo + " ;");
        System.out.println();

        System.out.println(" Numero de Agência da Primeira conta tem : " + primeiraConta.agencia + " ;");
        System.out.println();

        System.out.println(" Numero de Agência da Segunda conta tem : " + segundaConta.numero + " ;");
        System.out.println();

    }
}