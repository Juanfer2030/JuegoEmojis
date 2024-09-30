/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafionavidenio1.logica;

import java.util.Random;

/**
 *
 * @author Juanfer
 */
public class Controlador {
    public int determinarCantidadEmoji(String emoji, int cantidad, String matriz[][]){
        
        int cantidadEncontrada = 0;
        for(int f=0;f<4;f++) {
            for(int c=0;c<4;c++) {
                if(matriz[f][c].equals(emoji)){
                    cantidadEncontrada++;
                }
            }
        }
        
        return cantidadEncontrada;
    }
    
    public String[][] generarMatriz(){
        
        Random random = new Random();
        String [] emojis = {"🎅","🎄","⭐","🎁"};
        String [][] matriz = new String [4][4];
        
        for(int f=0;f<4;f++) {
            for(int c=0;c<4;c++) {
                    matriz[f][c] = emojis[random.nextInt(emojis.length)];
                }
            }
        
        return matriz;
    }
}
