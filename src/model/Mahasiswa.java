package model;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mahasiswa {
    String npm;
    String nama;
    Date tanggalLahir;

    void tampilkanAtribut() {
    String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        System.out.println("Nama \t\t\t : " + this.nama);
        System.out.println("NPM \t\t\t : " + this.npm);
        System.out.println("Tanggal Lahir \t : " + simpleDateFormat.format(this.tanggalLahir));
}
    void menyapa(){
    System.out.println("Hai nama aku : " + this.nama);
}

    int hitungUsia(){
        Calendar tanggalLahir = Calendar.getInstance();
        tanggalLahir.setTime(this.tanggalLahir);
        Calendar hariIni = Calendar.getInstance();

        int tahunTanggallahir = tanggalLahir.get(Calendar.YEAR);
        int tahunHariIni = hariIni.get(Calendar.YEAR);
        int selisihTahun = tahunHariIni - tahunTanggallahir;

        return selisihTahun;


}
}