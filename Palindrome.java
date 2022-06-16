import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        int n, s=0,c,r;
        System.out.println("Enter any Number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c = n;
        while(n>0){
            r =n%10;
            s = (s*10)+r;
            n = n/10;
        }
        if(c==s){
            System.out.println("It is a Palindrome Number");
        }
        else{
            System.out.println("It is not a palindrome Number");
        }
        sc.close();
    }
    
}
