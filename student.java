import java.util.Scanner;
public class student
{
    public static void main(String[] args) 
    {
        int n, total = 0, percentage;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of subject:");
        n = s.nextInt();
        int m[] = new int[n];
        System.out.println("Enter marks out of 100:");
        for(int i = 0; i < n; i++)
        {
	
            m[i] = s.nextInt();
	if(m[i]>100)
	{
	System.out.println("enter the valid mark lessthan 100");
	break;
        }
	else
	{
	    
            total = total + m[i];
        }
	}
        percentage = total / n;
        System.out.println("Sum:"+total);
        System.out.println("Percentage:"+percentage);
    }
}
