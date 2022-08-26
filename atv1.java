/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.provaigor;

import java.util.Scanner;

/**
 *
 * @author Usuário
 */
public class atv1 {

    public static void main(String[] args) {
     System.out.println("Elabore um algoritmo que leia 5 valores inteiros e apresente na tela o maior e o menor deles.");
     Scanner in = new Scanner (System.in);
     int n1,n2,n3,n4,n5;
     
        System.out.println("Insira 5 números inteiros: ");
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();
        n4 = in.nextInt();
        n5 = in.nextInt();
        
            //MAIOR
        
        if ((n1 > n2) && (n1 > n3) && (n1 > n4) && (n1 > n5)) {
            System.out.println("O maior número é: " + n1);
            
        } else if ((n2 > n1) && (n2 > n3) && (n2 > n4) && (n2 > n5)) {
            System.out.println("O maior número é: " + n2);
            
        } else if ((n3 > n1) && (n3 > n2) && (n3 > n4) && (n3 > n5)) {
            System.out.println("O maior número é: " + n3);
        
        } else if ((n4 > n1) && (n4 > n2) && (n4 > n3) && (n4 > n5)) {
            System.out.println("O maior número é: " + n4);
            
        } else if ((n5 > n1) && (n5 > n2) && (n5 > n3) && (n5 > n4)) {
            System.out.println("O maior número é: " + n5);
            
            //MENOR
            
        } if ((n1 < n2) && (n1 < n3) && (n1 < n4) && (n1 < n5)) {
            System.out.println("O menor número é: " + n1);
            
        } else if ((n2 < n1) && (n2 < n3) && (n2 < n4) && (n2 < n5)) {
            System.out.println("O menor número é: " + n2);
            
        } else if ((n3 < n1) && (n3 < n2) && (n3 < n4) && (n3 < n5)) {
            System.out.println("O menor número é: " + n3);
            
        } else if ((n4 < n1) && (n4 < n2) && (n4 < n3) && (n4 < n5)) {
            System.out.println("O menor número é: " + n4);
            
        } else if ((n5 < n1) && (n5 < n2) && (n5 < n3) && (n5 < n4)) {
            System.out.println("O menor número é: " + n5);
            
        }
    }
}
