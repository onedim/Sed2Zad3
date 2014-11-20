/*broj koji pozitivan int jednak polovini
 * svojih divizora ( 1 + 2 + 3 + 6 ) / 2 = 6.
 */
public class SavrsenBroj {

		public static void main(String[] args) {
			
		System.out.print("Unesite broj");
		double number = TextIO.getDouble();
		double sum=0;
		for (int i=1; i<number/2; i++) {
			
		if (number%i==0)
		{
		sum=sum+i;
		}
		}
		if (number==sum)
		{
		System.out.print("Broj je savrsen!");
		}
		else
		{
		System.out.println("Broj nije savrsen.");
		}
		}
	
}	


