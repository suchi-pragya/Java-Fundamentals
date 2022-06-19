public class Integer {
    public static void main(String[] args) {
        int[] num = {1,4,34,56,7};
        int x = 7;//search for element in array
        int index = -1;
        
        for (int i = 0; i < num.length; i++) {
        if (num[i] == x) {
        index = i + 1;
        break;
        }
        }
        
        System.out.println("At position :" + index);
        }
    
}
