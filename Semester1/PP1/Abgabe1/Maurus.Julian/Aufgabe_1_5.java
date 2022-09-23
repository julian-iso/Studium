// Abgabe von Julian Maurus in PP1

public class Aufgabe_1_5 {
    public static void main(String[] args){
    	// Ausgabe zum Start des Programms
    	System.out.println("Bitte geben Sie nun drei ganzzahlige Zahlen ein."); 
    	
    	// User wird aufgefordert drei ganzzahlige Zahlen einzugeben 
    	int zahl1 = IOTools.readInteger("Geben Sie nun bitte die erste Zahl ein: "); 
    	int zahl2 = IOTools.readInteger("Geben Sie nun bitte die zweite Zahl ein: "); 
    	int zahl3 = IOTools.readInteger("Geben Sie nun bitte die dritte Zahl ein: "); 
    	
    	//Minimum wird errechnet
    	int minimum = (zahl1 <= zahl2) && (zahl1 <= zahl3) ? zahl1 : (zahl2 <= zahl3) ? zahl2 : zahl3;
    	
    	//Maximum wird errechnet
    	int maximum = (zahl1 >= zahl2) && (zahl1 >= zahl3) ? zahl1 : (zahl2 >= zahl3) ? zahl2 : zahl3;
    	
    	//Ausgabe der maximalen Differnez
    	System.out.println("Maximale Differenz: " + (maximum - minimum));
    }
}

