public class PlataObracun {

	public static void main(String[] args) {	

			
		double brojRadnihSati, cijenaSata;
		
		System.out.println("Unesi broj radnih sati: ");
		brojRadnihSati = TextIO.getDouble();

		System.out.println("Unesi cijenu sata: ");
		cijenaSata = TextIO.getDouble();

		System.out.println("Plata iznosi tacno: " + brojRadnihSati * cijenaSata);
		
	}
}