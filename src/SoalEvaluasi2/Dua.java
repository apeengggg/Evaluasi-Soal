package SoalEvaluasi2;
import java.util.*;
public class Dua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Masukan jumlah baris dan kolom untuk mineSweeper, dipisahkan dengan spasi misal :(5 3)");
		Scanner input = new Scanner(System.in);
		String bk = input.nextLine();
		String[] bk_ = bk.split(" ");
		String baris = bk_[0];
		String kolom = bk_[1];
		int b = Integer.parseInt(baris);
		int k = Integer.parseInt(kolom);
		
//		for(int i=1; i<=b; i++){
//			for(int j=1; j<=k; j++){
//				System.out.print("-Kolom-" + "\t");
//			}
//			System.out.println();
//		}
//		------------- 
//			kolom
//			|0|1|2|
//		-------------
//	b	|0|	|.|.|.|
//	a	|1|	|.|*|.|
//	r	|2|	|.|*|*|
//	i	|3|	|*|.|*|
//	s	|4|	|*|*|*|
//		---------------
//		-------------
//		kolom
//		| 0 | 1 | 2 |
//		-------------
//b	|0|	|0,0|1,0|2,0|
//a	|1|	|0,1|1,1|1,1|
//r	|2|	|0,2|1,2|2,2|
//i	|3|	|0,3|1,3|2,3|
//s	|4|	|0,4|1,4|2,4|
//	---------------
		String[] data =  new String[b];
		String[][] array2d = new String[b][k];
		System.out.println("Masukan pola:");
		for(int i=0; i<b; i++){
			Scanner dataa = new Scanner(System.in);
			data[i] = input.nextLine();
		}
        for (int j=0; j<b; j++) {
            for (int m=0; m<data[j].length(); m++) {
                array2d[b][k] = data[j].charAt(m)+" ";
            }
        }
		
	}

}
