
package video79;

import java.util.Scanner;

/**
 *
 * @author Carolina EM
 */
public class Video79 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int arreglo[] = new int[10];
        int numero,posicion;
        
        System.out.println("Llenamos el arreglo");
        for (int i=0;i<8;i++){
            System.out.print((i)+". Digite un numero: ");
            arreglo[i] = teclado.nextInt();
        }
        
        System.out.print("\nDigite un numero: ");
        numero = teclado.nextInt();
        System.out.print("\nDigite una posicion");
        posicion= teclado.nextInt();
        
        
        // Correr una posicion los elementos detras de la posicion que el usuario quiere
        for (int i=7;i>=posicion;i--){
            arreglo[i+1] = arreglo[i];
        }
        
        arreglo[posicion] = numero;  //Insertamos el número en la posicion requerida
        
        System.out.println("El nuevo arreglo es: ");
        for (int i=0;i<9;i++){
            System.out.println("Posicion "+i+": "+arreglo[i]);
        }
                
    }
    
}
