import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String namaDepan = "Yulinar";
        String namaTengah = "Ayu";
        String namaBelakang = "Mulyani";

        char[] uniskaChar = {'U','N','I','S','K','A'};
        String uniskaString = new String(uniskaChar);

        int usia = 21;
        int targetTahunKuliah = 2;
        double ipk = 3.81;
        char nilaiAbjad = 'A';
        boolean cantik = true;
        System.out.println(namaDepan + namaTengah + namaBelakang);
        System.out.println(uniskaString);

        //operasi tipe string

        String namaLengkap = namaDepan + " " + namaTengah + " " + namaBelakang;
        System.out.println(namaLengkap.length());
        System.out.println(namaLengkap.indexOf("NIS"));
        System.out.println(namaLengkap.substring(5));
        System.out.println(namaLengkap.substring(5,12));
        System.out.println(namaLengkap.replace( "Ayu" , " Nia ") );
        System.out.println(namaLengkap.toUpperCase());
        System.out.println(namaLengkap.toLowerCase());
        System.out.println(namaLengkap.charAt(6));

        String[] namaArray = namaLengkap.split(" ");

        for(String nama : namaArray){
            System.out.println(nama);
        }

    }
}
