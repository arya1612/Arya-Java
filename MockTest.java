/*
 * MockTest.java
 * 
 * Copyright 2020 Arya Sharma <aryasharma@Aryas-Air>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.Scanner;

import java.util.Scanner;
 
 public class MockTest
 {
	 public static void main(String[] args) {
	 int power;
	 int base;
	 int n;
	 double negativePower;
	 
	 System.out.println("Arya Sharma");
	
		Scanner scanner = new Scanner(System.in);
	  System.out.println("Enter a number: "); /* this is to enter a number which in this case is 6*/
	      n = Scanner.nextInt();
       if (n < 0)
	  { 
	  System.out.println("Error Input less then 0");
      }

		 {
		    n = IBIO.inputInt("Number of terms to calculate = ");
		int f = 0;
		int s = 1;
		int t = f + s;
		int counter = 2;
		
		IBIO.out(f + " " + s + " ");
		while( counter <= n )
		{
			IBIO.out( t + " " );
			f = s;
			s = t;
			t = f + s;
			counter++;
		}
		
		IBIO.output("\n---------------------------\n");
		
		f = 0; 
		s = 1; 
		IBIO.out(f + " " + s + " ");
		for(int i = 2; i <= n; i++)
		{
			t = f + s;
			IBIO.out(t + " ");
			f = s;
			s = t;
		}
	
		double sum = 0;
		int c = 0;
		do
		{
			double n = IBIO.inputDouble("Enter a number (0 exits): ");
			if( n == 0 )
			{	break;
			} else {
				sum = sum + n;	// sum += n;
				c++;
			}
		} while(true);
		IBIO.output("Inputs  = " + c );
		IBIO.output("Sum     = " + sum );
		IBIO.output("Average = " + (sum / c) );
	}
}
}
