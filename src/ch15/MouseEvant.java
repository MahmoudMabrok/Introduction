package ch15;/**
 * this is
 * Created by mo3tamed on 11/2/17.
 */

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MouseEvant extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        VBox v = new VBox() ;
        v.setSpacing(10);
        v.setPadding(new Insets( 15 ));

        Label l = new Label("Mo3tamed") ;
        Label ll = new Label("") ;

        v.getChildren().addAll(l,ll );


        //as mouse enter the scene
        /*v.setOnMouseEntered(e->
        {
            double x = e.getX() ;
            double y = e.getY() ;
            ll.setText( x + " " + y + "\t " + e.getSceneX() + "  "+e.getSceneY()
                    + "\t "+ e.getScreenX() +"  " +e.getScreenY() + " "+
                    e.getButton() + "\t"+
                    " " + e.getClickCount()
            );

        });
*/
        //as click and drag (يشد )

        //there error
        /*v.setOnMouseDragged(
                new EventHandler<MouseDragEvent>() {
                    public void handle(MouseDragEvent  e )
                    {

                        ll.setText("Dragged ")   ;
                    }
                }
        )
        ;*/

/*
        l.setOnMouseClicked(e ->
        {
            double x = e.getX() ;
            double y = e.getY() ;
            ll.setText( x + " " + y + "\t " + e.getSceneX() + "  "+e.getSceneY()
            + "\t "+ e.getScreenX() +"  " +e.getScreenY() + " "+
                e.getButton() + "\t"+
                    " " + e.getClickCount()
                             );

        });
  */

        Scene scene = new Scene(v);
        primaryStage.setScene(scene);
        primaryStage.setTitle("MouseEvant");
        primaryStage.show();

    }
}

    
