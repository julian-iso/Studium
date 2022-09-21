public class Aufgabe_2_4 {

    // 1.5
    // naechsten Tausch von Bechern festlegen
    public static String nextSwap(){
        // ganzzahlige Zufallszahl aus dem Intervall [1,6]
        int zufall = (int) (Math.random() * 6) + 1;
        String action = "";  // gibt an, welche Becher getauscht werden sollen
        switch (zufall) {
        case 1:
        	action = "ab";
        	System.out.println("Tausche A mit B");
        case 2:
        	action = "ba";
        	System.out.println("Tausche B mit A");
        case 3:
        	action = "ac";
        	System.out.println("Tausche A mit C");
        case 4:
        	action = "ca";
        	System.out.println("Tausche C mit A");
        case 5:
        	action = "bc";
        	System.out.println("Tausche B mit C");
        case 6:
        	action = "cb";
        	System.out.println("Tausche C mit B");
        }

        // TODO

        
        return action;
    }

    // 1
    // Position der Kugel bestimmen
    public static int getPosition(char a, char b, char c){
        int pos = 0;
        if (a == 'x') {
        	pos = 1;
        } else if (b == 'x') {
        	pos = 2;
        } else {
        	pos = 3; 
        }

        // TODO

        return pos;
    }

    
    // 1.5
    // Position der Kugel raten
    public static int guess(){
        int pos = 0;
        do {
        	pos = IOTools.readInteger("Bitte geben Sie eine Zahl ein: ");
        } while ((pos <= 0) || (pos > 3));
        // TODO

        return pos;
    }


    // 3
    public static void main(String[] args){
        // Initialisierung der Becher (a und c leer, b belegt)
        char a = '-', b = 'x', c = '-';

        for (int i = 1;i <= 7; i++){
            String action = nextSwap();
            switch (action) {
                case ("ab"):
		    action = "ba";
		    break;
	        case ("ba"):
                    action = "ab";
                    break;
	        case ("bc"):
		    action = "cb";
		    break;
	        case ("cb"):
		    action = "bc";
		    break;
	        case ("ac"):
	            action = "ca";
		    break;
	        case ("ca"):
		    action = "ac";
		    break; 
		
            	
            }

            // TODO
        }

        
        int guessPos = guess();
        int truePos = getPosition(a,b,c);       

	if (guessPos == truePos) {
	    System.out.println("Glückwünsch Sie haben gewonnen");
	} else {
            System.out.println("Leider verloren");
        }

	System.out.println(a + b + c);
        // TODO
        
    }
    
}
