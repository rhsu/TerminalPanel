package overhaul;

import java.util.Scanner;

/**
 *
 * @author rhsu
 */
public class NonPanelUI 
{
	public static void main(String[] args)
	{
		//initialize scanner: Similar to how action works
		Scanner scanner = new Scanner(System.in);
		
		int dummy;
		
		//State0
		System.out.println("Enter a number: ");
		dummy = scanner.nextInt();
		
		//State1
		System.out.println("Enter a smaller number: ");
		while(scanner.nextInt() > dummy)
		{
			System.out.println("Enter a smaller number: ");
		}
		
		//State2
		System.out.println("Done!");
	}
}
