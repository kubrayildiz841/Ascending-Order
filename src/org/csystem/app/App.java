package org.csystem.app;

 class App {
		public static void main(String [] args)
		{	
			java.util.Scanner kb= new java.util.Scanner(System.in) ;
			System.out.print("Birinci sayiyi giriniz:");
			int val1= Integer.parseInt(kb.nextLine());
			
			System.out.print("Ikinci sayiyi giriniz:");
			int val2= Integer.parseInt(kb.nextLine());
			
			System.out.print("Ucuncu sayiyi giriniz:");
			int val3= Integer.parseInt(kb.nextLine());
			
			Sort.SmalltoLarge(val1, val2, val3);
			kb.close();
		}
	}
	class Sort {
		public static void SmalltoLarge(int a, int b, int c)
		{
			if (a < b && b < c)
				System.out.printf("%d < %d < %d", a, b, c);
			else if (a == b && a < c)
				System.out.printf("%d = %d < %d", a, b, c);
			else if (a < b && b == c)
				System.out.printf("%d < %d = %d", a, b, c);
			else if (a < c && c < b)
				System.out.printf("%d < %d < %d", a, c, b);
			else if (a == c && c < b)
				System.out.printf("%d = %d < %d", a, c, b);	
			else if (b < c && c < a)
				System.out.printf("%d < %d < %d", b, c, a);
			else if (b < c && c == a)
				System.out.printf("%d < %d = %d", b, c, a);
			else if (b == c && c < a)
				System.out.printf("%d = %d < %d", b, c, a);
			else if (b < a && a < c)
				System.out.printf("%d < %d < %d", b, a, c);
			else if (c < b && b < a)
				System.out.printf("%d < %d < %d", c, b, a);	
			else if (c < b && b == a)
				System.out.printf("%d < %d = %d", c, b, a);
			else if (c < a && a < b)
				System.out.printf("%d < %d < %d", c, a, b);
			else 
				System.out.printf("%d = %d = %d", a, b, c);
		}
	}
