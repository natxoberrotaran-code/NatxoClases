/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class ARRAYS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        final int TAM = 12;//Tamaño del vector8
        int [] num = new int[TAM]; //Declara el vector y reserva memoria para dicho vector
        num[0] = 40;
        num[1] = -2;
        num[4] = 0;
        num[6] = 66;
        num[8] = 50;
        num[9] = 130;

        
        
        
        
        
        for (int i = 0; i < TAM; i++) 
        {
            System.out.println("Introduzca numero para el vector:");
            num[i]= sc.nextInt();
            
            num[i] = i + 3;
        }
        
        for (int i = 0; i < TAM; i++) 
        {
            System.out.print(num[i] + ",");
        }
        System.out.println(num[5]);
        
        System.out.println("Introduzca el tamaño del array: ");
        
    }
    
}
