/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.step.converter;

/**
 *
 * @author User
 */
public class TempConverter {
    
    
    public void convertToFahr(double celsius){
    double fahrenheit;
    fahrenheit = (9/5) * celsius + 32;
    System.out.println(" 100°C -> °F = " + fahrenheit);

    }
    
    public void convertUserValueToFahr(double celsius){
    double fahrenheit;
    fahrenheit = (9/5) * celsius + 32;
    System.out.println(fahrenheit + " °F ");

    }
    
    public void convertToCelsius (double fahr){
    double celsus;
    celsus = (5/9) * (fahr - 32);
    System.out.println(" 100°F -> °C = " + celsus);

    } 
}
