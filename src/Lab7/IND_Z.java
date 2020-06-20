package Lab7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class IND_Z extends Frame implements ActionListener {
    private Label lblInput;
    private Label lblOutput;
    private TextField tfInput;
    private TextField tfOutput;
    private double sum = 0;

    public IND_Z() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        setLayout(new FlowLayout());
        lblInput = new Label("Введите x: ");
        add(lblInput);
        tfInput = new TextField(20);
        add(tfInput);
        tfInput.addActionListener(this);
        lblOutput = new Label("Уравнение равно: ");
        add(lblOutput);
        tfOutput = new TextField(25);
        tfOutput.setEditable(false);
        add(tfOutput);
        setTitle("IND_Z");
        setSize(350, 120);
        setVisible(true);
    }

    public static void main(String[] args) {
        new IND_Z();
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        int numberIn = Integer.parseInt(tfInput.getText());
        String err = "";
        if ((numberIn+9) < 0) err = "Введите положительное число";
        sum = Math.sqrt((numberIn) + 9);
        tfInput.setText("");
        tfOutput.setText(sum + " " + err);
    }
}