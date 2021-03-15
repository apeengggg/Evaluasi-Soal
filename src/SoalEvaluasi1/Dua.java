package SoalEvaluasi1;
import java.util.*;
public class Dua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a, b;
			int m =0;
			int x = 0;
			double hsl=0, c, d=2, e=0;
			System.out.print("Masukkan Bilangan Biner : ");
			Scanner input = new Scanner(System.in);
			a = input.nextInt();
			System.out.print("Konversi ke Desimal : ");
					hasil(a,m, x,hsl);
					System.out.println();
		}

			static void hasil(int a, int m, int x,double hsl){
			double c, d=2, e=0;
			int b;
			if(a>=10){
			b = a%10;
			}else{
			b = a;
			}
			if(a>0){
			c = b * Math.pow(d,m);
			hsl=hsl+c;
			if(hsl>127){
				hsl=hsl-255;
			}
			if(b==a)
			System.out.print(hsl);
			m++;
			hasil(a/10,m, x,hsl);
			}
		}
	}