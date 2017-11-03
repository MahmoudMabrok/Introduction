package ch15;/**
 * this is
 * Created by mo3tamed on 11/2/17.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class KeyEvent extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox v = new VBox();
        v.setSpacing(10);
        v.setPadding(new Insets(15));
        Text t =new Text("sasasqw") ;

        Label l = new Label("char") ;
        Label l1 = new Label("code") ;
        Label l2 = new Label("text") ;
        v.getChildren().addAll(t,l , l1 , l2) ;

        v.setOnKeyTyped(event -> {
            System.out.println("qwa");
                l.setText(event.getCharacter());

                l1.setText(event.getCode().getName());
                l2.setText(event.getText());

        });

        t.setOnKeyPressed(e -> {

            System.out.println("sassa");
            switch (e.getCode())
            {

                case LEFT: t.setText("Left Arrow");
                case RIGHT:t.setText("Right Arrow");
                case F1: t.setText("F1");
            }
           // t .setText(e.getCharacter());
            t.setText(e.getCode().getName());

        });



        Scene scene = new Scene(v);
        primaryStage.setScene(scene);
        primaryStage.setTitle("KeyEvent");
        primaryStage.show();

        v.requestFocus();
        t.requestFocus();


    }
}

    
