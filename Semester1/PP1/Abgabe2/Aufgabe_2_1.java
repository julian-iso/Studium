// Name: Julian Maurus


public class Aufgabe_2_1 {
    public static void main(String[] args){
	/* *** Aufgabenteil (a)  *** */
	/* f(n) = 
	 * 1. Es wird eine Zahl n eingelesen
	 * 2. Das Ergebnis (erg1) ist zu Beginn 0 
	 * 3. Die Schleife startet bei der Hälfte von n und läuft bis 1
	 *    a) in jedem Schleifendurchlauf wird geprüft ob n durch den aktuellen Wert von i ohne Rest teilbar ist 
	 *    b) ist n durch das aktuelle i teilbar wird das aktuelle i auf das Ergebnis addiert
	 *    c) ist n nicht durch das aktuelle i teilbar, wird 0 auf das Ergebnis addiert
	 * 4. Das Ergebnis wird ausgegeben und hat den Wert der Addition von allen Teilern abwärts laufend von der Hälfte von n 
	 * --> Das Ergebnis ist also die Summe aller echten Teiler der Zahl n
	 * 
	 * 
	 * 
	 */
        
	int n = IOTools.readInteger("n = ");

	int erg1 = 0;

	for (int i=n/2;i>0;i--){
			System.out.print(i + " ");
            erg1 += ((n%i) == 0) ? i : 0;
        }

	System.out.println("(a) Ergebnis:   = " + erg1 + "\n");


    /* *** Aufgabenteil (b)  *** */
	/* f(i,j) = 
	 * 1. Es wird eine Zahl n eingelesen
	 * 2. Das Ergebnis (erg2) ist zu Beginn 0
	 * 3. Die erste Schleife wird n-Mal ausgeführt, und increased dabei i bei jedem Durchlauf um 1
	 * 4. Die Zweite SChleife läuft immer i-Mal ob und inreased bei jedem Durchlauf das Ergebnis um 1
	 * 
	 * 
      

    */
        
    n = IOTools.readInteger("n = ");
	int erg2 = 0;

	
	for (int i=1;i<=n;i++){
		System.out.println("i: " + i);
	    for (int j=1;j<=i;j++){
	    	System.out.println("j: " + j);
                ++erg2;
                System.out.println(erg2);
            }
	}

	System.out.println("(b) Ergebnis:   = " + erg2 + "\n");

    /* *** Aufgabenteil (c)  *** */
	/* 
    * 1. Es wird eine Zahl n eingelesen 
	* 2. Das Ergebnis (erg3) ist zu Beginn 0
	* 3. Solgane n größer als 0 ist
	*    a. das Ergebnis wird verzehnfacht
	*    b. die letze Stelle des Ergebnisses wird entfernt und zum ergebnis addiert
	*    c. Das Ergebnis wird durch 10 geteilt
	* 4.
    */
	
	n = IOTools.readInteger("n = ");
	int erg3 = 0;

        while (n > 0){
            erg3 *= 10;
            erg3 += n%10;
            n /= 10;
	    System.out.println("n: " + n + " e: " + erg3);
        }

	
	System.out.println("(c) Ergebnis:   = " +  erg3);

    }
}
