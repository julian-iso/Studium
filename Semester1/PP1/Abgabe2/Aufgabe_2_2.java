// Name: Julian Maurus

public class Aufgabe_2_2 {

    
    public static void main(String[] args){
    	long a = IOTools.readLong("Bitte geben Sie eine ganze Zahl ein: ");
    	long final_a = a;
    	while (a < 10) {
    		System.out.println("Fehler: Zahl zu klein!");
    		a = IOTools.readLong("Bitte geben Sie eine ganze Zahl ein: ");
    	}
    	
    	boolean result = true;
    	
    	while (a >= 10 || result == false) {
    		
    		int ziffer1 = (int)a % 10;
    		int ziffer2 = (int)a / 10 % 10;
    		if (ziffer2 > ziffer1) {
    			result = false;
    			break;
    		}
    		a /= 10;
    		System.out.println("a: " + a);
    		
    		
    	}
    	System.out.println("Die Ziffern der Zahl " + final_a + " sind " + (result ? "" : "nicht ") + "monoton steigend");
        
  
    }
    
}
