import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    System.out.println("Por favor digite el salario ");
    try (Scanner leer = new Scanner(System.in)) {
        double salario = leer.nextDouble();
        if (salario<1000) {
            salario = salario + (salario*0.45);
        
        }
        System.out.println("Su salario final es" + salario);
    }
    }
}
