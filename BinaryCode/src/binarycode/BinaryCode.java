/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarycode;

/**
 *
 * @author DVALL
 */
public class BinaryCode {

    public static int busquedaBinaria(int[] arr, int clave) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            // Verificar si la clave está en el medio
            if (arr[medio] == clave) {
                return medio;
            }

            // Si la clave es mayor, ignorar la mitad izquierda
            if (arr[medio] < clave) {
                inicio = medio + 1;
            } else {
                // Si la clave es menor, ignorar la mitad derecha
                fin = medio - 1;
            }
        }

        // Si la clave no está presente en el array
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int clave = 10;
        int resultado = busquedaBinaria(arr, clave);

        if (resultado == -1) {
            System.out.println("La clave no está presente en el array.");
        } else {
            System.out.println("La clave se encuentra en el índice: " + resultado);
        }
    }
}
