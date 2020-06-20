package Lab8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class pr2 extends JFrame {
    private JButton button = new JButton("Нажми");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Введи:");
    private JRadioButton radio1 = new JRadioButton("Выбери 1");
    private JRadioButton radio2 = new JRadioButton("Выбери 2");
    private JCheckBox check = new JCheckBox("Флаг", false);

    public pr2() {
        super("Простой пример");
        this.setBounds(100, 100, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(label);
        container.add(input);
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        container.add(radio1);
        radio1.setSelected(true);
        container.add(radio2);
        container.add(check);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Кнопка была нажата\n";
            message += "Текст: " + input.getText() + "\n";
            message += (radio1.isSelected() ? "Radio #1" : "Radio #2") + " выбрано\n";
            message += "CheckBox был " + ((check.isSelected()) ? "установлен" :
                    "не установлен");
            JOptionPane.showMessageDialog(null, message, "Output",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }

    public static void main(String[] args) {
        pr2 app = new pr2();
        app.setVisible(true);
    }
}
