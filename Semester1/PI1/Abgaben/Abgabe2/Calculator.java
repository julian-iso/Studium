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
        System.out.println(add(2,2));
        System.out.println(sub(2,2));
        System.out.println(multiply(2,2));
        System.out.println(divide(2,2));
        System.out.println(myOwnModulo(9,2));
        
        
        int matrikelnr = 1923821;
        int ergebnis = matrikelnr % 42;
        int myergebnis = myOwnModulo(matrikelnr, 42);
        
        // Ausgabe zum Überprüfen ob die Ergbnisse identisch sind
        System.out.println(ergebnis);
        System.out.println(myergebnis);
        // Ausgabe zeigt: Die Ergebnisse sind identisch
        


        
    
    }
}
