//odredjivanje primarnog broja
public class PrimeNumber {

	public static void main(String[] args) {
		
	int i = 2;	//prema formuli mora biti djeljivo sa 2
	int mRezultat = 0;
	int mBroj;
	System.out.println("Unesite broj za provjeru");
	mBroj = TextIO.getInt();
	while (i <= mBroj / 2) { //dok je broj veci ili jednak i 
	 
	if (mBroj % i == 0) {
		mRezultat = 1;
	}
	
	i++;
	
	}
	if (mRezultat == 1)  {
		System.out.println("Broj " + mBroj + " nije primaran");
	
	}
	else {
		  System.out.println("Broj " + mBroj + " je primaran");
	  
	}
	}
}