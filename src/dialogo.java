import javax.swing.JFrame;
public class dialogo {
    public static void main(String[] args){
        panelDibujoTresD panel = new panelDibujoTresD();
        JFrame aplicacion = new JFrame();

        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(250, 250);
        aplicacion.setVisible(true);
    }
}