// Name: Julian Maurus
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

        
        return pos;
    }

    
    // 1.5
    // Position der Kugel raten
    public static int guess(){
        int pos = 0;
        do {
        	pos = IOTools.readInteger("Bitte geben Sie eine Zahl ein: ");
        } while ((pos <= 0) || (pos > 3));        

        return pos;
    }


    // 3
    public static void main(String[] args){
        // Initialisierung der Becher (a und c leer, b belegt)
        char a = '-', b = 'x', c = '-';

        for (int i = 1;i <= 7; i++){
            String action = nextSwap();
	    	char tmp;
	    
            switch (action) {
		
                case ("ab"):
		    
		    		tmp = a;
					a = b;
					b = tmp;
					break;
		    
				case ("ba"):
		    
                    tmp = b;
					b = a;
					a = tmp;
                    break;
		    
	        	case ("bc"):
		    
					tmp = b;
					b = c;
					c = tmp;
					break;
		    
	        	case ("cb"):
		    
					tmp = c;
					c= b;
					b = tmp;
					break;

	        	case ("ac"):
		    
					tmp = a;
					a = c;
					c= tmp;
					break;
		    
				case ("ca"):

					tmp = c;
					c = a;
					a = tmp;
					break;
		
            	
            }
	    
        }

        
        int guessPos = guess(); // gibt die Position aus, welche der Spieler geraten hat
        int truePos = getPosition(a,b,c); // gibt die korrekte aktuelle Positionaus       

		if (guessPos == truePos) { // prüft ob der Spieler richtig geraten

			System.out.println("Glückwünsch Sie haben gewonnen"); // Nachricht wenn man richtig geraten hat

		} else { // falls der Spieler falsch geraten hat

				System.out.println("Leider verloren"); // Nachricht wenn man falsch geraten hat

			}

		System.out.println(a+b+c);

        
        
    }
    
}
