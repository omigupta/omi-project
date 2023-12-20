package recursion_argument;

public class sum_three_number {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The sum is:"+sum(sum(13,45),40));
	}

	public static int sum(int a,int b)
	{
		return a+b;
	}
}
