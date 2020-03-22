/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.step.calculator;

/**
 *
 * @author User
 */
public class Calculator {
    
    public int Add (int a, int b){
    
    return a + b;
    }
    
    public int Add (double a, double b){
    
    return (int) (a + b);
    }
    
    public int Substract (int a, int b){
    
    return a - b;
    }
    
    public int Substract (int a, double b){
     
    return (int) (a - b);
    }
    
    
    public int Multiply (int a, int b){
    
    return a * b;
    }
    
    public int Multiply (int a, double b){
    
    return (int) (a * b);
    }
    
    public double Divide (int a, int b){
    
    return a / b;
    }
    
    public double Divide (double a, int b){
    
    return a / b;
    }
}
