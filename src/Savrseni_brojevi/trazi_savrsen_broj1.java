package Savrseni_brojevi;
import java.util.*;
public class trazi_savrsen_broj1
{
/*
 * provjeri da li izmedju zadanih brojeva
 * ima savrsenih brojeva
 */
	public static void main(String[] args) {
		
int x, y, z, i=1, s=0;
long pocetak, kraj;

Scanner unos = new Scanner(System.in);
System.out.println("Unesi pocetni broj: ");
x = unos.nextInt();
		while (x < 2) {
		System.out.print("Pogresan unos pocetnog broja, pocetni broj mora biti veci od 1! \nUnesi ponovo pocetni broj: ");
		x = unos.nextInt();
	}
	
System.out.println("Unesi zavrsni broj: ");
y = unos.nextInt();
	while (y <= x)	{
		System.out.print("Pogresan unos zavrsnog broja, zavrsni broj mora biti veci od pocetnog broja!\nUnesi ponovo zavrsni broj: ");
		y = unos.nextInt();
	}

pocetak = System.currentTimeMillis();
System.out.println("\nSavrsen broj je: ");
	for (z = x; z <= y; z++) {
			for (i = 1, s = 0; i < z; i++)	{
				if (z % i == 0)	{
					s = s + i;
				}
			}
			if (s == z)	{
				System.out.println(+z);
			}
		}
	
kraj = System.currentTimeMillis();
System.out.println("\nDuzina trajanja obrade podataka je oko " +(kraj - pocetak)/1000 + "s" + "\nodnosno: " +(kraj - pocetak) +"ms");

unos.close();
	}
}
	
