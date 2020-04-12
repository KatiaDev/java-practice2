package myfirstapp;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class OutOfBound {
    //De citit de la tastatură o propoziție. De permis utilizatorului să aleagă poziția
    //caracterului care trebuie afișat.Exemplu: „Hello world” Caracterul: 1 - H, 2 - e, ….
    //În cazul in care utilizatorul introduce o poziție care nu există, de afișat: 
    //„Out of bounds”.
    static Scanner sc = new Scanner(System.in);        

    public static void main(String[] args){
        
        System.out.print("Enter your input: ");              
        String s = sc.nextLine();        
        int i = 0;
        while(i != s.length()){
            try{
                System.out.print("Enter the index: ");                    
                i= sc.nextInt();
                System.out.println("The letter on the index " + i + " is " + s.charAt(i)); 
                i++;
            }catch(StringIndexOutOfBoundsException ex){
                System.out.println("Out Of Bounds. Try Again: ");
            }
        }
    }
}


            
            
          
     
    

