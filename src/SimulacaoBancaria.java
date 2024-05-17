import java.util.Locale;
import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        scanner.useLocale(Locale.US);
        double saldo = 0;
        boolean controle = true;
         
        while(controle){
            int opcao = scanner.nextInt(); 

            switch(opcao) {
                case 1:
                    saldo += scanner.nextDouble();
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    double valor = scanner.nextDouble();
                    if(valor > saldo) {
                        System.out.println("Saldo insuficiente.");
                    }else {
                        saldo -= valor;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    controle = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente."); 
            }
        }
    }
}