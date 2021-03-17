package SoalEvaluasi2;
import java.util.*;
public class Tiga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j;
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner (System.in);
		System.out.println("Masukan Test Case yang ingin dilakukan? ");
		int case_input = input1.nextInt();
		System.out.println("==========================================");
		for(j=0; j<case_input; j++){
			System.out.println("Masukan angka yang akan di uji ke-" + (j+1) + " pisahkan dengan spasi ");
			String angka = input2.nextLine();
			String[] spasi = angka.split(" ");
			String a = spasi[0];
			String b = spasi[1];
			int base = 9;
//			int result = Math.abs(a_length-b_length);
//			int max = Math.max(a_length, b_length)-1;
//			System.out.println("Result is  :" + max);
			String str="", sum="";
			int result = Math.abs(a.length()-b.length());
			for(int i=1; i<=result; i++){
				str="0";
//				System.out.print("Snya adalah: " + s);
			}
			if(a.length() > b.length()){
				a = str+a;
			}else{
				b = str+b;
			}
			 int cardN, res=0;
			 for (int i=Math.max(a.length(), b.length())-1; i>=0; i--){
				 cardN = res+(a.charAt(i)-'0') + (b.charAt(i)-'0');
//				 8+5 = 13
//				 System.out.println("CardN 1 Ke-"+i + " adalah " + cardN);
				 res = cardN /base;
//				 13/9 = 1
//				 System.out.println("Result Ke-"+i + " adalah " + res);
				 cardN %= base;
//				 cardN = cardN%9
//				 13 % 9 = 4
//				 System.out.println("CardN Mod Base Ke-"+i + " adalah " + cardN);
				 sum = (char) (cardN+'0') + sum;
//				 sum = cardN + 0 + "";
//				 sum = 4 + 0 + ""
//				 sum =4
//				 System.out.println("Sum Ke-"+i + " adalah " + sum);
//				 System.out.print("----" + "\n");
			 }
			 if(res>0){
				 sum = (char) (res+'0')+sum;
			 }
			 System.out.println("Hasil ke-" + (j+1) + " adalah :");
			 System.out.println(sum);
			 System.out.println("===================================");
			 
		}
		
	}

}
