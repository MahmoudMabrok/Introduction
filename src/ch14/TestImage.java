package ch14;/**
 * this is
 * Created by mo3tamed on 10/19/17.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.image.Image;

public class TestImage extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Image i  = new Image("ch14/task24.png") ;
        ImageView im1 = new ImageView(i) ;
        im1.setFitHeight(150);
        im1.setFitWidth(150);
        Pane root  = new FlowPane() ;
        root.getChildren().add(im1);

        ImageView im2 = new ImageView(i) ;
        im2.setRotate(45);
        root.getChildren().add(im2) ;


        primaryStage.setScene(new Scene(root ,400,600 ));
        primaryStage.setTitle("TestImage");
        primaryStage.show();

    }
}
