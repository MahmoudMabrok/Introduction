package ch14;
/**
 * this is
 * Created by mo3tamed on 10/23/17.
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TestPane extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        BorderPane root  = new BorderPane() ;

        //GridPane
        GridPane g = new GridPane() ;
        g.setHgap(5);
        g.setVgap(5);
        g.addColumn(1 , new Button("1.1") , new Button("1.2") , new Button("1.3") );
        g.add(new Button("0.1") , 0 ,0 );
        g.addRow( 0 , new Button("r.0") , new Button("r.1" ));
        g.setAlignment(Pos.CENTER);
        root.setCenter(g);


        //HBox and Text , Line
        HBox hr = new HBox() ;
        hr.setSpacing(5);
        Text tx = new Text("AHlaN") ;
        tx.setStrikethrough(true);
        Text tx1 = new Text("BeKm") ;
        tx1.setStroke(Color.RED);
        tx1.setFill(Color.BLUE);
        tx1.setStrokeWidth(1);
        hr.fillHeightProperty() ;
        Line l = new Line( 0,0,10,15) ;
       /* l.endXProperty().bind(hr.widthProperty().divide(10)) ;
        l.endYProperty().bind(hr.heightProperty().divide(10)) ;*/
        hr.getChildren().addAll(l,tx  , tx1 ) ;
        root.setTop(hr);

        //VBox and Rectangle
        VBox v = new VBox() ;
        Rectangle r1 = new Rectangle(0 , 0 , 200 , 200 );
        r1.setRotate(-25);
        r1.setArcHeight(20);
        r1.setArcWidth(20);
        r1.setStrokeWidth(5);
        r1.setStroke(Color.RED);
        r1.setFill(Color.BLUE);
        v.setSpacing(10);
        v.getChildren().add(r1) ;
        root.setRight(v) ;


        //HBox , VBox , Circle ,ellipse , Arc
        VBox vl = new VBox() ;
        HBox hl = new HBox() ; // h for left
        vl.getChildren().add(hl);
        Circle c = new Circle(0 , 0 , 25 , Color.AZURE) ;
        c.setStroke(Color.BLUE);
        Ellipse e = new Ellipse(10 , 12  , 15 , 20 ) ;
        e.setStroke(Color.BLUE);
        hl.getChildren().addAll(c,e) ;
        Arc ar = new Arc(10.0 , 30 , 15 , 24 , 0, 90 ) ;
        ar.setType(ArcType.OPEN);
        ar.setStroke(Color.BLUE);
        ar.setStrokeWidth(10);
        vl.getChildren().add(ar) ;
        root.setLeft(vl);

        Scene sc = new Scene(root) ;
        primaryStage.setScene(sc);
        primaryStage.setTitle("TestPane");
        primaryStage.show();

    }
}
