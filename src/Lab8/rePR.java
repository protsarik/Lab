package Lab8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JTextField;
public class rePR extends JFrame {
    private JButton button = new JButton("Нажми"); // надпись на кнопке
    private JTextField input = new JTextField("", 5); // размер 5
    private JLabel label = new JLabel("Введи:");
    private JRadioButton radio1 = new JRadioButton("Выбери 1");
    private JRadioButton radio2 = new JRadioButton("Выбери 2");
    private JCheckBox check = new JCheckBox("Флаг", false);
    private JLabel label1 = new JLabel("Введи число:");
    private JTextField name = new JTextField(" ");
    private JTextField out = new JTextField();
    public rePR() {
        super("Простой пример");
        this.setBounds(100, 100, 250, 200);//размер формочки
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//закрытие формочки
        Container container = this.getContentPane(); // container - формочка
        container.setLayout(new GridLayout(5, 5, 5, 5));
        container.add(label);//метод add
        container.add(input);
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        container.add(radio1);
        // radio1.setSelected(true);
        container.add(radio2);
        container.add(check);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
        container.add(label1);
        container.add(name);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String text = name.getText();
            int x1 = Integer.parseInt(text);
            x1=x1*2;
            out.setText(text);
            String message = "";
            message += "Кнопка была нажата\n";
            message += "Текст: " + input.getText() + "\n";
            message += (radio1.isSelected() ? "Radio #1" : "Radio #2") + " выбрано\n";
            message += "CheckBox был " + ((check.isSelected()) ? "установлен"+"\n" :
                    "не установлен");

            message += "Удвоенное число: "+out.getText() + "\n";
            JOptionPane.showMessageDialog(null, message, "Output",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }

    public static void main(String[] args) {
        rePR app = new rePR();
        app.setVisible(true);
    }
}
