/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.step;

import com.step.converter.TempConverter;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class App {
    
    public static void main (String [] args){
    
    TempConverter obj = new TempConverter();
    
    obj.convertToFahr(100);
     
    obj.convertToCelsius(100);
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print(" Introdu valoarea temperaturii in °C = ");
    
    double val = sc.nextDouble();
    
    System.out.print(val + " °C = ");
    
    obj.convertUserValueToFahr(val);
    
    } 
    
}
