import java.util.Scanner;
import java.text.DecimalFormat;

public class ContaTerminal {
    public static void main(String[] args) {
        // Declarando variáveis de exemplo
        String agencia = "067-8";
        int numero = 1021;
        String nomeCliente = "MARIO ANDRADE";
        double saldo = 237.48;

        // Criando um objeto Scanner para capturar entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando e capturando os dados do usuário
        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        while (!scanner.hasNextInt()) { // Verifica se a entrada é um número inteiro
            System.out.println("Entrada inválida! Digite um número válido para a conta.");
            scanner.next(); // Descarta entrada inválida
        }
        numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

        System.out.print("Por favor, digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        while (!scanner.hasNextDouble()) { // Verifica se a entrada é um número decimal
            System.out.println("Entrada inválida! Digite um valor numérico válido para o saldo.");
            scanner.next(); // Descarta entrada inválida
        }
        saldo = scanner.nextDouble();
        
        // Fechando o scanner
        scanner.close();

        // Formatando o saldo para exibir com duas casas decimais
        DecimalFormat df = new DecimalFormat("0.00");

        // Exibindo a mensagem final formatada
        System.out.println("\nOlá " + nomeCliente + 
            ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + 
            ", conta " + numero + " e seu saldo R$ " + df.format(saldo) + " já está disponível para saque.");
    }
}
