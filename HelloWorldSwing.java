import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.Dimension;
public class HelloWorldSwing extends JFrame {

    private static final long serialVersionUID = 1L;

    public HelloWorldSwing(String titre) {
        super(titre);
        this.getRootPane().addComponentListener(new Ecouteur());
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    public void centrer(double d) {
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension dim = t.getScreenSize();
        int largeur = (int) (dim.height * d);
        int longueur = (int) (dim.width * d);
        this.setBounds(dim.width/4, dim.height/4,longueur,largeur);

    }

    public static void main(String[] args) throws InterruptedException {
        HelloWorldSwing maFenetre = new HelloWorldSwing("Hello World");
        Thread.sleep(2000);
        maFenetre.setSize(320,200);
        maFenetre.setTitle("Halo Mundo");
        Thread.sleep(2000);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int largeur = dim.width;
        int longueur = dim.height;
        System.out.println("Dimensions de l'écran : " + largeur + "x" + longueur);
        maFenetre.setTitle("Dimensions de l'écran : " + largeur + "x" + longueur);
        Thread.sleep(2000);
        maFenetre.centrer(0.5);
    }

    public void updateTitreDimensions() {
        setTitle("Dimensions de la fenêtre : " + this.getWidth() + "x" + this.getHeight());
    }

    class Ecouteur extends ComponentAdapter {
        Ecouteur() { super(); }

        public void componentResized(ComponentEvent e) {
            System.out.println("REDIMENSIONNEMENT " + getWidth() + "x" + getHeight());
        }

    }


}
