import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Block extends Rectangle {

    Image pic;
    boolean destroyed;
    int movX, movY;

    Block(int x, int y, int w, int h, String s) throws IOException{
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
        movX = 3;
        movY = 3;

        pic = ImageIO.read(new File("src/"+s));

    }

    public void draw(Graphics g, Component c){
        if(!destroyed){
            g.drawImage(pic, x, y, width, height, c);
        }
    }
}
