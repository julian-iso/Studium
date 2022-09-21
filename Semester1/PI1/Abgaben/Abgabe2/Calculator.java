public class Calculator {
	
    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
    
    public static int myOwnModulo(int dividend, int divisor) {
    	return sub(dividend, multiply(divide(dividend,divisor), divisor));
    }
    
    public static void main(String[] args) {
        //System.out.println(add(2,2));
        //System.out.println(sub(2,2));
        //System.out.println(multiply(2,2));
        System.out.println(myOwnModulo(5,2));
        
        
        int matrikelnr = 0;
        int ergebnis = matrikelnr % 42;
        
        


        
    
    }
}
