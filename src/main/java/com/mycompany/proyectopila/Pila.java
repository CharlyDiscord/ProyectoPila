/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopila;

/**
 *
 * @author UTS2026
 */
public class Pila
{
    private Nodo inicio = null;
    private int tope = 0;
    private int max = 0;
    
    public boolean full() 
    {
        return tope == max;
    }

    public boolean empty() 
    {
        return inicio == null;
    }

    public boolean push(int v) 
    {
        if (full()) 
        {
            return false;
        }
        Nodo nuevo = new Nodo(v);
        nuevo.setSig(inicio);
        inicio = nuevo;
        tope++;
        return true;
    }
    
    public int pop() 
    {
        if (empty()) 
        {
            return -1;
        }
        int valor = inicio.getValor();
        inicio = inicio.getSig();
        tope--;
        return valor;
    }

    public void printStack()
    {
         System.out.println("---");
         Nodo act = inicio;
         while (act != null) 
         {
         System.out.println(act.getValor());
         act = act.getSig();
         }
         System.out.println("---");
    }

    public void size(int nuevoTam) 
    {
        if (nuevoTam <= 0) 
        {
            System.out.println("Porfavor digite un valor mayor a cero.");
            return;
        }
        if (nuevoTam < tope) 
        {
            System.out.println("No se puede asignar un menor tamano");
            return;
        }
        max = nuevoTam;
        System.out.println("El tamano actual de la pila cambio");
    }

    public int getTope() 
    {
        return tope;
    }
    
    public int getMax() 
    {
        return max;
    }

}