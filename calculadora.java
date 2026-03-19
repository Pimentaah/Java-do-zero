import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner calculadora = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double num1 = calculadora.nextDouble();
        
        System.out.println("Digite mais um numero: ");
        double num2 = calculadora.nextDouble();

        System.out.println("Você quer 'somar', 'subtrair', 'dividir' ou 'multiplicar'? ");
        String operacao = calculadora.next();

        double resultado = calcular(num1, num2, operacao);

        System.out.println("O resultado é: " + resultado);
    }

    public static double calcular(double num1, double num2, String operacao ){
        if (operacao.equalsIgnoreCase("Somar")){
            return num1 + num2;
        }
        else if (operacao.equalsIgnoreCase("Subtrair")){
            return num1 - num2;
        }
        else if (operacao.equalsIgnoreCase("Multiplicar")){
           return num1 * num2; 
        }
        return 0;
    }
}
    
