package SoalEvaluasi2;
import java.util.*;
public class Satu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Jumlah Case yang ingin di test: ");
		Scanner first_input = new Scanner(System.in);
		Scanner sec_input = new Scanner(System.in);
        int jml = first_input.nextInt();
//        inputan ke dua di simpan di array
        String[] input = new String[jml];
        System.out.println();

        if (jml>50) {
            System.out.println("Jumlah case tidak bisa lebih dari 50");
        }else{
            for (int i=0; i<jml; i++){
                int j = i+1;                
                    System.out.println("Kata Ke 2-: " + j);
                    input[i] = sec_input.nextLine();
            }System.out.println();
            System.out.println("Outpun tipe substring :");
            for (int i=0; i<jml; i++) {
            int j = i+1;            
                String[] spasi = input[i].split(" ");
                StringBuffer reverse = new StringBuffer(spasi[1]);
                reverse.reverse();
                String str1 = spasi[0];
                String str2 = reverse.toString();
                System.out.print("Hasil Case Ke-" + j + " = ");
                System.out.println(spasi[0] + " " + spasi[1]);
                if(spasi[0].equals(spasi[1])) {
                    System.out.println("'"+spasi[0]+"'" +" Merupakan Kata Yang Sama Dari " + "'"+spasi[1]+"'");
                }else if (str1.contains(str2)){
                    System.out.println(str1 + " Merupakan Substring Tipe Pencerminan Dari " + str2);
                }else if (spasi[0].contains(spasi[1])){
                    System.out.println(spasi[0] + " Merupakan Substring Dari " + spasi[1]);
                }else if (str1.equals(str2)){
                    System.out.println(str1 + " Merupakan Pencerminan Dari " + str2);
                }else{
                    System.out.println(spasi[0] + " dan " + spasi[1] + " Bukan Substring Apapun");
                }
                System.out.println();
            }
        }
	}
}
