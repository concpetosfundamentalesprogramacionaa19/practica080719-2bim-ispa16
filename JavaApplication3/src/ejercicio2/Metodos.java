/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Jorge Tapia Flores
 */
public class Metodos {
    public static int obtenerTamanioArreglo(int arreglo2[], int tamanio) {
        if (tamanio == 1) {
            return arreglo2[0];
        } else {
            return arreglo2[tamanio - 1] + obtenerTamanioArreglo(arreglo2, tamanio - 1 ); 
        }
         
    }
    //demostracion arreglo
    public static int obtenerSumaArreglo(int arreglo2[], int tamanio) { 
        int resultado = 0;//inicializacion de variables
        for (int i = 0;i < tamanio;i++){//inicio del ciclo for 
            resultado = arreglo2[i] + resultado;//suma del arreglo
        }
        return resultado; //devolucion del resultado
    }
}
