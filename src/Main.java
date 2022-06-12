import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    byte Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik;
    //büyükbir rakam olmayacağı içib int yerine byte daha uygun

    Scanner inp = new Scanner(System.in);

        System.out.println("Notlarınızı İstenilen Sırayla Giriniz !");
        System.out.print("Matematik Notunuz :");
        Matematik = inp.nextByte();
        System.out.print("Fizik Notunuz :");
        Fizik = inp.nextByte();
        System.out.print("Kimya Notunuz :");
        Kimya = inp.nextByte();
        System.out.print("Türkçe Notunuz :");
        Türkçe = inp.nextByte();
        System.out.print("Tarih Notunuz :");
        Tarih = inp.nextByte();
        System.out.print("Müzik Notunuz :");
        Müzik = inp.nextByte();

        int toplam = Matematik + Fizik + Kimya + Türkçe + Tarih + Müzik;
        //toplamları büyük olduğu için int kullandım byte kullanırsanız muhtemelen hata verecektir

        double sonuc = toplam / 6;

        System.out.print("Ortalamanız :");
        System.out.println(sonuc);

        String str = sonuc >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı" ;

        System.out.print(str);






    }
}
