package ch31;/**
 * this is
 * Created by mo3tamed on 3/3/18.
 */

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.omg.SendingContext.RunTime;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;


public class ChatServer extends Application {



    String user = "Me -> " ;
    String server = "Other  -> " ;

    TextArea ta ;
    DataOutputStream out ;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        Label welcome = new Label("Welcome  1") ;
        root.setPadding(new Insets(15));
        ta = new TextArea() ;
        ta.setEditable(false);
        ScrollPane sp = new ScrollPane(ta);
        Button send = new Button("Send") ;
        TextField text = new TextField() ;

        HBox sendPane = new HBox(10) ;
        sendPane.getChildren().addAll(text ,send);
        root.getChildren().addAll( welcome, sp , sendPane) ;

        send.setOnAction(e->{
            try {
                out.writeUTF(text.getText().toString());
                ta.appendText(user + text.getText().toString() + '\n');
                out.flush();

            }catch (IOException ex){
                ex.printStackTrace();
            }
        });

        new Thread(() ->{
            try {
               ServerSocket serverSocket = new ServerSocket(8000) ;


                   Socket socket  = serverSocket.accept(); // block connection is made
                   out = new  DataOutputStream(socket.getOutputStream()); // make output stream
                   new Thread(new HandleCLient(socket)).start(); // handle input  from user


            }catch (IOException e){
                e.printStackTrace();
            }
        }).start();



        Scene scene = new Scene(root , 400 , 300 );
        primaryStage.setScene(scene);
        primaryStage.setTitle("ChatServer");
        primaryStage.show();

        text.prefWidthProperty().bind(primaryStage.widthProperty().multiply(0.7));
        ta.prefWidthProperty().bind(sp.widthProperty());

        primaryStage.setOnCloseRequest(e->{
            try {
                out.close();
            }catch (NullPointerException n){
                n.printStackTrace();
            }
            catch (IOException ex){
                ex.printStackTrace();
            }
        });


    }


    class HandleCLient implements  Runnable {

        Socket socket ;

        public HandleCLient(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {

                DataInputStream in = new DataInputStream(socket.getInputStream());
                String s = in.readUTF() ;
                Platform.runLater(()->{
                    ta.appendText(server + s +'\n');
                });

            }catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }


}