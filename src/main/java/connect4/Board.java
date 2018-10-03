package connect4;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Board {

    private final List<Coordinaat> field;

    private Color lastAdded;

    public Board() {
        field = new ArrayList<>();
    }

    public void addTile(int x, int y, Color color) {
        Coordinaat coordinaat = new Coordinaat(y, color);
        if(isPresent(coordinaat)){
            throw  new IllegalStateException();
        }
        if(lastAdded!=null && lastAdded.equals(color)){
            throw  new IllegalStateException();
        }
        field.add(coordinaat);
        lastAdded= coordinaat.getColor();

    }

    private boolean isPresent(Coordinaat coordinaat) {
        return field.stream().anyMatch(c-> c.getY()==coordinaat.getY());
    }

    public Coordinaat getTile(int x, int y) {
        return field.get(0);
    }
}
