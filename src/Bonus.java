import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o salario do empregado: ");

        double salary = scanner.nextDouble();
        
        double upgradedSalary = salary >= 15000 ? salary * 1.10 : salary * 1.05;

        System.out.println("Seu novo salario é: " + upgradedSalary);

        scanner.close();
    }
}
