package SoalEvaluasi1;
import java.util.Scanner;
//100/2 = 50, sisa 0
//50/2 = 25, sisa 0
//25/2 = 12, sisa 1
//12/2 = 6, sisa 0
//6/2  = 3, sisa 0
//3/2 = 1, sisa 1
//1/2 = 0.5, sisa 1
// karena index nya hanya tujuh, maka index ke 8 nya adalah 0, jadi
// 0 1 1 0 0 1 0 0 
// jika idnexnya hanya enam, maka idnex ke 7, dan 8 nya adlaah 0, begitu seterusnya
// misal -127, = -127*(-1)
// untuk decimal minus, dibalik, jika 0 adalah 1, jika 1 adalah 0, dimana nilai minusnya dibuat dulu menjadi nilai desimal
public class Satu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("== Konversi Bilangn Decimal Ke Dalam Binary 8bit ==");
		System.out.println("== Range Bilangan Decimal Yang Valid Adalah -127~127 ==");
		System.out.println("Masukan Nilai Decimal: ");
		Scanner decimal = new Scanner(System.in);
		int dec = decimal.nextInt();
		int sisa  = dec;
		// 8 bit index array mulai dari 0, hingga ke 7
		int index = 7;
		double a = 0;
		if (dec<-127 || dec > 127){
			System.out.println("Nilai yang anda masukan tidak valid, nilai harus antara -127~127");
		}else if(dec <=-127 || dec <=0){
//		inisiasi 8 bit
			System.out.println("Minus nya hasilnya: " +  dec*(-1));
			int minus = dec *(-1);
		int[] result = new int[8];
		while(index!=0){
			a = minus/2;
			if(a%2 != 0){
				if(a%1 != 0){
					a = a - 0.5;	
				}
			}
			int biner = minus%2;
			minus = (int) a;
			result[index] = biner;
			index--;
		}
		System.out.print("Hasil Konversi Ke Binary Minus: " + "\n");
		for (int i=0; i<result.length; i++){	
			if(result[i] == 0){
				result[i] = 1;
			}else if(result[i] == 1){
				result[i] = 0;
			}
			System.out.print(result[i] + "\t");
			}
		}else if(dec <=127 || dec >=0){
			// 8 bit index array mulai dari 0, hingga ke 7
//			inisiasi 8 bit
			int[] result = new int[8];
			while(index!=0){
				a = dec/2;
				if(a%2 != 0){
					if(a%1 != 0){
						a = a - 0.5;	
					}
				}
				int biner = dec%2;
				dec = (int) a;
				result[index] = biner;
				index--;
			}
			System.out.print("Hasil Konversi Ke Binary Plus: " + "\n");
			for (int i=0; i<result.length; i++){	
				System.out.print(result[i] + "\t");
				}
			}
	}

}
