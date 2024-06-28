import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        double valid = 0, validNumber = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Matematik notunu girin: ");
        mat = sc.nextInt();
        if(mat > 0 && mat < 100){
            valid += mat;
            ++validNumber;
        }
        System.out.print("Fizik notunu girin: ");
        fizik = sc.nextInt();
        if(fizik > 0 && fizik < 100){
            valid += fizik;
            ++validNumber;
        }
        System.out.print("Türkçe notunu girin: ");
        turkce = sc.nextInt();
        if(turkce > 0 && turkce < 100){
            valid += turkce;
            ++validNumber;
        }
        System.out.print("Kimya notunu girin: ");
        kimya = sc.nextInt();
        if(kimya > 0 && kimya < 100){
            valid += kimya;
            ++validNumber;
        }
        System.out.print("Müzik notunu girin: ");
        muzik = sc.nextInt();
        if(muzik > 0 && muzik < 100){
            valid += muzik;
            ++validNumber;
        }
        double average = valid / validNumber;
        if(average >= 50)
            System.out.println("Tebrikler geçtiniz.");
        else
            System.out.println("Sınıfta kaldınız.");
        System.out.println("Ortalamanız: " + average);

    }
}