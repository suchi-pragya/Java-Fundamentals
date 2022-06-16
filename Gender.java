public class Gender {
    public static void main(String[] args){
        String gender = args[0];
        int age = Integer. parseInt(args[1]);
        if(gender.equalsIgnoreCase("Female")){
            if(age>=1 && age<=58){
                System.out.println("Intrest = 8.2%");
            }
            else if ( age>58 && age<=100){
                System.out.println("Intrest= 9.2%");
            }
            else{
                System.out.println("No result");
            }
        }
            else {

                if(age>=1&&age<=58)
                   System.out.println("Interest=8.4%");
 
                else if(age>58&&age<=100)
                    System.out.println("Interest=10.5%");
 
                else 
                    System.out.println("No result");
 
         }
        }

        }
    
    

