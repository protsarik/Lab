package Lab8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import static java.lang.Integer.valueOf;

public class indi81 extends JFrame {
    private JButton button = new JButton("Решение");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Введи чему равен x:");

    public indi81() {
        super("Пример x+9");
        this.setBounds(100, 100, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(label);
        container.add(input);
        ButtonGroup group = new ButtonGroup();
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int text = Integer.valueOf(input.getText());
            text = text + 9;
            String message = "";
            message += "Кнопка была нажата\n";
            message += "Текст: " + text + "\n";
            JOptionPane.showMessageDialog(null, message, "Output",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }

    public static void main(String[] args) {
        indi81 app = new indi81();
        app.setVisible(true);
    }
}
