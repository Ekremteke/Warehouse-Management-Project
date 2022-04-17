import java.util.Scanner;

public class JavaGitHubPractice {
    public static void main(String[] args) {

        System.out.println("Welcome to my project");
        System.out.println("Some of the project may Turkish");
//Bu proje: Depoda bulunan "kalem" malzemesinin, giris cikis kayitlarinin tutuldugu bir depo programidir.

       /*As long as you exit the system, you can make 3 incorrect entries that you need to Run again.
       After logging in, you can enter material until you log out of the system.

       Kullanici Adi (User Name) : Ekrem
       Parola (Password) : Java
       */

        String sys_kul_adi = "Ekrem";
        String parola = "Java";
        int mevcut = 10000;
        int islem = 0;
        short j = 1;

        for (int i = 0; i < 3; i++) {

            System.out.println(i + 1 + "'inci giris");

            Scanner scan = new Scanner(System.in);

            System.out.println("Kullanici Adi (User Name): ");
            String kullanici_adi = scan.nextLine();

            System.out.println("Parola (Password): ");
            String kul_parola = scan.nextLine();

            if (!(sys_kul_adi.equals(kullanici_adi)) && !(parola.equals(kul_parola))) {
                System.out.println("Kullanici Adi ve Parola Hatali");
            } else if ((sys_kul_adi.equals(kullanici_adi)) && !(parola.equals(kul_parola))) {
                System.out.println("Parola Hatali");
            } else if (!(sys_kul_adi.equals(kullanici_adi)) && (parola.equals(kul_parola))) {
                System.out.println("Kullanici Adi Hatali");
            } else {
                System.out.println("Giris Basarili");
                while (j > 0) {
                    System.out.println("Lutfen yapmak istediginiz islem numarasini tusladiktan sonra 'enter'a basin");
                    System.out.println("1: Depo Miktari Goruntule");
                    System.out.println("2: Ekle");
                    System.out.println("3: Cikar");
                    System.out.println("4: Sistemden Cikis");

                    islem = scan.nextInt();
                    switch (islem) {
                        case 1:
                            System.out.println("Depo Mevcudu: " + mevcut + " adettir");
                            break;

                        case 2:
                            System.out.println("Kac adet giris yaptiniz?");
                            int miktar = scan.nextInt();
                            mevcut += miktar;
                            System.out.println("Depo mevcudu: " + mevcut + " adettir");
                            break;

                        case 3:
                            System.out.println("Kac adet cikis yaptiniz");
                            miktar = scan.nextInt();
                            if (miktar > mevcut) {
                                System.out.println("Depo mevcudu yetersiz en fazla " + mevcut + " cikis yapabilirsiniz");
                            } else if (miktar < mevcut) {
                                mevcut -= miktar;
                                System.out.println("Kalan depo mevcudu " + mevcut + " adettir.");
                                break;
                            }
                            System.out.println("Lutfen yapmak istediginiz islem numarasini tusladiktan sonra 'enter'a basin");

                        case 4:
                            System.out.println("Hoscakalin");
                            j = 0;
                            i = 4;
                            break;
                        default:
                            System.out.println("gecersiz islem");
                    }
                }
                System.out.println("First In First Out!");
            }
        }
        System.out.println("Sistemden ciktiniz RUN yaparak tekrar giris yapabilirsiniz");
    }
}
