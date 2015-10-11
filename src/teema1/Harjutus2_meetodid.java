package teema1;

import java.util.Scanner;

/**
 * 1. Kirjutada meetod, mis tagastab parameetrina etteantud arvu kuubi.
 * 2. Kirjutada meetod, mis saab parameetritena kaks arvu (vahemiku) ning
 *    tagastab kasutaja sisestatud arvu, juhul kui see on lubatud vahemikus.
 *    Senikaua, kui kasutaja sisestab midagi ebasobivat, käseb meetod kasutajal
 *    arvu uuesti sisestada.
 */
public class Harjutus2_meetodid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print number:");
        int num = sc.nextInt();
        System.out.println("Your number in cube is: " + tostaKuupi(num));
    }


    public static int tostaKuupi(int arv) {
        return arv*arv*arv;
    }

    public static int kasutajaSisestus(String kysimus, int min, int max) {
        return 0;
    }
}
