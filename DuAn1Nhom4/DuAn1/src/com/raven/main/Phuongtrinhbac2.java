/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.main;

import java.util.Scanner;

/**
 *
 * @author vha74
 */
public class Phuongtrinhbac2 {
    public static void main(String[] args) {
        Scanner _sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập A : ");
        float a = _sc.nextFloat();
        System.out.println("Mời bạn nhập B : ");
        float b = _sc.nextFloat();
        System.out.println("Mời bạn nhập C : ");
        float c = _sc.nextFloat();
        
        float delta = b*b -4*a*c;
        
        if (delta<0) {
            System.out.println("Phương trình vô nghiệm");
        }
        else if(delta == 0){
            float nghiemKep = -b/2*a;
            System.out.println("Phương trình có nghiệm kép : " + nghiemKep);
        }
        else{
               float nghiem1 = (float) ((-b + Math.sqrt(delta))/2); 
               float nghiem2 = (float) ((-b - Math.sqrt(delta))/2); 
               System.out.println("Nghiệm 1 : " + nghiem1);
               System.out.println("Nghiệm 2 : " + nghiem2);
               
                }
    }
}
