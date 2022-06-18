public class Program1 {
    static void conditionalSum(int l[], int a, int b) {

		int sum = 0;
		boolean add = true;
		
		for (int i=0; i<l.length; i++) {

			if (l[i] != a && add == true)

				sum = sum + l[i];
			
			else if (l[i] == a)
				add = false;

			else if (l[i] == b)
				add = true;

		}

		System.out.println(sum);

	}

	public static void main(String[] args) {

		int arr[] = {10,3,6,1,2,7,9};
		int a = 6;
		int b = 7;
		conditionalSum(arr,a,b);

    
}
}
