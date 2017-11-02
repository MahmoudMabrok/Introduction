package ch15;/**
 * this is
 * Created by mo3tamed on 11/2/17.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class LoanCalculator extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        GridPane g = new GridPane();
        g.setPadding(new Insets( 15));
        g.setHgap(10) ;
        g.setVgap(5);
        g.setAlignment(Pos.CENTER);

        Label lAnual = new Label("Anual ") ;
        Label lYears = new Label("N of Years ") ;
        Label lAmount = new Label("Loan Amount") ;
        Label lMPayment = new Label("Month Payment ") ;
        Label lTotal = new Label("Total Amount ") ;

        TextField TAnual = new TextField() ;
        TextField TYears = new TextField() ;
        TextField TAmount = new TextField() ;
        TextField TMPayment = new TextField() ;
        TextField TTotal = new TextField() ;

        Button Bcal = new Button("Calculate :: ?? " ) ;

        g.addRow(0 , lAnual , TAnual);
        g.addRow(1 , lYears , TYears);
        g.addRow(2, lAmount , TAmount);
        g.addRow(3 , lMPayment , TMPayment);
        g.addRow(4 , lTotal , TTotal);
        g.add(Bcal ,1,5 );


        Bcal.setOnAction(e -> {

            try {

                System.out.println("before  ");
                double loan_amount = Double.parseDouble(TAmount.getText());
                double n_years = Double.parseDouble(TYears.getText());
                double rate = Double.parseDouble(TAnual.getText().toString());
                rate /= 100.0 ;


                System.out.println("here ");

                for (int i = 0; i < (int) n_years; i++) {
                    loan_amount *= (1 + rate);
                }

                double month_amont = (loan_amount / n_years) / 12.0 ;
                month_amont = (int)(100 * month_amont ) / 100.0 ;
                loan_amount = (int)(100 * loan_amount ) / 100.0 ;

                TTotal.setText("" + loan_amount);
                TMPayment.setText(String.valueOf(month_amont) );

            }catch (NumberFormatException nfE )
            {
                Bcal.setText(nfE.toString());

            }


        }) ;



        Scene scene = new Scene(g);
        primaryStage.setScene(scene);
        primaryStage.setTitle("LoanCalculator");
        primaryStage.show();

    }
}

    
