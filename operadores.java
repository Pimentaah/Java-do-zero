import java.util.Scanner;

public class operadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Operador de Soma
        
        int numA = 2;
        int numB = 4;
        int soma = numA + numB;
        System.out.println("A soma deu: " + soma);

        //Operador de subtração
        
        int subtracao = numA - numB;
        System.out.println("O numero: " + numA + " menos " + numB + " deu: " + subtracao);

        // Operador de divisão
        
        double numC, numD, totaldouble;
        numC = 5;
        numD = 2;
        totaldouble = numC / numD;
        System.out.println("A divisão deu: " + totaldouble);

        //Operador de potência usando a importação "java.lang.Math" para conseguir extrair as funções que essa biblioteca tem.
        System.out.println("Digite um numero");
        double numero1 = sc.nextDouble(); // Declarando variável agora e chamando o Scanner para o usuário digitar.
        
        System.out.println("digite a potência desse numero");
        double numero2 = sc.nextDouble();

        double potenciacao = Math.pow(numero1, numero2); // Math.pow é uma função da biblioteca lang.Math para poder fazer essa conta de potência.
        System.out.println("O numero " + numero1 + " elevado a " + numero2 + " resulta em: " + potenciacao); // Aqui eu concatenei variáveis e Strings com o +, isso serve para separar as informações.
        
        //Operador de raíz quadrada
        
        double raiz = Math.sqrt(9); // Mais uma vez usando a biblioteca lang.Math para realizar conta matemáticas, agora tendo como foco o Math.sqrt para puxar a função de raiz quadrada que a biblioteca oferece.
        System.out.println(raiz);
    }
}
