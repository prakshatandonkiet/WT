package edu.praksha.springFirstExample;

import org.springframework.stereotype.Component;

@Component
public class Calculation {
   public int getSum(int n1, int n2)
   {
	   return n1+n2;
   }
   public int getSub(int n1, int n2)
   {
	   return n1-n2;
   }
   public int getDiv(int n1, int n2)
   {
	   System.out.println("in div method");  
	   return n1/n2;
   }
   public int getMul(int n1, int n2)
   {
	   return n1*n2;
   }
}