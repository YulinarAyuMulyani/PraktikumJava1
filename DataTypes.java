import javax.swing.JOptionPane;
import java.util.Scanner;

public class DataTypes{
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	String namaDepan = "Yulinar";
	String namaTengah = "Ayu";
	String namaBelakang = "Mulyani";
	
	int usia = 21 ;
	int targetTahunKuliah = 2;
	double ipk = 3.81;
	char nilaiAbjad = 'A';
	boolean cantik = true ;
	
	System.out.print("Input Nama Depan : ");
	namaDepan = scanner.nextLine();
	System.out.print("Input Usia : ");
	usia = scanner.nextInt();
	System.out.print("Input IPK : ");
	ipk = scanner.nextDouble();
	System.out.print("");
	System.out.print("Input Nilai Abjad : ");
	nilaiAbjad = scanner.next().charAt(0);
	System.out.print("Cantik : ");
	cantik = scanner.nextBoolean();	
	
	System.out.println("============Output===========");
	System.out.println("Nama Depan      : " +namaDepan);
	System.out.println("Nama Tengah     : " +namaTengah);
	System.out.println("Nama Belakang   : " +namaBelakang);
	System.out.println("Usia            : " +usia);
	System.out.println("Target Kuliah   : " +targetTahunKuliah);
	System.out.println("IPK             : " +ipk);
	System.out.println("Nilai PBO       : " +nilaiAbjad);
	System.out.println("Cantik          : " +cantik);	
	
	JOptionPane.showMessageDialog(null,"Hai, " +namaDepan +namaTengah +namaBelakang);
	namaBelakang = JOptionPane.showInputDialog("Nama Belakang : ");
}
}