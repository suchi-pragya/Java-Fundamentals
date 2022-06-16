import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        // int number =100;
        //  if(number>0){
        //     System.out.println(number + "is a Positive number");
        //  }
        //  else if(number<0){
        //     System.out.println(number+"is a Negative number");
        //  }
        //  else{
        //     System.out.println(number +"is neither Positive nor Negative");
        //  }
        int num;
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter any number");
        num= sc.nextInt();
        if(num>0){
            System.out.println(num +"is a Positive Number");
        }
        else if (num<0){
            System.out.println(num+ "is a Negative Number");
        }
        else{
            System.out.println("It's Zero");
        }
        sc.close();
        }

    }

    


    

