package ch16;/**
 * this is
 * Created by mo3tamed on 11/19/17.
 * 3 Radio button  red yellow green
 * finished 11/19
 *
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class TrafficLights extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(15));

        VBox vC = new VBox() ;
        vC.setSpacing(15);
        Circle cg = new Circle(25 ) ;
        Circle cy = new Circle(25) ;
        Circle cR = new Circle(25) ;
        cg.setFill(Color.WHITE);
        cy.setFill(Color.WHITE);
        cR.setFill(Color.WHITE);
        vC.getChildren().addAll(cg ,cy , cR) ;
        vC.setAlignment(Pos.CENTER);

        RadioButton rg = new RadioButton("Green") ;
        RadioButton ry = new RadioButton("Yellow") ;
        RadioButton rR = new RadioButton("Red") ;

        ToggleGroup tg = new ToggleGroup() ;//create group then add button to it
        rg.setToggleGroup(tg);
        ry.setToggleGroup(tg);
        rR.setToggleGroup(tg);

        tg.selectedToggleProperty().addListener(e->{ //listen to change in toggle group
            if (rg.isSelected()) //check if red button is selected
            {
                cg.setFill(Color.GREEN);
                cy.setFill(Color.WHITE);
                cR.setFill(Color.WHITE);
            }
            else if(ry.isSelected())
            {
                cy.setFill(Color.YELLOW);
                cg.setFill(Color.WHITE);
                cR.setFill(Color.WHITE);
            }
            else if(rR.isSelected())
            {
                cR.setFill(Color.RED);
                cg.setFill(Color.WHITE);
                cy.setFill(Color.WHITE);
            }
            else   // this case make all white
            {
                cg.setFill(Color.WHITE);
                cy.setFill(Color.WHITE);
                cR.setFill(Color.WHITE);

            }


        });

        HBox hc = new HBox() ;
        hc.getChildren().addAll(rg , ry , rR) ;
        hc.setAlignment(Pos.CENTER);


        root.setCenter(vC);
        root.setBottom(hc);


        Scene scene = new Scene(root, root.getWidth(), root.getHeight());
        primaryStage.setScene(scene);
        primaryStage.setTitle("TrafficLights");
        primaryStage.show();

    }
}

    
