import java.util.Scanner;

public class Fibonacci {
    public static boolean isFibonacci(int numero){
        if (numero == 0 || numero == 1) return true;

        int primeiroNumero = 0;
        int segundoNumero = 1;
        int proximoNumero = primeiroNumero + segundoNumero;

        while (proximoNumero <= numero) {
            if (proximoNumero == numero) return true;
            primeiroNumero = segundoNumero;
            segundoNumero = proximoNumero;
            proximoNumero = primeiroNumero + segundoNumero;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe um número");
        int numero = scanner.nextInt();

        if(isFibonacci(numero)){
            System.out.println(numero + " pertence a sequência de fibonacci");
        } else {
            System.out.println( numero + " não pertence a sequência de fibonacci");
        }

        scanner.close();
    }
}