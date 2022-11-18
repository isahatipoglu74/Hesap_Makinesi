import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner inp=new Scanner(System.in);

      int n1,n2,secim;
        System.out.print("ilk sayiyi giriniz=");
        n1= inp.nextInt();
        System.out.print("ikinci sayiyi giriniz=");
        n2=inp.nextInt();
        System.out.println("Toplama=1\nÇıkarma=2\nÇarpma =3\nBölme  =4");
        System.out.print("Yapmak istediğiniz işlemi seciniz= ");

        secim=inp.nextInt();
        if(secim==1){
            System.out.print("Toplama sonucu="+(n1+n2));
        }
        else if(secim==2){
            System.out.print("Çıkarma sonucu="+(n1-n2));
        }
        else if(secim==3){
            System.out.print("Çarpma sonucu="+(n1*n2));
        }
        else if(secim==4) {
            if (n2 != 0) {
                System.out.print("Bölme sonucu=" + (n1 / n2));
            }
            else{
                System.out.println("lütfen ikinci sayiyi 0 dan farkli bir değer giriniz");
            }}
        else{
                System.out.print("Yanlış seçim.Lütfen 1-4 arası bir rakam seçiniz!!");
            }


      /*
        int day=1;
        switch (day){
            case 1:
                System.out.println("bugün pazartesi");
              break;
            case 2:
                System.out.println("bügün sali");
                break;
            case 3:
                System.out.println("bügün carşamba");
                break;
        }
        */

        }
    }