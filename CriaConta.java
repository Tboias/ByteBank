public class CriaConta {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        primeiraConta.agencia = 146;

        Conta segundaConta = new Conta();
        segundaConta.saldo = 30;
        segundaConta.agencia = 146;

        System.out.println(" Saldo da Primeira conta tem : " + primeiraConta.saldo + " ;");
        System.out.println();

        System.out.println(" Saldo da Segunda conta tem : " + segundaConta.saldo + " ;");
        System.out.println();

        System.out.println(" Numero de Agência da Primeira conta tem : " + primeiraConta.agencia + " ;");
        System.out.println();

        System.out.println(" Numero de Agência da Segunda conta tem : " + segundaConta.numero + " ;");
        System.out.println();

        if (primeiraConta == segundaConta) {
            System.out.println(" São as mesmas Contas !");
            System.out.println();
        } else {
            System.out.println(" São diferentes Contas !");
            System.out.println();
        }

        System.out.println(" " + primeiraConta);
        System.out.println();

        System.out.println(" " + segundaConta);
        System.out.println();
    }
}