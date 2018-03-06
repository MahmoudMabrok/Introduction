package ch31;
/**
 * this is
 * Created by mo3tamed on 3/3/18.
 */

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.*;


public class ChatClient extends Application {


    DataOutputStream out = null ;
    DataInputStream in = null ;

    String user = "Me -> " ;
    String server = "Other -> " ;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        Label welcome = new Label("Welcome 2 ") ;
        root.setPadding(new Insets(15));
        TextArea ta = new TextArea() ;
        ta.setEditable(false);
        ScrollPane sp = new ScrollPane(ta);
        Button  send = new Button("Send") ;
        TextField text = new TextField() ;

        HBox sendPane = new HBox(10) ;
        sendPane.getChildren().addAll(text  , send);
        root.getChildren().addAll( welcome, sp , sendPane) ;

        send.setOnAction(e->{
            try {
                ta.appendText(user + text.getText().toString() + '\n');
                out.writeUTF(text.getText().toString());
            }catch (IOException ex){
                ex.printStackTrace();
            }
        });

        try{
            Socket socket = new Socket( "localhost",8000 ) ;
            out = new DataOutputStream(socket.getOutputStream()) ;

            new Thread( () ->{
                try {
                    in = new DataInputStream(socket.getInputStream());
                    while(true) {
                        String res = in.readUTF();
                        Platform.runLater(() -> {
                            ta.appendText(server + res + '\n');
                        });
                        Thread.sleep(100);
                    }
                }catch (EOFException e ){
                    e.printStackTrace();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                catch (IOException e ){
                    e.printStackTrace();
                }
            }).start();

        }catch (ConnectException cn ){
            System.out.println("NO  found server");
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }



        Scene scene = new Scene(root , 400 , 300 );
        primaryStage.setScene(scene);
        primaryStage.setTitle("ChatClient");
        primaryStage.show();

        text.prefWidthProperty().bind(primaryStage.widthProperty().multiply(0.7));
        ta.prefWidthProperty().bind(sp.widthProperty());

        primaryStage.setOnCloseRequest(e->{
            try {
                in.close();
                out.close();
            }catch (NullPointerException n){
                n.printStackTrace();
            }
            catch (IOException ex){
                ex.printStackTrace();
            }
        });

    }
}

    
