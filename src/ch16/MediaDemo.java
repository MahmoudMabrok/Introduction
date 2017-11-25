package ch16;/**
 * this is
 * Created by mo3tamed on 11/19/17.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;

import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class MediaDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws MalformedURLException  {
        BorderPane root = new BorderPane();
        root .setPadding(new Insets(15));
        Media m = new Media(getClass()
                .getClassLoader()
                .getResource("452_AboabAlKhair.mp3")
                .toString()) ; //toExternalForm  -- String representation URL



        MediaPlayer mp = new MediaPlayer(m);
        MediaView mv  = new MediaView(mp) ;


        HBox hControl = new HBox() ;
        hControl.setAlignment(Pos.CENTER);
        hControl.setPadding(new Insets(20));
        hControl.setSpacing(15);
        Button bPlay  =new Button("<") ;
        Button bRestart   =new Button(">>") ;

        Slider sVol = new Slider() ;
        sVol.setMin(0);
        sVol.setMax(1.0);
        sVol.setValue(0.5);

        System.out.println(mp.currentTimeProperty().getValue().toString());
        System.out.println(m.getDuration().toString());
        mp.volumeProperty().bind(sVol.valueProperty().divide(sVol.getMax()));
        hControl.getChildren().addAll(bPlay ,bRestart ,sVol) ;

        bPlay.setOnAction(e->
        {
            if (bPlay.getText() == "<")
            {
                mp.play();
                bPlay.setText("||");
            }else
            {
                mp.pause();
                bPlay.setText("<");
            }
        });

        bRestart.setOnAction(e->
        {
            mp.play();
            mp.seek(Duration.ZERO);
        });

        root.setCenter(mv);
        root.setBottom(hControl);



        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("MediaDemo");
        primaryStage.show();

    }
}

    
