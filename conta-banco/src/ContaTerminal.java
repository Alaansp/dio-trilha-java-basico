import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu Nome!");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu Sobrenome!");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite seu Saldo!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome +", obrigado por criar uma conta em nosso banco.");
        System.out.println("sua agência é: " + agencia);
        System.out.println("conta: " + numeroConta);
        System.out.println("e seu Saldo: " + saldo + " já está disponível para saque.");
    }
}
