package Banco;
import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, digite seu nome: ");
    String nomeCliente = scanner.next();
        System.out.println("Digite o número da sua agência: ");
    String Agencia = scanner.next();
        System.out.println("Digite o numero da sua conta: ");
    int Numero = scanner.nextInt();
        System.out.println("Digite o seu Saldo: ");
    int Saldo = scanner.nextInt();
    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + "e seu saldo é R$" + Saldo + " já está disponível para saque");

    }
}

