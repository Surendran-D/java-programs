package collection;

import java.util.Scanner;

class Binary {

	public void binary1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a decimal value");
		int n, s = 0, p = 1;
		n = sc.nextInt();
		int c = n;
		while (n != 0) {
			s = ((n % 2) * p) + s;
			n = n / 2;
			p = p * 10;
			// System.out.println(s);

		}
		System.out.println("the binary conversion of " + c + " is " + s);
	}

}

class Decimal {

	public void decimal1() {
		Scanner sd = new Scanner(System.in);
		int d;
		System.out.println("enter a binary value");
		d = sd.nextInt();
		// 0111=7 1*2(0)=1*1=1 1*2(1)=2 1*2(2)=4 0*2(3)=0 1+2+4=7
		int s=0;
		int i=0;
		int m=d;
		
      while(d!=0)
      {
    	  
    	  int a=d%10; // 0111 
    	  s=  a*(int)Math.pow(2, i)+s;
    	  d=d/10;
    	  i++;
    	  }
      System.out.println("the decimal conversion of " + m + " is " + s);
    	  
      }
		
	}



public class Polymorphism1 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int a;
		System.out.println("enter the binary or decimal conversion (1 or 2)");
		a = sc1.nextInt();
		Binary bi = new Binary();
		Decimal di = new Decimal();

		switch (a) {
		case 1:
			bi.binary1();
			break;
		case 2:
			di.decimal1();
			break;
		default:
			System.out.println("invalid selection");

		}

	}

}
