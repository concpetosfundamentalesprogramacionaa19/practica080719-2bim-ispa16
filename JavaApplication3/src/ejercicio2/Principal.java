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
public class Principal {
    public static void main (String[]args){
        int numeros[]= {10, 20, 30, 1, 2, 3, 40, 4};//declarar arreglo 
        int tamano = numeros.length;//obtener tamano del arreglo
        int resultado = Metodos.obtenerTamanioArreglo(numeros,tamano);//lamar al metodo uno
        int resultado2 = Metodos.obtenerSumaArreglo(numeros,tamano);//lamar al metodo dos
        //imprimir resulrados de los dos metodos
        System.out.printf("el resultado del m1etodo1 es: %s\n"
                + "el resultado del metodo 2 es: %s",resultado,resultado2); 
         
         
     
     
     }
}
