// Abgabe von Julian Maurus in PP1

public class Aufgabe_1_4 {
    public static void main(String[] args){
        int zahl = readInt4();  // vierstellige ganze Zahl einlesen
        
        //Initialisieren der vier Variablen mit den Werten der einzelnen Ziffern
        int ziffer1 = zahl / 1000 % 10;   
        int ziffer2 = zahl / 100 % 10;  
        int ziffer3 = zahl / 10 % 10;  
        int ziffer4 = zahl % 10;  
        
        // Überprüfen der Ziffernfolge auf Monotonie indem man die einzelnen Ziffern miteinander vergleicht
        boolean checkIfMonoton = (ziffer1 <= ziffer2) && (ziffer2 <= ziffer3) && (ziffer3 <= ziffer4) ?  true : false;
        
        // Ausgabe des entsprechenden Ergebnisses
        System.out.println("Die Ziffern der Zahl " + zahl + " sind " + (checkIfMonoton ? "" : "nicht ") + "monoton steigend");
    }
        
        

    
    /* Methode liest eine vierstellige Zahl ein */
    public static int readInt4() {
        int x = 0;
        do {
            x = IOTools.readInteger("4-stellige ganze Zahl: ");
        } while ((x < 1000) || (x > 9999));
		return x;
    }
}