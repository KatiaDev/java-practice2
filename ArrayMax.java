package myfirstapp;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ArrayMax {
    
    public static void main(String[] args){
  //O aplicație care găsește numărul maxim/minim dintr-un array de int-uri.
  //Array-ul trebuie inițializat de la tastatură.  
  
  int[] myArray = new int[10];
  Scanner sc = new Scanner (System.in);
  
  for (int i = 0; i < myArray.length; i++){
      System.out.print(" i = ");
      myArray[i] = sc.nextInt();
  }
  
  System.out.println("Array[i] Min = " + getMin(myArray, 10));
  System.out.println("Array[i] Max = " + getMax(myArray, 10));
      
    }
    
    static int getMin(int arr[], int n){
        int result = arr[0];
        for (int i = 1; i < n; i++){
        
        result = Math.min(result, arr[i]);
        }
    return result;
    
    }
    
    static int getMax(int arr[], int n){
        int result = arr[0];  
        for (int i = 1; i < n; i++){
        
        result = Math.max(result, arr[i]);
        }
    return result;
    }
      
}
