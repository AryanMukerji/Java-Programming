class Area
{
    void square_area(double x)
    {
		double z = Math.pow(x, 2);
        System.out.println(" The area of the square : " + z );
    }
    void triangle_area(float x, float y)
    {
		double z = (x * y)/2;
        System.out.println(" The area of the triangle : " + z );
    }
    void circle_area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println(" The area of the circle : " + z );
    }
}

public class MyProg3
{
	public static void main(String[] args) 
	{
		Area ob = new Area();
		ob.square_area(5);
		ob.triangle_area(11,12);
		ob.circle_area(2.5);
	}
}