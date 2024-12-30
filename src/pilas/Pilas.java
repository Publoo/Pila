
package pilas;

import java.util.Scanner;

public class Pilas {
    
    private static int[] Pila = new int[5];  
    private static int pilaarriba = -1;  
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        
        do {
            System.out.println("QUE DESEA REALIZAR: ");
            System.out.println("1. Insertar");
            System.out.println("2. Eliminar");
            System.out.println("3. Imprimir");
            System.out.println("4. Salir");
            
           
            try {
                    opcion = leer.nextInt();
            } catch (Exception punto) {
                
                System.out.println("Entrada invalida.");
                leer.next();
                continue;
                    
                    
                    }
            
            switch (opcion) {
                case 1:
                    insertar(leer);
                    break;
                case 2:
                    eliminar();
                    break;
                case 3:
                    imprimir();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        } while (opcion != 4);
        
        leer.close();
    }
    
    private static void insertar(Scanner leer) {
        if (pilaarriba == Pila.length - 1) {  
            System.out.println("Pila llena, borre algún valor antes de insertar uno nuevo. " + "Valor del tope: " + Pila[pilaarriba] );
        } else {
            System.out.print("Ingrese el valor a insertar: ");
            int valor = leer.nextInt();
            pilaarriba++;  
            Pila[pilaarriba] = valor;  
            System.out.println("Valor insertado.");
        }
    }
    
    private static void eliminar() {
        if (pilaarriba == -1) { 
            System.out.println("Pila vacía, no hay valores para eliminar.");
        } else {
            System.out.println("Valor eliminado: " + Pila[pilaarriba]);
            Pila[pilaarriba] = 0;  
            pilaarriba--;  
        }
    }
    
    private static void imprimir() {
        if (pilaarriba == -1) {
            System.out.println("Pila vacía.");
        } else {
            System.out.println("Valores en la pila:");
            System.out.println("Tope de la pila: " + Pila[pilaarriba]);
            for (int i = 0; i <= pilaarriba; i++) {
                System.out.println("Posición " + i + ": " + Pila[i]);
                
            }
        }
    }
}
