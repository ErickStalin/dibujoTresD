import java.awt.Graphics;
import javax.swing.JPanel;

public class panelDibujoTresD extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int anchura = getWidth();
        int altura = getHeight();

        g.draw3DRect(50,10,75,25,true);
        g.draw3DRect(50,100,75,25,true);
        g.draw3DRect(25,10,25,115,true);
        g.draw3DRect(50,55,55,25,true);
    }

}