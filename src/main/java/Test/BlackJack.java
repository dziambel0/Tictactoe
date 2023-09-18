package Test;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.*;

public class BlackJack extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private Parent createContent(){
        Pane root = new Pane();
        root.setPrefSize(600, 600);

        return root;
    }

    private class Tile extends StackPane{
        public Tile(){

        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(createContent()));
        primaryStage.show();
    }
}
