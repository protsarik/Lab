package Lab7;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JList;
public class IND_Z2 {
    private Frame mainFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;
    public IND_Z2(){
        mainFrame = new Frame("Java AWT Examples");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        // JList myList = new JList(myArray);
        // myList.setSelectedIndex(myArray.length - 1);
        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        statusLabel = new Label();
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(350,100);
        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());
        headerLabel.setText("Месяцы");
        final Choice pas = new Choice();
        pas.add("Январь"); pas.add("Февраль"); pas.add("Март"); pas.add("Апрель"); pas.add("Май"); pas.add("Июнь");
        pas.add("Июль"); pas.add("Август"); pas.add("Сентябрь"); pas.add("Октябрь"); pas.add("Ноябрь"); pas.add("Декабрь");
        Button showButton = new Button("Показать");

        showButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String s = String.valueOf(pas.getSelectedIndex());
                int b = Integer.parseInt(s);
                switch (b) {
                    case 0: b=31; break;
                    case 1: b=29; break;
                    case 2: b=31; break;
                    case 3: b=30; break;
                    case 4: b=31; break;
                    case 5: b=30; break;
                    case 6: b=31; break;
                    case 7: b=31; break;
                    case 8: b=30; break;
                    case 9: b=31; break;
                    case 10: b=30; break;
                    case 11: b=31; break;

                }

                String data = "Количество дней: "+ b + " - " + pas.getItem(pas.getSelectedIndex());
                statusLabel.setText(data);
            }
        });
        controlPanel.add(pas);
        controlPanel.add(showButton);
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }
    public static void main(String[] args){
        IND_Z2 awtControlDemo = new IND_Z2();

    }
}
