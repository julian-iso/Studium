public class Aufgabe_2_3{
    // Aufgabenteil (a)
    // 3 4 6 9 13 18 24 ...
    // Schema: an = an + n
    public static void folge_a() {
    	int n = 15;
    	int a = 3;
    	for (int i = 1; i <= n; i++) {
    		System.out.print(a + " ");
    		a += i;
    	}
        
    }

    // Aufgabenteil (b)
    // 4 5 3 6 7 5 8 9 ...
    // Schema:
    public static void folge_b() {
    	int n = 15;
    	int a = 4;
    	int state = 1;
    	for (int i = 0; i <= n; i++) {
    		System.out.print(a + " ");
    		switch (state) {
    		case 1:
    			a += 1;
    			state = 2;
    			break;
    		case 2:
    			a -= 2; 
    			state = 3;
    			break;
    		case 3:
    			a += 3;
    			state = 1;
    			break;
    		}
    		
    	}
        
    }
    
    // Aufgabenteil (c)
    // 3 4 6 3 7 12 6
    // Schema:
    public static void folge_c() {
    	int n = 15;
    	int a = 3;
    	int check = 0;
    	for (int i = 1; i <= n; i++) {
    		System.out.print(a + " ");
    		switch (check) {
    			case 0:
    				a = a + i;
    				check = 1;
    				break;
    			case 1:
    				a = a + i;
    				check = 2;
    				break;
    			case 2:
    				a = a - i;
    				check = 0;
    				break;
    		
    		}
    	
    	}
        
    }

    
    public static void main(String[] args){
        System.out.println("Aufgabenteil (a)");
        folge_a();  // erste Folge berechnen und ausgeben
        System.out.println("\nAufgabenteil (b)");
        folge_b();  // zweite Folge berechnen und ausgeben
        System.out.println("\nAufgabenteil (c)");
        folge_c();  // dritte Folge berechnen und ausgeben
        System.out.println();
    }


}
