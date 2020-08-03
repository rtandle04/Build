package com.ibm.java.fp.lambda.deep;


@FunctionalInterface
interface MyFunction {
	void sayHello();
}

public class DeepLamdaRules {

	
	public static void man(String args[]) {
		
        MyFunction function = null;
        //Version  1:
        function = () -> {
            //function body
            System.out.println("Hello ");
        };
        function.sayHello();
        //if lambda has only one line of body : remove {}
        function = () -> System.out.println("Hello ");
        function.sayHello();
	}
}
