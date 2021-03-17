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
//			| 0 | 1 | 2 | (k)
//			-------------
//	b	|0|	|0,0|0,1|0,2|
//	a	|1|	|1,0|1,1|1,2|
//	r	|2|	|2,0|2,1|2,2| (b)
//	i	|3|	|3,0|3,1|3,2|
//	s	|4|	|4,0|4,1|4,2|
//		---------------
		String[] data =  new String[b];
		String[][] array2d = new String[b][k];
		System.out.println("Masukan pola " + b + " baris dan " + k + " kolom: ");
		for(int i=0; i<b; i++){
			Scanner dataa = new Scanner(System.in);
			data[i] = dataa.nextLine();
		}
        for (int j=0; j<b; j++) {
            for (int m=0; m<data[j].length(); m++) {
                array2d[j][m] = data[j].charAt(m)+" ";
            }
        }
        
        int jumlah = 0;
        int right, left, bottom, top;
        int[][] hasil = new int[b][k];
        for (int m=0; m<b; m++){
        	for (int n=0; n<k; n++){
//        		array yg akan dimasukan angka dicek
        		if(array2d[m][n].equals(". ")){
//        			yg paling atas kolom paling kiri
        			if(m==0 && n==0){
        				right = n+1;
        				bottom = m+1;
//        				cek kanan
        				if(array2d[m][right].equals("* ")){
        					jumlah +=1;
        				}
//        				cek bawah
        				if(array2d[bottom][n].equals("* ")){
        					jumlah+=1;
        				}
//        				cek kanan bawah
        				if(array2d[right][bottom].equals("* ")){
        					jumlah+=1;
        				}
        				hasil[m][n] = jumlah;
        				jumlah = 0;
        			}
//        			paling atas sebelum kolom paing kanan
        			else if(m==0 && n>0 && n!=(k-1)){
        				right = n+1;
        				bottom = m+1;
        				left = n-1;
//        				cek kanan
        				if(array2d[m][right].equals("* ")){
        					jumlah+=1;
        				}
//        				cek bawah
        				if(array2d[bottom][n].equals("* ")){
        					jumlah+=1;
        				}
//        				cek kanan bawah
        				if(array2d[bottom][right].equals("* ")){
        					jumlah +=1;
        				}
//        				cek kiri
        				if(array2d[m][left].equals("* ")){
        					jumlah+=1;
        				}
//        				cek kiri bawah
        				if(array2d[bottom][left].equals("* ")){
        					jumlah +=1;
        				}
        				hasil[m][n] = jumlah;
        				jumlah=0;
        			}
//        			yg paling atas paling kanan
        			else if(m==0 && n==(k-1)){
        				left = n-1;
        				bottom = m+1;
//        				cek kiri
        				if(array2d[m][left].equals("* ")){
        					jumlah +=1;
        				}
//        				cek bawah kiri
        				if(array2d[bottom][left].equals("* ")){
        					jumlah+=1;
        				}
//        				cek bawah
        				if(array2d[bottom][n].equals("* ")){
        					jumlah+=1;
        				}
        				hasil[m][n] = jumlah;
        				jumlah = 0;
        			}
//        			yg kolom paling kiri tapi bukan baris ke 0 dan terakhir
        			else if(n==0 && m!=0 && m!=(b-1)){
        				top = m-1;
        				right = n+1;
        				bottom = m+1;
//        				top
        				if(array2d[top][n].equals("* ")){
        					jumlah +=1;
        				}
//        				kanan
        				if(array2d[m][right].equals("* ")){
        					jumlah+=1;
        				}
//        				ats kanan
        				if(array2d[top][right].equals("* ")){
        					jumlah+=1;
        				}
//        				bawah
        				if(array2d[bottom][n].equals("* ")){
        					jumlah+=1;
        				}
//        				bawah kanan
        				if(array2d[bottom][right].equals("* ")){
        					jumlah+=1;
        				}
        				hasil[m][n] = jumlah;
        				jumlah = 0;
        			}
//        			yg kolom paling kanan tapi bukan baris ke 0 dan barisk akhir
        			else if(n==(k-1) && m!=0 && m!=(b-1)){
//        				atas
        				top = m-1;
        				left = n-1;
        				bottom = m+1;
//        				atas
        				if(array2d[top][n].equals("* ")){
        					jumlah+=1;
        				}
//        				bawah 
        				if(array2d[bottom][n].equals("* ")){
        					jumlah+=1;
        				}
//        				kiri
        				if(array2d[m][left].equals("* ")){
        					jumlah+=1;
        				}
//        				atas kiri 
        				if(array2d[top][left].equals("* ")){
        					jumlah+=1;
        				}
//        				bawah kiri
        				if(array2d[bottom][left].equals("* ")){
        					jumlah+=1;
        				}
        				hasil[m][n] = jumlah;
        				jumlah = 0;
        			}
//        			baris akhir kolom paling kiri
        			else if(m==(b-1) && n==0){
        				top = m-1;
        				right = n+1;
        				if(array2d[top][n].equals("* ")){
        					jumlah+=1;
        				}
        				if(array2d[m][right].equals("* ")){
        					jumlah+=1;
        				}
        				if(array2d[top][right].equals("* ")){
        					jumlah +=1;
        				}
        				hasil[m][n] = jumlah;
        				jumlah = 0;
        			}
//        			baris akhir bukan kolom paling kiri atau kanan
        			else if(m==(b-1) && n>0 && n!=(k-1)){
        				left = n-1;
        				right = n+1;
        				top = m-1;
//        				cek atas
        				if(array2d[top][n].equals("* ")){
        					jumlah+=1;
        				}
//        				cek kiri
        				if(array2d[m][left].equals("* ")){
        					jumlah+=1;
        				}
//        				cek kanan
        				if(array2d[m][right].equals("* ")){
        					jumlah+=1;
        				}
//        				cek atas kiri
        				if(array2d[top][left].equals("* ")){
        					jumlah+=1;
        				}
//        				cek atas kanan;
        				if(array2d[top][right].equals("* ")){
        					jumlah+=1;
        				}
        				hasil[m][n] = jumlah;
        				jumlah =0;
        			}
//        			baris akhir kolom paling kanan
        			else if(m==(b-1) && n==(k-1)){
        				left = n-1;
        				top = m-1;
//        				kiri
        				if(array2d[m][left].equals("* ")){
        					jumlah+=1;
        				}
//        				atas
        				if(array2d[top][n].equals("* ")){
        					jumlah +=1;
        				}
//        				atas kiri
        				if(array2d[top][left].equals("* ")){
        					jumlah +=1;
        				}
        				hasil[m][n] = jumlah;
        				jumlah = 0;
        			}else{
        				top = m-1;
        				bottom = m+1;
        				left = n-1;
        				right = n+1;
//        				atas
        				if(array2d[top][n].equals("* ")){
        					jumlah+=1;
        				}
//        				atas kiri
        				if(array2d[top][left].equals("* ")){
        					jumlah+=1;
        				}
//        				atas kana
        				if(array2d[top][right].equals("* ")){
        					jumlah +=1;
        				}
//        				kiri
        				if(array2d[m][left].equals("* ")){
        					jumlah+=1;
        				}
//        				kanan
        				if(array2d[m][right].equals("* ")){
        					jumlah+=1;
        				}
//        				bawah
        				if(array2d[bottom][n].equals("* ")){
        					jumlah+=1;
        				}
//        				bawah kiri
        				if(array2d[bottom][left].equals("* ")){
        					jumlah+=1;
        				}
//        				bawah kanan
        				if(array2d[bottom][right].equals("* ")){
        					jumlah+=1;
        				}
        				hasil[m][n] = jumlah;
        				jumlah = 0;
        			}
//        			System.out.print(hasil[m][n]);
        		}
        	}
        	System.out.println();
        }
        System.out.println("Panjang Hasil: " + jumlah);
        for(int a=0; a<b; a++){
        	for(int c=0; c<k; c++){
        		if(hasil[a][c]==0){
        			System.out.print("*" + "\t");
        		}else{
        		System.out.print(hasil[a][c]+ "\t");
        		}
        	}
        	System.out.println();
        }
	}

}
