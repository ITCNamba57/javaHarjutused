package teema2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * 1. Joonista kast kasutades jooni
 * 2. Joonista spiraal kasutades jooni (vaata ringi meetodi)
 * 3. Joonista propeller (nagu propeller.png) kasutades jooni
 */
public class Harjutus2_ringid extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Stage lava1 = new Stage();
        Pane pane1 = new Pane();
        Scene stseen1 = new Scene(pane1, 500, 500);
        lava1.setScene(stseen1);

        Line line1 = new Line(100, 100, 100, 400);
        line1.setFill(Color.BLACK);
        pane1.getChildren().add(line1);

        lava1.show();
    }
}
