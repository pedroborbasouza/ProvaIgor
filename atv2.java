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
public class atv2 {
    public static void main(String[] args) {
        System.out.println("Atividade Funcionário");
        Scanner in = new Scanner (System.in);
        double salario = 1015, percent;
        int ano;
        
        percent = 0.015;
        
        for (ano = 1995; ano <= 2021; ano++) {
            System.out.println("Salário do ano " + (ano+1) + " : " + salario);
            if (ano<2021) {
                percent = percent + percent;
                salario = (salario * percent) + salario;
            }
        }
    }
    
}
