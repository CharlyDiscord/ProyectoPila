/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyectopila;
import java.util.Scanner;
/**
 *
 * @author UTS2026
 */
public class ProyectoPila 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        Pila pila = new Pila();
        int opcion;
        int numero;
        int resultado;
        int nuevoTam;

        do 
        {
            System.out.println("MENU PILA");
            System.out.println("1.Tamano de Pila");
            System.out.println("2.Push");
            System.out.println("3.Pop");
            System.out.println("4.Imprimir Pila");
            System.out.println("5.Salir");
            System.out.print("Seleccionar Opcion => ");
            opcion = entrada.nextInt();
            
            switch (opcion) 
            {

                case 1:
                    System.out.print("Ingresa el nuevo tamano de la pila: ");
                    nuevoTam = entrada.nextInt();
                    pila.size(nuevoTam);
                    System.out.println("valores actuales: " + pila.getTope());
                    break;

                case 2:
                    System.out.print("Ingresa el valor que deseas pasar a la pila : ");
                    numero = entrada.nextInt();
                    if (pila.push(numero)) {
                        System.out.println("el valor se ingreso a la pila :) ");
                    } else {
                        System.out.println("Pila llena, elimina un valor para seguir...");
                    }
                    break;

                case 3:
                    resultado = pila.pop();
                    if (resultado == -1) {
                        System.out.println("Pila vacia, ingresa un valor para seguir...");
                    } else {
                        System.out.println("valor eliminado: " + resultado);
                    }
                    break;

                case 4:
                    pila.printStack();
                    break;

                case 5:
                    System.out.println("nos vemos :D ");
                    break;

                default:
                    System.out.println("Selecciona una opcion del menu >:/ ");
                    break;
            }
        } 
        while (opcion != 5);
        entrada.close();
    }
}