
public class OperacijeNad2Broja {

	public static void main(String[] args) {
		float br1;
		float br2;
		do {
		System.out.println("unsite prvi");
		br1=TextIO.getFloat();
		System.out.println("unsite drugi");
		br2=TextIO.getFloat();
		if (br2==0){
		System.out.println("Zbog djeljenja drugi broj nemoze biti 0");	
			
		}
		else
			
		System.out.println("Zbir je:\n "+br1+br2);
		System.out.println("Proizvod je:\n "+br1*br2);
		System.out.println("Kolicnik je:\n "+br1/br2);
		System.out.println("Ostatak pri djeljenju:\n "+br1%br2);
		
		}
		while (br1!=0 || br2!=0);		{
			
		}
		System.out.println("Kraj programa");
	}

}


	


