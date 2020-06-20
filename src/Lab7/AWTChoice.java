package Lab7;

import java.awt.*;
import java.awt.event.*;
public class AWTChoice {
    private Frame mainFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;
    public AWTChoice(){
        mainFrame = new Frame("Java AWT Examples");
        mainFrame.setSize(250,250);
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
        statusLabel.setSize(100,100);
        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());
        headerLabel.setText("Элемент управления: Choice");
        final Choice fruitChoice = new Choice();
        fruitChoice.add("Яблоко");
        fruitChoice.add("Виноград");
        fruitChoice.add("Манго");
        fruitChoice.add("Банан");
        Button showButton = new Button("Показать");
        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Выбран фрукт: "
                        + fruitChoice.getItem(fruitChoice.getSelectedIndex());
                statusLabel.setText(data);
            }
        });
        controlPanel.add(fruitChoice);
        controlPanel.add(showButton);
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }
    public static void main(String[] args){
        AWTChoice awtControlDemo = new AWTChoice();

    }
}
