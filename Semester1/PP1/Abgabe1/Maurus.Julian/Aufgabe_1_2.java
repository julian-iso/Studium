// Abgabe von Julian Maurus PP1

public class Aufgabe_1_2 {
    public static void main(String[] args){	
		int a = 1, b = 2, c = 3, d = 4;
		
		
		/*  Aufgabenteil (a) 
		* Ergebnistyp: int
		* Ergebniswert: -3
		* b/c -> 0
		* 1 + 0 - d -> 1 - 4 -> -3
		*/

		int e1 = a + b / c - d;
		System.out.println("e1 = " + e1); 

		a = 1; b = 2; c = 3; d = 4; // reinitialisieren


		/* Aufgabenteil (b) 
		* Ergebnistyp: int
		* Ergebniswert : 5
		* a -> 1
		* a++ -> 1 und a = 2
		* ++a -> 3 und a = 3
		* 1 + 3 + 1 = 5 
		*/ 
		int e2 = a + ++a + a++;
		System.out.println("e2 = " + e2); 

		a = 1; b = 2; c = 3; d = 4; // reinitialisieren


		/* Aufgabenteil (c) 
		* Ergebnistyp: int
		* Ergebniswert: 6
		* ++a -> 2 und a = 2
		* d = d / a
		* d = 4 / 2 -> d = 2
		* c = c * d 
		* c = 3 * 2 -> 6 und c = 6
		* 
		*/ 

		int e3 = c *= d /= ++a;
		System.out.println("e3 = " + e3);

		a = 1; b = 2; c = 3; d = 4;  // reinitialisieren

		/*  Aufgabenteil (d) 
		* Ergebnistyp: boolean
		* Ergebniswert: false
		* a + c > d -> entspricht 1 + 3 > 4 -> entspricht 4 > 4 --> false
		* c != b + a -> entspricht 3 != 1 + 2 -> entspricht 3 != 3 --> false
		* Demnach sind beide Ausdrücke falsch und damit das Ergebnis false
		*/ 

		boolean e4 = c != b + a || a + c > d;
		System.out.println("e4 = " + e4); 

		a = 1; b = 2; c = 3; d = 4;      //  reinitialisieren
		/* Aufgabenteil (e) 
		* Ergebnistyp: int
		* Ergebniswert: 3
		* --d -> 3 und d = 3
		* d-- -> 3 und d = 2
		* ++b -> 3 und b = 3
		* a++ -> 1 und a = 2
		* ergibt:
		* (2 + 3 == 3 + 3)
		* (5 == 6) -> false daher e3 = c = 3
		*/
		int e5 = (++a + ++b ==  d-- + --d) ? a : c;
		System.out.println("e5 = " + e5); 


   }
}

