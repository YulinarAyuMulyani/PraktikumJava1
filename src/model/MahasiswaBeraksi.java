package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException{

        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "2010010126";
        mahasiswa.nama = "Yulinar Ayu";
        //mahasiswa.tanggalLahir = new Date();
        mahasiswa.tanggalLahir = simpleDateFormat.parse("16-02-1999");

        System.out.println("Nama \t\t\t : " + mahasiswa.nama);
        System.out.println("NPM \t\t\t : " + mahasiswa.npm);
        System.out.println("Tanggal lahir \t : "+ simpleDateFormat.format(mahasiswa.tanggalLahir));

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.npm = "2010010126";
        mahasiswa2.nama = "Mulyani";
        //mahasiswa2.tanggalLahir = new Date();
        mahasiswa2.tanggalLahir = simpleDateFormat.parse("15-02-1998");
        System.out.println("Nama \t\t\t : " + mahasiswa2.nama);
        System.out.println("NPM \t\t\t : " + mahasiswa2.npm);
        System.out.println("Tanggal lahir \t : "+ simpleDateFormat.format(mahasiswa2.tanggalLahir));

        mahasiswa.tampilkanAtribut();
        mahasiswa.menyapa();
        //Mahasiswa mahasiswa2 = new Mahasiswa();
    }


}
