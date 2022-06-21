import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Menu de opções:\n1 - Para contratar serviço\n2 - Para falar com atendente\n3 - Para reclamações\n4 - Para sair");
        int op = scanner.nextInt();
        switch (op){
            case 1:
            System.out.println("Seja muito be vindo! Sua visita é um prazer!");
            break;
            case 2:
            System.out.println("Algum problema?");
            break;
            case 3:
            System.out.println("Infe22lizmente todos os canais de atendimento estão ocupados. Envie um email para Nozajude@socorro.com");
            break;
            default:
            System.out.println("Opção invalida");
            break;
        }
        scanner.close();
    }
}
