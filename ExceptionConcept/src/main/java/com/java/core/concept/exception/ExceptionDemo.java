package com.java.core.concept.exception;

/**
 * Hello world!
 *
 */
public class ExceptionDemo 
{
    public static void main( String[] args )
    {
        int a = 5, b = 0;
        try {
        System.out.println(a/b);
        }catch(ArithmeticException ae) {
        	System.out.println("catch block::"+ae.getMessage());
        }
    }
}
