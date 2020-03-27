import java.util.Scanner;

public class ArraySum {
   public static void main(String [] args){
   
    //O aplicație care calculează suma elementelor dintr-un array de numere întregi. 
   //Array-ul trebuie inițializat de la tastatură
  
   Scanner sc = new Scanner(System.in);
   
   int [] myArray = new int [10];
   int summ = 0;
   
   for (int i = 0; i < myArray.length; i++){
       
       System.out.print(" i = " );
       myArray[i] = sc.nextInt();
       summ += myArray[i];  
   }
   
   System.out.println(" Suma tabloului unidimensional = " + summ);
    
   }
    
}
