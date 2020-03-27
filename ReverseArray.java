import java.util.Scanner;

public class ReverseArray {
   public static void main(String [] args){
   
    //O aplicație care afișează elementele unui array cu numere întregi în ordine inversă. 
   //Array-ul trebuie inițializat de la tastatură.

   Scanner sc = new Scanner(System.in);
   
   int [] myArray = new int [10];
   
   for (int i = 0; i < myArray.length; i++){
       
       System.out.print(" i = " );
       myArray[i] = sc.nextInt();
   }
   
   System.out.println(" The reverse of your array is: ");
   
   for (int i = myArray.length -1; i >= 0; i--){
   
    System.out.println(" i = " + myArray[i] );
   
   }
    
   }
    
}
