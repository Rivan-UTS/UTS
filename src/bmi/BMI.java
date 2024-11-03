/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class BMI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int berat;
        double tinggi;
        double bmi;
        
        System.out.println("berat badan dalam bentuk kg");
        berat = input.nextInt();
        System.out.println("tinggi badan dalam bentuk m ");
        tinggi = input.nextDouble();
        tinggi/=100;
        bmi = berat/(tinggi*tinggi);
        System.out.println("bmi anda adalah "+ bmi);
        
        if (bmi < 18.5){
            System.out.println("berat anda underweight");
        } else if (bmi >= 18.5 && bmi < 24.9){
            System.out.println("berat anda normal");
        } else if (bmi >= 24.9 && bmi < 29.9){
            System.out.println("berat anda overweight");
        } else{
            System.out.println("anda obesitas");
        }
    }
}
