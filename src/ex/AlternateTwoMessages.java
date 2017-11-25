package ex;/**
 * this is
 * Created by mo3tamed on 11/8/17.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;


public class AlternateTwoMessages extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox v = new VBox();
       // v.setPadding(new Insets(30));
       // v.getChildren().addAll(new Button(),new Button(),new Button()) ;
        Text tx = new Text(50 , 50 , "Java is fun") ;
        tx.setFill(Color.BLUE);
        tx.setTextAlignment(TextAlignment.CENTER) ;

        v.setOnMousePressed(e->
        {
            if (tx.getText().contains("fun")) //check if it original one or not
                tx.setText("Java is powerful");
            else
                tx.setText("Java is fun");
        });


        v.getChildren().add( tx);
        Scene scene = new Scene(v , v.getWidth() , v.getHeight());
        primaryStage.setScene(scene);
        primaryStage.setTitle("AlternateTwoMessages");
        primaryStage.show();

    }
}

    
