/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claculadoraimadclase;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author imad
 */
public class CalculadoraImad {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int operando1 = 1, operando2 = 1;

        System.out.println("Bienvenido a la calculadora");
        String opcion = "";
        int resultado = 0;
        do {
            do {
                System.out.println("Introduce los numeros para hacer los calculos");
                // Bloque de código candidato a lanzar la excepción
                operando1 = ComprobadorIntroduccionInt();
                operando2 = ComprobadorIntroduccionInt();
            } while (comprobadorOperador(operando1, operando2));

            mostrarMenu();
            sc.nextLine();
            opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    resultado = sumar(operando1, operando2);
                    break;
                case "2":
                    resultado = restar(operando1, operando2);
                    break;
                case "3":
                     resultado = dividir(operando1, operando2);
                    break;
                case "4":
                     resultado = multiplicar(operando1, operando2);
                    break;
                case "5":
                     System.out.println("Ha seleccionado salir");
                    break;
                default:
                    System.out.println("Opción no válida");
                            }
            System.out.println("El resultado es " + resultado);
        } while (!opcion.equals("5"));

    }
    
    //metodo que recibe dos operandos y  comprueba el rango del operandor y devuelve false si el valor es valido 
    private static boolean comprobadorOperador(int operador, int operador2) {
        boolean operadorValido = true;
        // Bloque de código candidato a lanzar la excepción
        if ((operador > -100 && operador < 100) && (operador2 > -100 && operador2 < 100)) {
            operadorValido = false;
        } else {
            operadorValido = true;
        }
        return operadorValido;
    }

    // Método monstrarMenu. Sólo se utiliza en la clase Calculadora
    // método privado. No recibe parámetros y no devuelve valor (void)
    private static void mostrarMenu() {
        System.out.println("Opciones del programa");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("2 - Dividir");
        System.out.println("2 - Multiplicar");
        System.out.println("5 - Salir");
    }

    //metodo que utilizamos para introduir un numer entro y comprueba si es valido, si lo es lo devuelve
    private static int ComprobadorIntroduccionInt() {
        int numeroIntroducido = 0;
        boolean repeticion = false;
        do {
            try {
                System.out.println("Introduce un numero (min -100, max 100)");
                numeroIntroducido = sc.nextInt();
            } catch (InputMismatchException ime) {
                repeticion = true;
                // Código para tratar el error
                System.out.println("Se ha introducido texto en lugar de números. "
                        + "Vuelva a introducir los datos");
                sc.nextLine();
            }
        } while (repeticion);
        return numeroIntroducido;

    }
    
    //Método suma. Sólo se utiliza en la clase Calculadora
    // método privado. Recibe dos parámetros y devuelve un valor entero
    // con el resultado de la suma de los parámetros
    private static int sumar(int n1, int n2) {
        int suma = n1 + n2;
        return suma;
    }

    // Método resta. Sólo se utiliza en la clase Calculadora
    // método privado. Recibe dos parámetros y devuelve un valor entero
    // con el resultado de la resta de los parámetros
    private static int restar(int n1, int n2) {
        int restar = n1 - n2;
        return restar;
    }

    // Método dividir. Sólo se utiliza en la clase Calculadora
    // método privado. Recibe dos parámetros y devuelve un valor entero
    // con el resultado de la divicion de los parámetros
    private static int dividir(int n1, int n2) {
        int dividir = (n1 / n2);
        return dividir;
    }
    
    // Método multiplicar. Sólo se utiliza en la clase Calculadora
    // método privado. Recibe dos parámetros y devuelve un valor entero
    // con el resultado de la multiplicacion de los parámetros
    private static int multiplicar(int n1, int n2) {
        int multiplicar = (n1 * n2);
        return multiplicar;
    }

}
