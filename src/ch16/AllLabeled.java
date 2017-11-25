package ch16;/**
 * this is
 * Created by mo3tamed on 11/6/17.
 */

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class AllLabeled extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        BorderPane v = new BorderPane() ;

        CheckBox ch = new CheckBox ("yes") ;
        ch.setGraphic( new ImageView("ch16/img1.png"));

        ch.setContentDisplay(ContentDisplay.RIGHT);

        v.setCenter(ch);

        TextArea tx = new TextArea("dsdseewew") ;
        tx.setPrefColumnCount(3);
        tx.setPrefRowCount(2);
        tx.setWrapText(true);
        v.setTop(tx);


        ComboBox<String> c = new ComboBox<String>();
        c.setValue("aaa");
        c.getItems().addAll("AHMED" ,"AHMED","A") ;
        c.setOnAction(e->
        {

            System.out.println(c.getValue().hashCode());
        });

        ObservableList<String> ss = c.getItems() ;
     //   System.out.println(ss.toString());
     //   System.out.println(c.getValue());


        v.setLeft(c);

        Scene scene  = new Scene(v);
        primaryStage.setScene(scene);
        primaryStage.setTitle("AllLabeled");
        primaryStage.show();


        ch.setOnAction(e->
        {


            if (ch.isSelected())

                System.out.println(tx.getText() );
                System.out.println(tx.getText().length() );
        });


    }
}

    
