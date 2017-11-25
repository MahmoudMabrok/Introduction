package ch16;/**
 * this is
 * Created by mo3tamed on 11/19/17.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class TextViewer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(15));

        TextArea ta = new TextArea() ;
       // ta.setPrefColumnCount(50);
        //ta.setPrefRowCount(5);
        ta.setEditable(false);//to only view
        ScrollPane sp =new ScrollPane(ta);
       /* Pane p = new Pane();
        p.getChildren().add(sp) ;*/
        sp.widthProperty().addListener(e->{
            System.out.println("aqswa");
            ta.widthProperty().add(sp.getWidth() - ta.getWidth()) ;
        });


        HBox hC = new HBox();
        hC.setSpacing(10);
        Label l = new Label("enter File name ") ;
        Button bView = new Button("View") ;
        TextField tf = new TextField() ;
        tf.setPrefColumnCount(20);
        hC.getChildren().addAll(l , tf,bView) ;

        //controls
        tf.setOnAction(e->{
            System.out.println("Hellso");
        });

        root.setCenter(sp);
        root.setBottom(hC);



        Scene scene = new Scene(root, root.getWidth(), root.getHeight());
        primaryStage.setScene(scene);
        primaryStage.setTitle("TextViewer");
        primaryStage.show();

    }
}

    
