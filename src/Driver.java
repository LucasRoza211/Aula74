import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor informe sua idade:");
        int idade = scanner.nextInt();
        String msg = idade >= 18 ? "Pode Dirigir" : "Não pode dirigir!";
        System.out.println(msg);
        scanner.close();
    }
}
