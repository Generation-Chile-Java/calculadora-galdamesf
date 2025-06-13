import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner calculadora = new Scanner(System.in);

        //Pedimos el primer numero
        System.out.println("Ingresa el primer número: ");
        int primerNumero = calculadora.nextInt();

        //Pedimos el segundo numero
        System.out.println("Ingresa el segundo número: ");
        int segundoNumero = calculadora.nextInt();

        //Operaciones
        int suma = primerNumero + segundoNumero;
        int resta = primerNumero - segundoNumero;
        int multiplicacion = primerNumero * segundoNumero;
        int division = primerNumero / segundoNumero;
        int modulo = primerNumero % segundoNumero;

        //Resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: "+ resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
        System.out.println("Modulo: " + modulo);

        calculadora.close();
    }
}
