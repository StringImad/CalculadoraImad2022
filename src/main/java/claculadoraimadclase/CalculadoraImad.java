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
        boolean solicitarDatos = true;

        System.out.println("Bienvenido al calculator");

        do {


                // Bloque de código candidato a lanzar la excepción
                operando1 = ComprobadorIntroduccionInt();
                operando2 = ComprobadorIntroduccionInt();
                if ((operando1 > -100 && operando1 < 100) && (operando2 > -100 && operando2 < 100)) {
                    solicitarDatos = false;
                } else {
                    System.out.println("Los datos están fuera de rango");
                }

            
        } while (solicitarDatos);

        sc.nextLine();
        String opcion = "";
        int resultado = 0;
        do {
            mostrarMenu();
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
    // Método monstrarMenu. Sólo se utiliza en la clase Calculadora
    // método privado. No recibe parámetros y no devuelve valor (void)
    // 
    private static void mostrarMenu() {
        System.out.println("Opciones del programa");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("2 - Dividir");
        System.out.println("2 - Multiplicar");
        System.out.println("5 - Salir");
    }
    private static int ComprobadorIntroduccionInt(){
                int numeroIntroducido = 0;
                boolean repeticion = false;
  do{   
      try{   
         System.out.println("Introduce un numero");
         numeroIntroducido = sc.nextInt();
          } catch (InputMismatchException ime) {
              repeticion = true;
                // Código para tratar el error
                System.out.println("Se ha introducido texto en lugar de números. "
                        + "Vuelva a introducir los datos");
                sc.nextLine();
            }
  }while(repeticion);
        return numeroIntroducido;
        
    }

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
    // Método suma. Sólo se utiliza en la clase Calculadora
    // método privado. Recibe dos parámetros y devuelve un valor entero
    // con el resultado de la suma de los parámetros
 private static int dividir(int n1, int n2) {
        int dividir = (n1/n2);
        return dividir;
    }
  private static int multiplicar(int n1, int n2) {
        int multiplicar = (n1*n2);
        return multiplicar;
    }

}
