package myfirstapp;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WrongInput {
    
    //Aplicația trebuie să citească un număr întreg de la tastatură, iar în cazul în care 
    //intervine vreo eroare, de afișat la ecran „Wrong input” 
    //și de permis repetarea introducerii.

    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String [] args){
        
        System.out.print("Enter an integer: ");
        
        int i = GetAnInteger();
        
        System.out.println("You entered " + i);
    
    }
    
    public static int GetAnInteger()
    {
        while (true)
        {
            try
            {
                return sc.nextInt();
            }
            catch (InputMismatchException e)
            {
                sc.next();
                System.out.print("Wrong Input. Try again: ");
            }
        }
    }
}
  
        
        
     
        
