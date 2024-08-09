import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Seja bem vindo!") ;
        System.out.println("Para criar a sua conta bancária, por favor, preencha os dados abaixo");

        System.out.println("Digite o seu nome") ;
        nomeCliente = scanner.next();

        System.out.println("Digite o código da agência mais próxima ou a de sua preferência") ;
        agencia = scanner.next();

        System.out.println("Digite o número desejado para a sua conta bancária") ;
        numero = scanner.nextInt();
        
        System.out.println("Digite o valor que deseja depositar para ter saldo em sua conta") ;
        saldo = scanner.nextDouble();
        

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco," + 
                           "sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$ " + 
                           saldo + " já está disponível para investimentos.");
    }
}
