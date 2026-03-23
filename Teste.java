import java.util.Scanner;

class Dados {

    String nome;
    int idade;
    String graduado;
    String formacao;
    String experiencia;

}
public class Teste {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Dados pessoa1 = new Dados();

        System.out.println("Digite seu nome inteiro: ");
        pessoa1.nome = leitor.nextLine();

        System.out.println("Você tem ensino médio? S/N:  ");
        pessoa1.graduado = leitor.nextLine();
        
        if (pessoa1.graduado.equalsIgnoreCase("Sim")) {
            
            System.out.println("Parabéns pela graduação!");
            
        } else { 
            System.out.println("Sinto muito, mas precisamos que tenha Ensino médio completo");
            return;
        }
        
        System.out.println("Qual é seu nivel de escolaridade?");
        pessoa1.formacao = leitor.nextLine();

        if (pessoa1.formacao.equalsIgnoreCase("Ensino médio incompleto")) {
            System.out.print("Você precisa ter Ensino médio completo para prosseguir!");
            pessoa1.formacao = leitor.nextLine();
            return;
        }

        else if (pessoa1.formacao.equalsIgnoreCase("Ensino superior cursando")) {
            System.out.println("Qual curso está matriculado?");
            pessoa1.formacao = leitor.nextLine();
            System.out.println("Que legal, boa sorte na graduação!");
        }

        else if (pessoa1.formacao.equalsIgnoreCase("Ensino superior completo")) {
            System.out.print("Qual curso você se formou?");
            pessoa1.formacao = leitor.nextLine();
        }

        System.out.println("Tem experiência profissional na área de Tecnológica?");
        pessoa1.experiencia = leitor.nextLine();

        if (pessoa1.experiencia.equalsIgnoreCase("Sim")) {
            System.out.println("Fale um pouco de como foi sua experiência: ");
            pessoa1.experiencia = leitor.nextLine();
        }else {
        }
        
        System.out.println("Tem alguma experiência profissional? ");
        pessoa1.experiencia = leitor.nextLine();

        if (pessoa1.experiencia.equalsIgnoreCase("Sim")) {
            System.out.println("Descreva um pouco sobre suas experiências: ");
            pessoa1.experiencia = leitor.nextLine();
        } else {
            System.out.println("Buscamos alguém com breve experiência profissional. ");
            return;
        }
        System.out.println("Passe para a próxima etapa!");
            
        
        
    }
}




