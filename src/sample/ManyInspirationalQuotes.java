package sample;



import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class ManyInspirationalQuotes extends Application {

    private Text helloText;
    String[] myquotes = { "Quote1", "Quote2", "Quote3", "Quote4", "Quote5" };
    private Button button;




    public void start(Stage primaryStage) {

        VBox mainVBox = new VBox();
        button = new Button("Click for new quote!");
        mainVBox.getChildren().add(button);

        helloText = new Text("This is my opening quote");
        helloText.setFont(Font.font("Helvetica", 28));
        helloText.setFill(Color.SKYBLUE);
        mainVBox.getChildren().add(helloText);



        Scene scene = new Scene(mainVBox, 500, 500, Color.BEIGE);
        primaryStage.setScene(scene);
        primaryStage.setTitle("My Favorite Quotes");
        primaryStage.show();

    }



    public static void main(String[] args) {
        launch(args);
    }
}


