package myfirstapp;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class FindCharacter {
    public static void main(String[] args) {
   // O aplicație care inițializează de la tastatură un array de char-uri (10). 
  //Apoi îl parcurge și pentru fiecare afișează dacă e vocală sau consoană. 
  
        char[] arr = new char[10]; 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please, enter a Letter: ");
        for (int i = 0; i < arr.length; i++){

            arr[i] = sc.nextLine().charAt(0);
   
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u'){
                System.out.println("Char: " + arr[i] + " is a vowel"); 
            }
            else if(arr[i] >= 'a' && arr[i] <= 'z'){
                System.out.println("Char: " + arr[i] + " is a consonant");
            }
            else {System.out.println("Error! " + arr[i] + " is not a Letter!");}      
    }
    
    }
}

       
   
   
    
    
    

