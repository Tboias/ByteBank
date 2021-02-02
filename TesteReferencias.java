public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("O Saldo de sua Primeira Conta é : " + primeiraConta.saldo + " ;");
        System.out.println();

        Conta segundaConta = primeiraConta;

        System.out.println("O Saldo de sua Segunda Conta é : " + segundaConta.saldo + " ;");
        System.out.println();

        segundaConta.saldo += 100;

        System.out.println("O Saldo de sua Segunda Conta é : " + segundaConta.saldo + " ;");
        System.out.println();

        System.out.println("O Saldo de sua Primeira Conta é : " + segundaConta.saldo + " ;");
        System.out.println();

        if (primeiraConta == segundaConta) {
            System.out.println(" São as mesmas Contas ! ");
            System.out.println();
        } else {
            System.out.println(" São diferentes contas ! "); 
            System.out.println();
        }

        System.out.println(" " + primeiraConta);
        System.out.println();

        System.out.println(" " + segundaConta);
        System.out.println();
    }
}