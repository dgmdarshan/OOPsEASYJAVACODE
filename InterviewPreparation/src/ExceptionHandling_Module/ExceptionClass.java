package ExceptionHandling_Module;

public class ExceptionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8};
		System.out.println(arr[1]);
		try {
			System.out.println(arr[2]);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println(arr[0]);
		}
		

	}

}
