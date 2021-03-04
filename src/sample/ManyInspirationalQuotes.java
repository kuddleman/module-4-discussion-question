package sample;



import javafx.application.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.*;

import java.util.Random;

public class ManyInspirationalQuotes extends Application {

    private Text helloText;
    String[] myQuotes = { "Quote1", "Quote2", "Quote3", "Quote4", "Quote5" };
    private Button button;




    public void start(Stage primaryStage) {

        VBox mainVBox = new VBox();
        mainVBox.setStyle("-fx-background-color: null;");
        mainVBox.setStyle("-fx-border-color: #a14a76; -fx-border-width:12px;");

        mainVBox.setAlignment(Pos.CENTER);
        mainVBox.setSpacing(15);



        button = new Button("Click for new quote!");
        mainVBox.getChildren().add(button);





        helloText = new Text("This is my opening quote");
        helloText.setFont(Font.font("Helvetica", 28));
        helloText.setFill(Color.SKYBLUE);
        mainVBox.getChildren().add(helloText);



        Scene scene = new Scene(mainVBox, 500, 500, Color.web("FFA8A9"));
        primaryStage.setScene(scene);
        primaryStage.setTitle("My Favorite Quotes");
        primaryStage.show();

    }

    private int generateRandom() {
       Random rand = new Random();
        return rand.nextInt(myQuotes.length - 1);
    }





    public static void main(String[] args) {
        launch(args);
    }
}


