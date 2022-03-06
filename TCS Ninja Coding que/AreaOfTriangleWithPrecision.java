import java.util.*;
class AreaOfTriangleWithPrecision{
	public static void main(String []args)
	{
		int a=2,b=3,c=3,s;
		double area;
		s=(a+b+c)/2; 
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of triangle is :"+String.format("%.2f",area));
	}
}