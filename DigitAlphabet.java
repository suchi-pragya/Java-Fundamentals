import java.util.Scanner;

public class DigitAlphabet {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char char1 = scanner. next().charAt(0);
        
        if(char1>=48 && char1<=57){
            System.out.println("char is a Digit");
        }
        else if ( (char1>='a'&& char1<='z') || (char1>='A' && char1<='Z')){
            System.out.println("Char is an Alphabet");
        }
        else{
            System.out.println("Char is Special Character");
        }
       
        scanner.close();
       
            
        }

    }

    

