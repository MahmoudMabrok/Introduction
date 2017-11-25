package ch15;/**
 * this is
 * Created by mo3tamed on 11/3/17.
 */

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;


public class MO3tamed extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane v = new Pane ()  ;



        //v.setAlignment(Pos.CENTER);
        Circle c = new Circle(125,100,50) ;
        c.setFill(Color.YELLOW);
        Label l = new Label ("Status ") ;
        Label ll = new Label ("Status 2 ") ;

       //Rectangle r = new Rectangle( 0,0,25,50) ;
        Text r = new Text("I am Mo3tamed");
        HBox hl =new HBox();
        hl.setSpacing(20);
        hl.getChildren().addAll(l,ll) ;

       v.getChildren().add(c);
        v.getChildren().add(r) ;
        v.getChildren().add(hl) ;


        PathTransition p = new PathTransition() ;
        p.setPath(c);
        p.setCycleCount(Timeline.INDEFINITE );
        p.setNode(r);
        p.setRate(1.5);
        p.setDuration(new Duration(4000));
       p.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
      //  p.setAutoReverse(true);
        p.play();

        CheckBox ch = new CheckBox("yes" , new ImageView ("img1.png")) ;
        v.getChildren().add(ch) ;


        c.setOnMousePressed(e-> {
                    if (e.getClickCount() == 2)
                    {
                        p.setRate(p.getRate() + 0.5);
                        ll.setText("you pressed twice  rate ++ ");
                }
                if (e.getButton() == MouseButton.SECONDARY)
                {
                    p.setRate(p.getRate() - 0.8);
                    ll.setText("you pressed  right click   rate -- ");


                }
            p.pause();
            l.setText("MousePressed");
          // p.stop();  //after stop it start from beginning
        });
        c.setOnMouseReleased(e->
        {
            p.play() ;
            l.setText("MouseReleased ");

        }) ;
        Scene scene = new Scene(v,350,200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("MO3tamed");
        primaryStage.show();

    }
}

    
