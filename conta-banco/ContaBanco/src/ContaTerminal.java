import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Criando um objeto Scanner para capturar entrada do usuário
        Scanner scanner = new Scanner(System.in);

        //Solicitando e capturando os dados do usuário
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextLine();
        scanner.nextLine(); //Consumir a quebra de linha deixada pelo nextInt()

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        //Fechando o scanner
        scanner.close();

        //Exibindo a mensagem final
        System.out.println("\nOlá" + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é" + agencia + ", conta" + numero + "e seu saldo" + saldo + "já está disponivel para saque.");


    }
}
