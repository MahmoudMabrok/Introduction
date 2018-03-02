package ch30;/**
 * this is
 * Created by mo3tamed on 2/25/18.
 */

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class FlashText extends Application {

    private  String text = "" ;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Button b = new Button();
        Text t = new Text("Hello") ;
        t.setLayoutX( 50);
        t.setLayoutY(50);
        b.setLayoutY(20);
        root.getChildren().addAll(t , b) ;
        root.setPadding(new Insets(15));

        b.setOnAction(e->{
            System.out.println("Ya");
        });


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        if (t.getText().trim().toString().length() == 0)
                            text = "Hello";
                        else
                            text = "" ;

                        Platform.runLater(()->{
                            t.setText(text);
                            System.out.println("a " + Thread.currentThread().getName() +" "+t.getText()+"  " + Thread.currentThread().getPriority());
                        });

                        System.out.println("b" + Thread.currentThread().getName()+t.getText()+"  " + Thread.currentThread().getPriority());
                        Thread.sleep(500);


                    }
                }catch (Exception e ){

                }

            }
        }).start();

        Scene scene = new Scene(root, root.getWidth(), root.getHeight());
        primaryStage.setScene(scene);
        primaryStage.setTitle("FlashText");
        primaryStage.show();

    }
}

    
