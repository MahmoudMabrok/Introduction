package ex;/**
 * this is
 * Created by mo3tamed on 11/8/17.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.PointLight;
import javafx.scene.Scene;
import javafx.scene.control.ButtonBase;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class DrawPointRemove extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        root.setPadding(new Insets(15));
        Circle r = new Circle(5) ;

        /*r.setOnMousePressed(e->
        {
            if (e.getButton() == MouseButton.SECONDARY) //remove
            root.getChildren().remove() ;
            System.out.println("sa");
        });

        root.setOnMousePressed(e->
        {
          if (e.getButton() == MouseButton.PRIMARY) //add
          {
              r.setCenterX(e.getX());
              r.setCenterY(e.getY());
             // root.getChildren().add(new Circle( e.getX(),e.getY(), 5) );
              root.getChildren().add(r) ;

          }
          *//*else
          {

              Circle r = new Circle( e.getX(),e.getY()  , 5 ) ;
              r.setFill(Color.WHITE);
              root.getChildren().add(r) ;

        ;
          }*//*

        });*/


        Scene scene = new Scene(root, root.getWidth(), root.getHeight());
        primaryStage.setScene(scene);
        primaryStage.setTitle("DrawPointRemove");
        primaryStage.show();

    }
}

    
