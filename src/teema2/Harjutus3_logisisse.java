package teema2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * 1. Loo sisse logimise ekraan (ainult visuaal)
 * 2. Määra üks võimalik kasutaja ja parool (andmebaasi veel ei kasuta)
 * 3. Ebaõnnestunud katse näitab kasutajale errorit
 * 4. Õnnestunud katse puhul vaheta pilt uue vastu (kasvõi roheline ring), .
 */
public class Harjutus3_logisisse extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vbox = new VBox();
        Scene stseen = new Scene(vbox);
        primaryStage.setScene(stseen);

        primaryStage.show();

        Label kasutajalabel = new Label("Kasutajanimi");
        TextField kasutajaInput = new TextField();
        vbox.getChildren().addAll(kasutajalabel, kasutajaInput);

        Label passlabel = new Label("Parool");
        PasswordField passInput = new PasswordField();
        vbox.getChildren().addAll(passlabel, passInput);


    }
}
