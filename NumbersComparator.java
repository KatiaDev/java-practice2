/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.step.comparator;

/**
 *
 * @author User
 */
public class NumbersComparator {
  
    public void Maximum(int a, int b, int c){
        int max = 0;
        if( a > b && a > c ){max = a;}
        else if (b > a && b > c ){max = b;}
        else if (c > a && c > b ){max = c;}
        System.out.println(" Numarul maxim este: " + max);
    }
    
    public void Minimum (int a, int b, int c){
        int min = 0;
        if(a < b && a < c ){min = a;}
        else if (b < a && b < c ){min = b;}
        else if (c < a && c < b ){min = c;}
        System.out.println(" Numarul minim este: " + min);
    
    }
}
