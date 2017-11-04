package ch15;

import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * this is
 * Created by mo3tamed on 11/3/17.
 */
public class CirclePane extends StackPane {
    private Circle circle = new Circle(40) ;

    public CirclePane ()
    {
        getChildren().addAll(circle) ;
        circle.setStroke(Color.RED);
        circle.setFill(Color.BLUE );
    }

    public void increaseRadius ()
    {
        circle.setRadius(circle.getRadius() + 15 );
    }

    public void decreaseRadius ()
    {
        circle.setRadius(circle.getRadius() - 15 );

    }
    public void setW(double value )
    {
        setWidth(value);

    }
    public void setH(double value )
    {
        setHeight(value);

    }
    public void moveX(double value  )
    {
        System.out.println("set " + circle.getCenterX());
        circle.setCenterX(circle.getCenterX() + value);
        System.out.println("set x++ " + circle.getCenterX() );

    }

    public void moveY(double value  )
    {

        circle.setCenterY(circle.getCenterY() + value);
    }


}
