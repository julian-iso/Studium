// Abgabe von Julian Maurus PP1

public class Aufgabe_1_1 {
    public static void main(String[] args){
	// Systen.out.println("Übung " + 1 + ':');
    	System.out.println("Übung " + 1 + ':');
    	// Schreibfehler bei System (Systen) und falsche Einrückung
    	// Lösung: Schreibfehler berichtigen und richtig einrücken
    	
    	
        // int a1=1,a2=a1;a3=a1+a2;
    	int a1 = 1, a2 = a1, a3 = a1 + a2;
    	// Beim initialisieren und deklarieren von mehreren Variablen in einer Zeile 
    	// benutzt man als Trennzeichen ein Komma und kein Semicolon
    	// Lösung: Semikolon beim Trennen der Variablen durch ein Komma ersetzt
    	
        // boolean b = (3 < 2);
    	// richtig
    	
    	
        // short s1 = 33333;
    	int s1 = 33333;
    	// Der Datentyp short hat lediglich einen Bereich von -32768 bis 32767, 
    	// die Zahl 33333 ist also zu groß um einem short zugewiesen zu werden
    	// Lösung: Datentyp von short auf int geändert
    	
        // char c1 = 'ü';
    	// richtig 
    	
    	
        // char c2 = '1', c3 = c2 + 1;
    	char c2 = '1', c3 = (char) ((c2) + 1);
    	// c3 wird als char initialisiert, da aber eine Rechnung mit int stattfindet, 
    	// ist das Ergebnis auch vom Typ int und wir können einem char keinen Wert vom Typ int zuweisen
    	// Lösung: Ergebnis zu einem char casten
    	
    	
    	
        // float f = 1.0;
    	float f = 1.0f;
    	// Es fehlt ein "f" hinter der Gleitkommazahl, deswegen wird der float wie ein double behandelt
    	// Lösung: "f" nach Gleitkommazahl einfügen
    	
    	
    	
    	
        // double d = 1E2E;
    	double d = 1E2;
    	// Ein Gleitkomma Literalkonstante besteht immer aus: Mantisse, Exponentialanteil und Typ-Suffix
    	// In diesem Beispiel gab es zwei Exponentialanteile, was unzulässig ist
    	// Lösung: Letzten Exponentialanteil entfernen
    	
    	
        // int i = 'uOOOO';
    	int i = '\u0000';
    	// wenn man einem numerischen Datentypen diesen Wert zuweisen will, 
    	// braucht man einen Backslash als Trennzeichen
    	// außerdem existiert der zugewiesen Wert nicht, da der Wertebereich des Datentyps nur bis '\uffff' geht 
    	// Lösungen: 1. Backslash hinzugefügt 2. alle O´s durch Nullen ersetzt
    	
    	
        // long l = 0xABC;
    	// richtig
    	
    	
    // char c = '\';
    	char c = '\\';
    	// da der Backslash eine Literalkonstante ist, muss er von einem anderen Backslash eingeleitet werden
    	// Zusätzlich falsch eingerückt
    	// Lösung: Zweiten Backslash eingefügen und richtig einrücken
    	
        //short s2 = 10, s3 = 3, s4 = (short) s2 % (short) s3;
    	short s2 = 10, s3 = 3, s4 = (short) ((short) s2 % (short) s3);
    	// Das Ergebnis von s4 liefert einen Ergebnis mit dem Typ int, da s4 aber als short initialisiert ist, 
    	// kann man ihm keinen Wert vom Typen int zuweisen
    	// Lösung: Ergebnis von s4 zu short casten
    	
    	
    	
    	
        //int bb = (0x1 < 0x2) ? (0xA / 0x5) : 0x;
    	int bb = (0xA / 0x5);
    	// Da die obige Bedingung sich auf zwei Konstanten bezieht, also immer true ist kann der zweite Teil 
    	// weggelassen werden 
    	// Außerdem ist der Wert 0x unzulässig, 0x ist nämlich kein Wert sondern nur der Anfang eines Literals
    	// Lösung: Bedingung entfernt da sie immer true ist, 
    	// und der syntaktische Fehler mit 0x ist damit automatisch mit behoben (
    	// ansonsten hätte man 0x durch ein Literal mit einem Wert ersetzen müssen)
    	
    	
        
   }
}
