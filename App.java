/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.step;

import com.step.converter.TempConverter;
import com.step.calculator.Calculator;
import com.step.comparator.NumbersComparator;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class App {
    
    public static void main (String [] args){
    
    Scanner sc = new Scanner(System.in);
   // Exercitiu practic Convertor de Temperatura
   /* TempConverter obj = new TempConverter();
    
    obj.convertToFahr(100);
     
    obj.convertToCelsius(100);
        
    System.out.print(" Introdu valoarea temperaturii in °C = ");
    
    double val = sc.nextDouble();
    
    System.out.print(val + " °C = ");
    
    obj.convertUserValueToFahr(val);*/
//------------------------------------------------------------------------------
  
  // Exercitiu practic Calculator
   /* System.out.print(" Introdu valoarea lui a = ");
    
    int a = sc.nextInt();
    
    System.out.print(" Introdu valoarea lui b = ");
    
    int b = sc.nextInt();
    
    System.out.println(" 1. Adunare");
    System.out.println(" 2. Scadere");
    System.out.println(" 3. Inmultire");
    System.out.println(" 4. Impartire");
            
    System.out.print(" Alege operatia (1,2,3,sau 4): " );
    int op = sc.nextInt();

    Calculator calc = new Calculator();

    switch(op){
        case 1: { System.out.println(" a + b = " + calc.Add(a, b)); break;}
        case 2: { System.out.println(" a - b = " + calc.Substract(a, b)); break;}
        case 3: { System.out.println(" a * b = " + calc.Multiply(a, b)); break;}
        case 4: { System.out.println(" a / b = " + calc.Divide(a, b)); break;}
        
        default: { System.out.println(" Alegeti una din opreratiile de mai sus! ");}         
    }*/
//------------------------------------------------------------------------------
   // Exercitiu practic Compararea a trei numere
    System.out.print(" Introdu valoarea lui a = ");
    
    int a = sc.nextInt();
    
    System.out.print(" Introdu valoarea lui b = ");
    
    int b = sc.nextInt();
    
    System.out.print(" Introdu valoarea lui c = ");
    
    int c = sc.nextInt();
   
    NumbersComparator myObj = new NumbersComparator();
    
    myObj.Maximum(a, b, c);
    myObj.Minimum(a, b, c);
//------------------------------------------------------------------------------
    
    } 
    
}
