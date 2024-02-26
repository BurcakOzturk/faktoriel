import java.util.Scanner;
public class faktoriel {

	public static void main(String[] args) {
	
		
		int n,r;
		long nFakt=1,rFakt=1,nRfakt=1;
		float sonuc;
		
		
		//(n,r) = n!/(r!*(n-r)!)
		Scanner scan = new Scanner(System.in);
		System.out.println("Kombinasyon hesabı\nC(n,r) = n! / (r! * (n-r)!)\nformülüne göre yapılmaktadır.\n\n");

		System.out.print("n sayısını giriniz : ");
		n = scan.nextInt();
		
		System.out.print("r sayısını giriniz : ");
		r = scan.nextInt();		
		
		if (n<r) System.out.println("n sayısı r sayısından küçük olamaz.");
		else if (n<0) System.out.println("n sayısı 0'dan küçük olamaz.");
		else if (r<0) System.out.println("r sayısı 0'dan küçük olamaz.");
		else {
		
			for(int i=1; i<= n; i++) {

				nFakt = nFakt*i;			
				
				}
			System.out.println("n fakt "+nFakt);
	
			for(int j=1; j<= r; j++) {

				rFakt = rFakt*j;
			
				}
			System.out.println("r fakt "+rFakt);
			
					
			for(int k=1; k<= n-r; k++) {

				nRfakt = nRfakt*k;			
			
				}
			
			System.out.println("nR fakt "+nRfakt);
			
			}
		
		sonuc=(nFakt)/((rFakt)*(nRfakt));
		
		System.out.println("\n\nC(n,r) = "+sonuc);
	}
}
				



