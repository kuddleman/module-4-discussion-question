// Donny Lobree
// Module 4 Graded Discussion
// Wed, March 3, 2021



package sample;

import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.*;
import javafx.event.*;
import java.util.Random;

public class ManyInspirationalQuotes extends Application {

    private Text helloText;
    String[] myQuotes = { "Here's a quote",
                          "another quote",
                          "This is funny!",
                          "Now we're getting serious!",
                          "He said, she said..."
                        };
    private Button button;
    private VBox mainVBox;


    public void start(Stage primaryStage) {

        mainVBox = new VBox();
        mainVBox.setStyle("-fx-background-color: ;");
        mainVBox.setStyle("-fx-border-color: #a14a76; -fx-border-width:12px;");
        mainVBox.setAlignment(Pos.CENTER);
        mainVBox.setSpacing(15);

        button = new Button("Click for new quote!");
        button.setOnAction(this::handleButton);
        mainVBox.getChildren().add(button);

        helloText = new Text("This is my opening quote");
        helloText.setFont(Font.font("Helvetica", 28));
        helloText.setFill(Color.SKYBLUE);
        mainVBox.getChildren().add(helloText);

        Scene scene = new Scene(mainVBox, 500, 500);
        BackgroundFill background_fill = new BackgroundFill(Color.PINK,
                CornerRadii.EMPTY, Insets.EMPTY);
        // create Background
        Background background = new Background(background_fill);

        // set background
        mainVBox.setBackground(background);

        primaryStage.setScene(scene);
        primaryStage.setTitle("My Favorite Quotes");
        primaryStage.show();
    }

    private int generateRandomIndex() {
       Random rand = new Random();
       return rand.nextInt(myQuotes.length - 1);
    }

    private Paint generateRandomColor() {
        Random rand = new Random();
        int r = rand.nextInt(255);
        int g = rand.nextInt(255);
        int b = rand.nextInt(255);
        return Color.rgb(r, g, b);
    }

    private void handleButton(ActionEvent event) {
        // generate random index, use index to find random quote from array
        // display new quote with random text color
        int newQuoteIndex = generateRandomIndex();
        helloText.setText(myQuotes[newQuoteIndex]);
        helloText.setFont(Font.font("Helvetica", 28));
        helloText.setFill(generateRandomColor());

        //change the background color each time the button is clicked
        BackgroundFill background_fill = new BackgroundFill(generateRandomColor(),
                CornerRadii.EMPTY, Insets.EMPTY);
        // create Background
        Background background = new Background(background_fill);

        // set background
        mainVBox.setBackground(background);
    }

    public static void main(String[] args) {
        launch(args);
    }
}


