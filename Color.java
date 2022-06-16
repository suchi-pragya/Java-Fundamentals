import java.util.Scanner;
public class Color {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter color of Your Choice");
        char choice = sc.next() . charAt(0);
        sc.close();
        switch (choice){
            case 'R':
            System.out.println("Red");
            break;
            case 'B':
            System.out.println("Blue");
            break;
            case 'G':
            System.out.println("Green");
            break;
            case 'O':
            System.out.println("Orange");
            break;
            case 'Y':
            System.out.println("Yellow");
            break;
            case 'W':
            System.out.println("White");
            break;
            default:
            System.out.println("InvalidCode");
            break;
            

        }
    }
    
}