package program;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("KDV'siz fiyatı giriniz:");
		
		
		double fiyat = in.nextDouble();
		
		in.close();
		
		Kdv_hesapla(fiyat);
	

	}
	
	
	public static void Kdv_hesapla(double x) {
		
		double kdv = 0.18;
		double kdv2 = 0.08;
		
		double toplam = x <= 1000 ?  x * (1 + kdv) : x * (1 + kdv2);
		
		double kdvTutarı = toplam - x;
		
		System.out.println("KDV'li fiyat: " + toplam);
		System.out.println("KDV tutarı: " + kdvTutarı);
		
	}

}
