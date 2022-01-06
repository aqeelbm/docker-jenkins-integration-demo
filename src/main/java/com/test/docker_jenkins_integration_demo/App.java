package com.test.docker_jenkins_integration_demo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("It's new years day ...");
        
        call();
        
        callMeAfterCall();
    }

	private static void callMeAfterCall() {
		System.out.println("in callMeAfterCall() methid");
	}

	private static void call() {
		System.out.println("in call() methid");
	}
}
