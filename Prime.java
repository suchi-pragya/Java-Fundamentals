import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
    //    int num = 29;
    //    boolean isprime = true;
    //     for(int i=2; i<num/2;i++){
    //       if(num%i==0){
    //         isprime = false;
    //     break;       
    //    }
    //     }
    //     if(isprime){
    //         System.out.println(num+"is a Prime Number");
    //     }
    //     else{
    //         System.out.println(num + "is not a Prime Number");

    //     }

    System.out.println("Enter a number ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
    sc.close();
	primeCal(n);
	}
   static void primeCal(int num)
   {
	int count=0;
	for(int i=1;i<=num;i++)
	{
	   if(num%i==0)
	   {
	        count++;	        
	   }
	}
	if(count==2)
	       System.out.println("prime number ");
	else
	System.out.println("Not a prime number ");


    }

    
}
