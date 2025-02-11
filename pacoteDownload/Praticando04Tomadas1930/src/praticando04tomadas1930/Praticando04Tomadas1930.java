/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praticando04tomadas1930;

import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class Praticando04Tomadas1930 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner (System.in);
        int T1 = teclado.nextInt();
        int T2 = teclado.nextInt();
        int T3 = teclado.nextInt();
        int T4 = teclado.nextInt();
        int saida = 0;
        saida = (T1-1)+(T2-1)+(T3-1)+T4;
        System.out.print(saida);
        
    }
    
}
