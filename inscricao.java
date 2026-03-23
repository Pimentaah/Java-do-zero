import java.util.Scanner;

class Tecnico {

    String nome;
    String time;
    String liga;

}

public class inscricao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tecnico tecnico1 = new Tecnico();

        System.out.println("Técnico, Nos informe seu nome inteiro: ");
        tecnico1.nome = sc.nextLine();
        
        System.out.println("Perfeito, agora nos informe seu time: ");
        tecnico1.time = sc.nextLine();

        System.out.println("Por ultimo, nos informe a liga onde irá  registrar seu time: ");
        tecnico1.liga = sc.nextLine();

        System.out.println("=== Resumo atual do Cadastro ===");
        System.out.println("Nome: " + tecnico1.nome);
        System.out.println("Time: " + tecnico1.time);
        System.out.println("Liga: " + tecnico1.liga);

        System.out.println("Deseja alterar algum dado inserido?");
        String resposta = sc.nextLine();

        while (resposta.equalsIgnoreCase("Sim")){ //Enquanto eu digitar "Sim" ele perguntará se quero fazer alterações.
            System.out.println("Você quer alterar Nome,Time ou Liga? ");
             // Vai guardar o texto que o user digitar se quer alterar algum dado (Time,Nome ou Liga).
            
            String campo = sc.nextLine(); // Declarando a variável campo aqui mesmo sem precisar fazer isso lá em cima

            if (campo.equalsIgnoreCase("Nome")){
                System.out.println("Altere seu nome: ");
                tecnico1.nome = sc.nextLine();
            }
            else if (campo.equalsIgnoreCase("Time")){
                System.out.println("Altere o time:");
                tecnico1.time = sc.nextLine();
            }
            else if (campo.equalsIgnoreCase("Liga")){
                System.out.println("Altere a liga:");
                tecnico1.liga = sc.nextLine();
            }
            
            else {
                System.out.println("Resposta inválida! Digite novamente: ");
                resposta = sc.nextLine();
            }
            
            System.out.println("Deseja alterar mais algum dado?");
            resposta = sc.nextLine();
            }    
            
            System.out.println(" //---Abaixo os dados atualizados---//");
            System.out.println("Nome: " + tecnico1.nome);
            System.out.println("Time " + tecnico1.time);
            System.out.println("Liga " + tecnico1.liga);
        }
    }

