package assignmnet2;

public class UserMainCode {

	public static void addAndReverse(Integer[] arr, Integer input) {
		Integer sum = 0;
		Integer last=0;
		Integer rev=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > input) {  
				sum += arr[i];
			}
		}
		System.out.println(sum);
		while (sum>0) {
			rev=rev*10+sum%10;
			sum/=10;
		}
		
		System.out.println(rev);
	}

}
