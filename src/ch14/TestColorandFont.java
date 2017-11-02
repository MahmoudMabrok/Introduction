package ch14;/**
 * this is
 * Created by mo3tamed on 10/19/17.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class TestColorandFont extends Application {
    int x =0 ;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button a = new Button("Test") ;
        Button b = new Button("Test2") ;
        Button c = new Button("Test2") ;
        a.setTextFill(Color.RED.brighter());
        b.setTextFill(new Color( 0,0 ,0 ,0.5 ));
        c.setTextFill(Color.rgb( 255,255,255,1));//use static method return Color

        Circle ci = new Circle() ;
        ci.setRadius(70);
        ci.setFill(Color.BLUE.darker());

        Label l = new Label("الله اكبــــــر ");
        l.setFont(Font.font("AlHor"  ,FontWeight.NORMAL, FontPosture.REGULAR , 25 )  );

        Label ll = new Label("rerefsdweqw ");
        l.setFont(Font.font("Times New Roman"  )  );


        System.out.println(Font.getFontNames());




        HBox root = new HBox() ;
        root.getChildren().addAll(a , b,c , ci , l ) ;
        VBox v = new VBox() ;
        v.getChildren().addAll(root , ll ) ;

        primaryStage.setScene( new Scene(v , 800,300 ));
        primaryStage.setTitle("TestColor");
        primaryStage.show();

    }
}
