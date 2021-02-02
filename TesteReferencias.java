public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("O Saldo de sua Primeira Conta é : " + primeiraConta.saldo + " ;");
    }
}