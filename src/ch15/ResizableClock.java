package ch15;/**
 * this is
 * Created by mo3tamed on 11/3/17.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class ResizableClock extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox v = new VBox();
        v.setSpacing(10);
        v.setPadding(new Insets(15));

        CirclePane c = new CirclePane() ;
        v.getChildren().addAll(c) ;
        v.setAlignment(Pos.CENTER);
        c.setOnKeyPressed(e->{

                switch (e.getCode())
                {
                    case UP:c.increaseRadius();break;
                    case DOWN:c.decreaseRadius();break ;
                    case LEFT:c.moveX(-10);
                        System.out.println("lll ");break; //here a story data encapsulation
                    case RIGHT:c.moveX(10);break ;

                }

        });

        v.widthProperty().addListener(ov ->
        {
         c.setW(v.getWidth()) ;

        });
        v.heightProperty().addListener(o ->{
            System.out.println("hhhh");
            c.setH(v.getHeight());
            System.out.println("h254");

        });

        Scene scene = new Scene(v);
        primaryStage.setScene(scene);
        primaryStage.setTitle("ResizableClock");
        primaryStage.show();
        c.requestFocus();

    }
}

    
