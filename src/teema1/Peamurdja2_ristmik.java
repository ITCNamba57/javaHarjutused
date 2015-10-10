package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */
public class Peamurdja2_ristmik extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Foor foor1 = new Foor(Foor.YLEMINE, primaryStage);
        Foor foor2 = new Foor(Foor.ALUMINE, primaryStage);
        Foor foor3 = new Foor(Foor.PAREM, primaryStage);
        Foor foor4 = new Foor(Foor.VASAK, primaryStage);

        teePunaseks(foor1);
        teePunaseks(foor2);
        teePunaseks(foor3);
        teePunaseks(foor4);

        int count = 0;
        while (count < 10) {
            Tsykkel(foor1);
            Tsykkel(foor2);
            foor3.paus(8.5);
            foor4.paus(8.5);
            Tsykkel(foor3);
            Tsykkel(foor4);
            foor1.paus(8.5);
            foor2.paus(8.5);
            count++;
        }
    }


    public void  teePunaseks(Foor foor) {
        foor.vahetaPunast();
        foor.paus(0.5);
    }

    public void Tsykkel(Foor foor){
        foor.paus(2);
        foor.vahetaKollast();
        foor.paus(1);
        foor.vahetaPunast();
        foor.vahetaKollast();
        foor.vahetaRohelist();
        foor.paus(1);
        int i = 0;
        while (i < 7) {
            foor.vahetaRohelist();
            foor.paus(0.5);
            i ++;
        }
        foor.vahetaKollast();
        foor.paus(1);
        foor.vahetaKollast();
        foor.vahetaPunast();
    }

}
