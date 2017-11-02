package ch15;/**
 * this is
 * Created by mo3tamed on 11/1/17.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class TestHanderler extends Application {

    public Circle c;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Pane p = new HBox();
        p.setPadding(new Insets(10, 0, 10, 10));

        IncreaeHandeler increaeHandeler = new IncreaeHandeler();
        Button btn_dec = new Button("dec");
        Button btn_in = new Button("in");
        Button default_shape = new Button("default ");

        c = new Circle();
        c.setRadius(30);
        c.setStroke(Color.RED);
        c.setFill(Color.YELLOW);
        p.getChildren().addAll(c, btn_in, default_shape, btn_dec);

        btn_in.setOnAction(increaeHandeler);
        //using anonymous inner class handler
        //must use no arg constructor
        btn_dec.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                c.setRadius(c.getRadius() - 10);
            }
        });
        //using lambda expression
        // (typeEvent par ) -> {statements ; }
        // ex : (ActionEvent e ) -> sout ;
        //here interface must be (SAM)single abstract method interface which here is (handle )

        default_shape.setOnAction(e -> {
            c.setRadius(30);
        });

        Scene scene = new Scene(p);
        primaryStage.setScene(scene);
        primaryStage.setTitle("TestHanderler");
        primaryStage.show();

    }

    //Inner class
    class IncreaeHandeler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent e) {
            System.out.println(e.getSource().toString());
            c.setRadius(c.getRadius() + 7);


        }

    }


}

class e {
    //to make instance of inner from another class
//first make a obj of outer class (to see it )
//if inner is static you use new Outer.Inner(); only
    TestHanderler.IncreaeHandeler i = new TestHanderler().new IncreaeHandeler();


}


