package teema1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * NB! Lahenda käesolev ülesanne konsoolis. Pole vaja JavaFXi siia segada.
 *
 * 1. Kirjuta lihtne laevade pommitamise mäng, kus arvuti genereerib 1x1
 *    laevad mööda 1 dimensioonilist lauda. See tähendab, et mängulaud
 *    ei ole mitte ruudustik, vaid üks rida.
 *
 * 2. Täienda mängu nii, et nüüd oleks laual ruudustik.
 *
 * 3. Kas oskad ka nii, et laevad ei ole 1x1 vaid 1x2 ja 1x3 ja orienteeruvad
 *    nii vertikaalselt kui ka horisontaalselt?
 */
public class Peamurdja3_laevad {
    public static void main(String[] args) {
        
        char[] field = {'_','_','_','_','_','_','_','_','_','_'};
        int count = 0;
        while (count < 10){
            if((int) (Math.random() * 2) == 1) {
                field[count] = 'O';
            }
            System.out.print(field[count] + " ");
            count++;

        }

        while (check(field) != false) {
            int a = Question();
            if (a > 0 && a <= 10) {
                if (field[a - 1] == 'O') {
                    System.out.println("It's a kill!!!");

                } else {
                    System.out.println("Miss!!!");
                }
                field[a - 1] = 'X';

            }
            Printfield(field);
            check(field);

        }
        System.out.println();
        System.out.println("All ships are destroyed!!!");


    }
    public static int Question() {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Print number from 1 to 10:");
        int num = sc.nextInt();
        return num;
    }
    public static boolean check(char[] array){
        boolean b = false;
        int count = 0;
        while (count < array.length){
            if (array[count] == 'O'){
                b = true;
            }
            count ++;
        }
        return b;
    }
    public static void Printfield (char[] field){
        int count = 0;
        while (count < field.length){
            if (field[count] == 'O') {
                System.out.print('_');
            }
            else{
                System.out.print(field[count] + " ");
            }
            count ++;

        }

    }
}
