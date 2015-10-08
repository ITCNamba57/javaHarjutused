package foor;

import javafx.application.Application;
import javafx.stage.Stage;

public class YksikFoor extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        ValgusFoor foor = new ValgusFoor(ValgusFoor.YLEMINE, primaryStage);

        rohelineKestab(foor);
        rohlinePunaseks(foor);

        punaneKestab(foor);
        punaneRoheliseks(foor);
    }

    // 7s
    public static void rohelineKestab(ValgusFoor foor){
        foor.syytaRoheline();
        foor.paus(7.0);
    }

    // 4s
    public static void rohlinePunaseks(ValgusFoor foor) {
        for (int i = 0; i < 6; ++i) {
            foor.vahetaRohelist();
            foor.paus(0.5);
        }
        foor.vahetaRohelist();

        foor.vahetaKollast();
        foor.paus(1.0);
        foor.vahetaKollast();
    }

    // 10s
    public static void punaneKestab(ValgusFoor foor){
        foor.syytaPunane();
        foor.paus(10.0);
    }

    // 1s
    public static void punaneRoheliseks(ValgusFoor foor) {
        foor.vahetaKollast();
        foor.paus(1.0);

        foor.vahetaPunast();
        foor.vahetaKollast();
    }
}
