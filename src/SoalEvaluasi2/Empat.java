package SoalEvaluasi2;
import java.util.*;
public class Empat {

	private static final int k2 = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Text tidak dapat lebih dari 250 karakter, termasuk spasi");
		System.out.println("Masukan text yg ingin di enkripsi: ");
		String text = input.nextLine();
		
		int txtlength = text.length();
//		for(int i=0; i<txtlength; i++){
//			System.out.println("Huruf ke- " + i + " adalah= " + text.charAt(i));
//		}
//		System.out.println("============================================================");
//		System.out.println("Panjang karakter: " + txtlength);
		
		int b1 = 0;
		int b2 = 1;
		while(b1 != txtlength){
			for(int i=0; i<b2*2; i++){
				b1++;
				if(b1==txtlength){
					break;
				}
			}
			b2++;
		}
		int baris = b2-1;
//		System.out.println("Baris: " + baris);
		
		int k1 = 0;
		int k2 = 0;
		while (k1 != txtlength){
			for(int j=1; j<k2*2; j++){
				k1++;
				if(k1==txtlength){
					break;
				}
			}
			k2++;
		}
		int bc, kc, pb, pk;
		int kolom = k2-1;
//		System.out.println("Kolom : " + kolom);
//		baris tengah
		if(baris%2!=0){
			 bc = (baris/2)+1;
		}else{
			bc = baris/2;
		}
		if(kolom%2!=0){
			kc = (kolom/2)+1;
		}else{
			kc = kolom/2;
		}
//		System.out.println("Baris Tengah : " + bc);
//		kolom tengah
		
//		System.out.println("Kolom Tengah : " + kc);
		bc -=1;
		kc -=1;
		System.out.println("============================================================");
		String[][] array2d = new String[baris][kolom];
//		pola 1 kanan
//		pola 2 bawah
//		pola 3 kiri
//		pola 4 atas
//		kembali ke pola 1
//		setiap melakukan 2 pola, geser +1
//		artinya, langkah ke 1 dengan pola 1 melakukan 1x ke kanan, 
//		langkah ke 2 dengan pola 2 melakukan 1x ke bawah
//		langkah ke 3 dengan pola 3 melakukan 2x ke kiri
//		langkah ke 4 dengan pola 4 melakukan 2x ke atas
//		langkah ke 5 dengan pola 1 melakukan 3x ke kiri
//		dst
		int langkah  = 0;
		int geser = 1; // 2,
		int chr = 0;
		int gerak = 0; //1,0,0
		for(int i=0; i<txtlength; i++){
				if(langkah==0){
					array2d[bc][kc] = text.charAt(chr)+"";
					langkah+=1;
				}else if(langkah==1){
					if((geser+1)==(gerak+1)){
						langkah+=1;
						gerak = 0;
						chr--;
						i-=1;
					}else{
						kc +=1;
						array2d[bc][kc] = text.charAt(chr)+"";
						gerak+=1;
					}
				}else if(langkah==2){
					if((geser+1)==(gerak+1)){
						langkah+=1;
						geser+=1;
						gerak = 0;
						chr--;
						i-=1;
					}else{
						bc +=1;
						array2d[bc][kc] = text.charAt(chr)+"";
						gerak+=1;
					}
				}else if(langkah==3){
					if((geser+1)==(gerak+1)){
						langkah+=1;
						gerak = 0;
						chr--;
						i-=1;
					}else{
						kc -=1;
						array2d[bc][kc] = text.charAt(chr)+"";
						gerak +=1;
					}
				}else if(langkah==4){
					if((geser+1)==(gerak+1)){
						langkah=1;
						gerak = 0;
						geser +=1;
						chr--;
						i-=1;
					}else{
						bc -=1;
						array2d[bc][kc] = text.charAt(chr)+"";
						gerak +=1;
					}
				}
				chr++;
		}
		System.out.println("Hasil Matik Enkripsi:");
		for(int m=0; m<baris; m++){
			for (int n=0; n<kolom; n++ ){
				if(array2d[m][n]==null){
					System.out.print("_ ");
				}else if(array2d[m][n].equals(" ")){
					System.out.print("_ ");
				}else{
					System.out.print(array2d[m][n]+ " ");
				}
			}
			System.out.println();
		}
		
		System.out.println("========================================================");
		System.out.println("Hasil Enkripsi:");
		for(int m=0; m<baris; m++){
			for (int n=0; n<kolom; n++ ){
				if(array2d[m][n]==null){
					System.out.print("_");
				}else if(array2d[m][n].equals(" ")){
					System.out.print("_");
				}else{
					System.out.print(array2d[m][n]);
				}
			}
		}
	}
}
