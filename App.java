package edu.praksha.springFirstExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new AnnotationConfigApplicationContext(ConfigAOP.class);
        Calculation cal =(Calculation) context.getBean(Calculation.class);
        System.out.println("Sum of two number is="+cal.getSum(35,45));
        System.out.println("Subtraction of two number is="+cal.getSub(35,45));
        System.out.println("Division of two number is="+cal.getDiv(35,45));
        System.out.println("Multiplication of two number is="+cal.getMul(35,45));
       ((AnnotationConfigApplicationContext)context).close();
    }
}