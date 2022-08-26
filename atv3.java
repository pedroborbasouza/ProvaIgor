/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provaigor;

import java.util.Scanner;

/**
 *
 * @author Usuário
 */
public class atv3 {
    public static void main(String[] args) {
        System.out.println("ATIVIDADE MASSA");
        Scanner in = new Scanner (System.in);
        float massa, massa2 = 0;
        int seg = 0, min, hr;
        
        
        System.out.println("Informe a massa inicial (em gramas): ");
        massa = in.nextFloat();
        
        massa2 = massa;
        
        while (massa >= 0.5) {
            massa = massa / 2;
            seg += 50;
        }
        
        min = seg / 60;
        hr = min / 60;
        
        System.out.println("Massa inicial: " + massa2);
        System.out.println("Massa final: " + massa);
        
        System.out.println("O tempo decorrido foi de " + hr + " Horas, " + min + " Minutos, e " + seg + " Segundos.");
             
        }
    } //a cada 50 segundos, a massa é dividida por 2 até ficar 0.5
    

