import java.util.Scanner;

public class kuvvetyazdirma {
    public static void main(String[] args){

        // Girilen sayıya kadar 4 ve 5in kuvvetlerini yazdırma

        int a;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayiyi giriniz : ");
        a = inp.nextInt();
        System.out.println("4'un Kuvvetleri");
        for (int i = 1; i < a; i*=4){
            System.out.println(i);
        }
        System.out.println("5'in Kuvvetleri");
        for (int i = 1; i < a; i*=5){
            System.out.println(i);
        }
    }
}
