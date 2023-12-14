package MayinTarlasi;
/**
 * @author Abdurrahman Paf
 * 14.12.2023 03.40
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int row,column;
		System.out.println("************ Mayın Tarlasına Hoşgeldiniz ************");
		System.out.println("Lütfen Oynamak İstediğiniz Boyutları Giriniz: ");
	//	System.out.print("Satır Sayısı: ");
	//	row = input.nextInt();
	//	System.out.println("Sütun Sayısı");
	//	column = input.nextInt();
		
		MayinTarlasi mayin = new MayinTarlasi(2, 2); 
		mayin.run();
	}

}
