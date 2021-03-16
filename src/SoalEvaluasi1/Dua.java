package SoalEvaluasi1;
import java.util.*;
public class Dua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		int m =0;
		int x = 0;
		double result=0, c, d=2, e=0;
		System.out.print("Masukkan Bilangan Biner : ");
		Scanner input = new Scanner(System.in);
		String z = input.nextLine();
		System.out.print("Konversi ke Desimal : ");
		if(z.length()!=8){
			System.out.print("Bukan Binary 8bit" + "\n");
		}else{
			if(z.matches("[0-1]*")){
				a = Integer.parseInt(z);
				hasil(a,m, x,result);
				System.out.println();
			}else{
				System.out.print("Bukan binary yg valid" + "\n");
			}
		}
	}

		static void hasil(int a, int m, int x,double result){
		double c, d=2, e=0;
		int b;
		if(a>=10){
		b = a%10;
		}else{
		b = a;
		}
		if(a>0){
		c = b * Math.pow(d,m);
		result+=c;
		if(result>127){
			result-=255;
		}
		if(b==a)
		System.out.print(result);
		m++;
		hasil(a/10,m, x,result);
		}
	}
}