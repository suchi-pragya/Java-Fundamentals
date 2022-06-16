import java.util.Scanner;

public class Month {
    static String [] s = new String[]{"Janurary","February", "March" , "April" ,"May" ,"June" ,"July" ,"August","September","October" ,"November","December","InvalidNumber"};
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number Between 1 to 12");
        int n = sc. nextInt();
        String str= monthName(n);
        System.out.println("Name of Month:" + str);
        sc.close();

    }
    static String monthName(int n){
        if(n>=1 && n<=12)	
		   return Month.s[n-1];
		else
		   return Month.s[12];
	}

    }
    

