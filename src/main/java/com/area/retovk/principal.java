/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.retovk;

/**
 *
 * @author iker.iglesias
 */
public class principal {
    public static void main(String[] args) {
        //Creem una variable per guardar la frase.
        String frase = "Cómo  será  dar  con Nekgikis  V...";
        String fraseSenseEspais ;
        fraseSenseEspais = frase.replace(" ", "");
        fraseSenseEspais = fraseSenseEspais.toLowerCase();
        fraseSenseEspais = fraseSenseEspais.replace("ó", "o");
        fraseSenseEspais = fraseSenseEspais.replace("á", "a");
        System.out.println(fraseSenseEspais);
        
        
        Integer ordre[] = new Integer[]{23, 24, 25, 18, 19, 5, 6, 7, 20, 15, 17, 8, 10, 11, 4, 3, 12,  2,  16,  14,  9,  21,  0,  1,  13,  22};
        
        System.out.println(ordre[0]);
        
        char url[] = new char[ordre.length];

        for(int i = 0; i < ordre.length;i++){
            url[ordre[i]] = fraseSenseEspais.charAt(i);
        }
        
        for(char c : url){
            System.out.print(c);
        }
  
    }
}
