import java.util.Scanner;

public class Digit_sum{
    public static void main (String[] args){
        int x,y, sum=0;
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
         x = sc.nextInt();

         while(x>0){
          y = x % 10;
          sum = sum + y;
          x = x / 10;

         }
         System.out.println("Sum of digits:" + sum);
        
            sc.close();
         }

    }
    

