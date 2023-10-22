import java.util.Scanner;

public class nilaimahasiswa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        int nim = input.nextInt();
        System.out.print("Masukkan Nilai Tubes: ");
        double nilaiTubes = input.nextDouble();
        System.out.print("Masukkan Nilai Quiz: ");
        double nilaiQuiz  = input.nextDouble();
        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUTS = input.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        hitungtotalnilai Nilai = new hitungtotalnilai();
        double nilaitotal = Nilai.nilaitotal(nilaiTubes, nilaiQuiz, nilaiTugas, nilaiUTS, nilaiUAS);
        
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Nilai  Matakuliah Pemograman Berorientasi Objek:" + nilaitotal);

        input.close();
    }   
}