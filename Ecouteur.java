import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class Ecouteur extends ComponentAdapter {
    private HelloWorldSwing hello;

    Ecouteur(HelloWorldSwing jp) {
        super();
        hello = jp;
    }

    public void componentResized(ComponentEvent e) {
        System.out.println("REDIMENSIONNEMENT " + hello.getWidth() + "x" + hello.getHeight());
        hello.updateTitreDimensions();
    }
}