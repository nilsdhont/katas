package connect4;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.awt.*;

import static junit.framework.TestCase.fail;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.Assert.assertNotNull;

public class BoardTest {


    private Board board;

    @Before
    public void setUp() throws Exception {
        board = new Board();
    }

    @Test
    public void board_colorTest(){
        board.addTile(0,0, Color.RED);
        Coordinaat tile = board.getTile(0, 0);
        assertNotNull(tile);
        assertThat(tile.getColor()).isEqualTo(Color.RED);
    }

    @Test(expected = IllegalStateException.class)
    public void board_doubleAdd_fail(){

        board.addTile(0,0, Color.RED);
        board.addTile(0,0, Color.RED);
    }

    @Test(expected = IllegalStateException.class)
    public void board_color_doubleColor_fail(){
        board.addTile(0,0, Color.RED);
        board.addTile(0,1, Color.RED);
    }

    @Test(expected = IllegalStateException.class)
    public void board_minTest(){
        board.addTile(-1,0,Color.RED);
    }

    @Test(expected = IllegalStateException.class)
    public void board_maxRowTest(){
        board.addTile(0,7,Color.RED);
    }

    @Test(expected = IllegalStateException.class)
    public void board_maxColumnTest(){
        board.addTile(8,0,Color.RED);
    }

    @Test(expected = IllegalStateException.class)
    public void board_maxQuantity(){
        board.addTile(0,0,Color.RED);
        board.addTile(0,1,Color.YELLOW);
        board.addTile(0,2,Color.RED);
        board.addTile(0,3,Color.YELLOW);
        board.addTile(0,4,Color.RED);
        board.addTile(0,5,Color.YELLOW);
        board.addTile(0,6,Color.RED);
        board.addTile(0,7,Color.YELLOW);
    }

    @Ignore
    @Test
    public void board_minMaxTest(){
        fail("not impl");

    }
}
