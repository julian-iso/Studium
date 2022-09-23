// Abgabe von Julian Maurus in PP1

public class Aufgabe_1_3 {

    public static void main(String[] args){
    	// Initialisieren der Höhe und Kantenlänge durch den User
    	int a = IOTools.readInteger("Bitte ganzzahligen Wert der Kantenlänge eingeben: ");
    	int h = IOTools.readInteger("Bitte ganzzahligen Wert der Höhe eingeben: ");
    	
    	double G = ((a * a) / 4.0) * Math.sqrt(3.0); // Grundfläche wird berechnet
    	double M = 3.0 * a * h; // Mantelfläche wird berechnet
    	double O = 2.0 * G + M; // Oberfläche wird berechnet
    	double V = G * h; // Volumen wird berechnet 
    	
    	// Ergebnisse werden jeweils gerundet ausgegeben
    	System.out.print("Grundfläche: " + Math.round(G) + "\nMantelfäche: " + Math.round(M) + "\nOberfläche: " + Math.round(O) + "\nVolumen: " + Math.round(V));
	


    }
}
