public class MyProg1
{
	public static void main(String[] args) 
	{
		int num = Integer.parseInt(args[0]);
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
	}
}