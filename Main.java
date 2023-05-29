
import java.util.Scanner;

public class Main
{

   public static void printOctagon(int len){
    for(int i=0; i<len; i++){
      System.out.print(" ");  
    }
    for(int i=0; i<len; i++){
        if(i==(len-1)){System.out.println("*");}else{System.out.print("*");}
        
    }
    for(int i=0; i<(len-2); i++){
      for(int j=(len-i); j>1; j--){
        System.out.print(" ");  
    } 
    System.out.print("*");
        for(int k=0; k<(len+(2*i)); k++){
        System.out.print(" ");
        }
    System.out.println("*");
    }
    for(int i=0; i<len; i++){
      System.out.print(" ");  
       System.out.print("*");
      for(int j=0; j<((3*len)-4 ); j++){
        System.out.print(" ");
        }
        System.out.println("*");
    }
    for(int i=0; i<(len-2); i++){
      for(int j=0;j<(i+2); j++){
        System.out.print(" ");  
    } 
    System.out.print("*");
        for(int k=(((3*len)-6)-((2*i))); k>0; k--){
        System.out.print(" ");
        }
    System.out.println("*");
    }
    for(int i=0; i<len; i++){
      System.out.print(" ");  
    }
    for(int i=0; i<len; i++){
        if(i==(len-1)){System.out.println("*");}else{System.out.print("*");}
        
    }
   }
    
   public static void main (String[] args)
   {
    Scanner in = new Scanner(System.in);
    do{
    System.out.print("Enter the length: ");
    
    int length = in.nextInt();
    printOctagon(length);
}while(true);
   }
}