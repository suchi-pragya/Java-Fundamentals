import java.util.Scanner;

public class Sample {
    public static void main(String[] args){
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        x = sc.nextInt();
        if(x%2 == 0){
            System.out.println(x+" is Even");
        }
        else{
            System.out.println(x +"is Odd");
        }
        
        sc.close();

    }
    
}
