package Lab7;

import java.awt.*;
import java.awt.event.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class AWTImage {
    private Frame mainFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;
    public AWTImage(){
        mainFrame = new Frame("Java AWT Examples");
        mainFrame.setSize(400,1200);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        statusLabel = new Label();
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(350,100);
        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
        headerLabel.setText("Элемент управления: Image");
        controlPanel.add(new ImageComponent("IMG_20160712_124046.jpg"));
        mainFrame.setVisible(true);
    }
    public static void main(String[] args)throws Exception{
        AWTImage awtControlDemo = new AWTImage();
    }
    class ImageComponent extends Component {
        BufferedImage img;
        public void paint(Graphics g) {
            g.drawImage(img, 0, 0, null);
        }
        public ImageComponent(String path) {
            try {
                img = ImageIO.read(new File("Lab1/src/Lab7/name.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public Dimension getPreferredSize() {
            if (img == null) {
                return new Dimension(100,100);
            } else {
                return new Dimension(img.getWidth(), img.getHeight());
            }
        }
    }
}
