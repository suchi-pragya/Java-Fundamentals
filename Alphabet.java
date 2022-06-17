import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        sc.close();
        if(c1>c2){
        System.out.println(c2 +","+c1);
        }
        else{
            System.out.println(c1 + ","+ c2);
        }
    }
}
 