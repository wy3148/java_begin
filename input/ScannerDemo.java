import java.util.Scanner; 


//From java5 , using scanner is simplier way
public class ScannerDemo {  
    public static void main(String[] args) {  
        Scanner scan = new Scanner(System.in); 

        System.out.println("Please try input");

        if(scan.hasNext()){   
        	String str1 = scan.next();
        	System.out.println("Your input："+str1);  
        }  
    } 
} 