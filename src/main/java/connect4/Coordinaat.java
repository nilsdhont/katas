package connect4;

import java.awt.*;
import java.util.Objects;

public class Coordinaat {

    private int y;
    private Color color;

    public Coordinaat( int y, Color color) {
        if(isNotInRange( y)){
            throw  new IllegalStateException();
        }
        this.y = y;
        this.color = color;
    }

    private boolean isNotInRange( int y) {
        return y<0 || y>6;
    }


    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    }
