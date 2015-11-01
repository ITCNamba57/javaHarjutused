package teema2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * 1. Joonista eesti lipp kasutades kolme Rectangle
 * 2. Joonista Jaapani lipp kasutades Rectangle ja Circle
 */
public class Harjutus1_lipud extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {


        eestiLipp(primaryStage);

        jaapaniLipp(primaryStage);
    }

    private void eestiLipp(Stage primaryStage) {
        Stage lava1 = new Stage();
        Pane pane1 = new Pane();
        Scene stseen1 = new Scene(pane1, 700, 500);
        lava1.setScene(stseen1);

        Rectangle kast1 = new Rectangle(100, 100, 500, 100);
        kast1.setFill(Color.DARKBLUE);
        kast1.setStroke(Color.BLACK);
        pane1.getChildren().add(kast1);

        Rectangle kast2 = new Rectangle(100, 200, 500, 100);
        kast2.setFill(Color.BLACK);
        kast2.setStroke(Color.BLACK);
        pane1.getChildren().add(kast2);

        Rectangle kast3 = new Rectangle(100, 300, 500, 100);
        kast3.setFill(Color.ANTIQUEWHITE);
        kast3.setStroke(Color.BLACK);
        pane1.getChildren().add(kast3);

        lava1.show();
    }

    private void jaapaniLipp(Stage primaryStage) {
        Stage lava2 = new Stage();
        Pane pane2 = new Pane();
        Scene stseen2 = new Scene(pane2, 700, 500);
        lava2.setScene(stseen2);

        Rectangle kast4 = new Rectangle(100, 100, 500, 300);
        kast4.setFill(Color.ANTIQUEWHITE);
        kast4.setStroke(Color.BLACK);
        pane2.getChildren().add(kast4);

        Circle circle = new Circle(350, 250, 100);
        circle.setFill(Color.DARKRED);
        pane2.getChildren().add(circle);

        lava2.show();
    }
}
