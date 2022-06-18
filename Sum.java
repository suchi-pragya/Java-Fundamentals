public class Sum {
    public static void main(String[] args){
        int array[] = {10,20,30,40,50,60,70};
        int sum =0;
        for(int i=0;i<array.length;i++)
{
    sum=sum + array[i];
}
   System.out.println("Sum of Array Elements are:"+sum);
    double average=(sum/array.length);
    System.out.format("Average of Array Elements is" +average);
    
    }
    
    
}
