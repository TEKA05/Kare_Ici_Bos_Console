import java.util.Scanner;


//Kullanıcıdan alınan bir kenar uzunluğunu (int) argüman olarak alıp bu değere göre içi
// boş kare çizen bir fonksiyon yazınız
public class Kare {
    public static void main(String[] args)
{

    Scanner scan=new Scanner(System.in);
    System.out.print("Karenin kenar uzunluğu için sayı giriniz : ");
    int kenarbr=scan.nextInt();

    if (kenarbr < 3)//2'den küçük bir sayı ya 2 de dahil oluyor ama bu sefer içi boş olmuyor . Bu nedenle 3 yaptım.
    {
        System.out.println("İçi boş bir kare çizilebilmesi için 3'ten küçük sayı giremezsiniz");

    } else {
        kareCizdirme(kenarbr);
    }


}


    private static void kareCizdirme(int kenar)
    {

        for (int j=1; j<=kenar; j++)
        {
            System.out.print("# ");
        }
        System.out.println("");


        for (int i=2; i<=kenar-1; i++)
        {
            System.out.print("# ");
            for (int j=2; j<=kenar-1; j++)
            {
                System.out.print("  ");
            }
            System.out.println("#");
        }


        for (int j=1; j<=kenar; j++)
        {
            System.out.print("# ");
        }

    }
}
