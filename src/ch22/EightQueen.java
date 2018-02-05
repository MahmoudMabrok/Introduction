package ch22;/**
 * this is
 * Created by mo3tamed on 1/31/18.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class EightQueen extends Application {

    private final int SIZE = 8;
    private int[] queens = new int[]{-1, -1, -1, -1, -1, -1, -1, -1};

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane();
        root.setPadding(new Insets(15));
        Button[][] buttons = new Button[SIZE][SIZE];


        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                root.add(buttons[i][j] = new Button(), i, j);
                buttons[i][j].setStyle("-fx-border-color: black");
                buttons[i][j].setPrefSize(55, 55);
            }
        }
boolean  k =  search() ;
        System.out.println(k);
        for (int i : queens
             ) {
            System.out.println(i);
        }

        for (int i = 0; i <SIZE ; i++) {
            buttons[i][queens[i]].setText("Queen");
        }


        Scene scene = new Scene(root, 55 * SIZE, 55 * SIZE);
        primaryStage.setScene(scene);
        primaryStage.setTitle("EightQueen");
        primaryStage.show();

    }

    public boolean search() {

        int k = 0;
        while (k >= 0 && k < SIZE) {

            int j = getPosition(k);
            System.out.println("j = " + j);
            if (j < 0) {
                queens[k] = -1;
                k--;
            } else {
                queens[k] = j;
                k++;
            }
        }

        if (k == -1)
            return false;
        else
            return true;
    }

    public int getPosition(int k) {

        int start = queens[k] + 1;

        for (int j = start; j < SIZE; j++) {
            if (isValid(k, j))
                return j;
        }

        return -1;


    }

    public boolean isValid(int row, int col) {

        for (int i = 1; i <= row; i++) {
            if (queens[row - i] == col || // check same column
                    queens[row - i] == col + i ||  // check right diagonal
                    queens[row - i] == col - i)
                return false; //not able to position a queen in this row ,col
        }

        return true; //able to position a queen in this row ,col

    }
}

    
