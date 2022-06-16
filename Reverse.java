import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        int x, res=0,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        n = sc.nextInt();
         while(n!=0){
            x = n%10;
            res = (res*10)+x;
            n = n/10;
        
         }
         System.out.println("Reverse of a number is" + res);
         sc.close();

    }
    
}
