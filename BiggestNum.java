public class BiggestNum {
    public static void main(String[] args) 
    {
         int a=args.length;
         int[] arr[]=new int[3][3];
         if(a<9)
            {
            System.out.println("enter 9 values");
            }
         if(a==9)
                
            {
                int k=0;
               for(int i=0;i<3;i++)
               {
                for(int j=0;j<3;j++)
                {
                    
                  arr[i][j]=Integer.parseInt(args[k]);
                  k++;
                }
                
              }
              int max=Integer.MIN_VALUE;
              System.out.println("The given array is:");
                for(int i=0;i<3;i++)
                {
                    for(int j=0;j<3;j++)
                    {
                        if(arr[i][j]>max)
                            max=arr[i][j];
                    System.out.print(arr[i][j]+" ");
                    }
                    System.out.println();
    
                }
                System.out.println(" the maximum value is "+max);
               
      
           }
    
}
}
