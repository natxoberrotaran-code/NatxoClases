/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizarray;

/**
 *
 * @author dam1
 */
public class MatrizArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // Definir array de 3 filas x 6 columnas
        int[][] num = new int[6][10];

        int max = -1;
        int min = 1001;
        
        int maxFila = 0, maxCol = 0;
        int minFila = 0, minCol = 0;
                
       
            for (int i = 0; i < 6; i++) 
            {
                for (int j = 0; j < 10; j++) 
                {
                    num[i][j] = (int)(Math.random()*1001);
                    
                    if (num[i][j]> max){
                        max = num [i][j];
                        maxFila = i;
                        maxCol = j;
                        
                    }
                
                    if(num[i][j]<min){
                        min = num[i][j];
                        minFila= i;
                        minCol=j;
                    }    
                
                }
            }
            
            System.out.println("Maximo: "+ max +" en fila "+ maxFila + " columna " + maxCol);
            System.out.println("Minimo: "+ min +" en fila "+ minFila + " columna " + minCol);
    
    }
    
    }



