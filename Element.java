public class Element {
    public static boolean main(String[] args){
        boolean only14(int[] nums) {

            boolean flag = false;
          
            for (int i = 0; i < nums.length; i++) {
          
              if (nums[i] == 1 || nums[i] == 4) {
                flag = true;
              } else {
                return false;
              }
            }
            return flag;
          }
    }
    
}
