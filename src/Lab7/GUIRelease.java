package Lab7;

import javax.swing.*;
import java.awt.*;

public class GUIRelease {

    public static void main(String[] args) {

        Frame frame = new Frame("Our Team");
        frame.setSize(400, 800);
        Label lab, ps, tsar, di, dasha, vika;
        lab = new Label("Чудотворцы");
        lab.setBounds(1, 1, 100, 300);

        ps = new Label("p.s почудим?)");
        ps.setBounds(10, 10, 100, 30);
        tsar = new Label("Царков");
        tsar.setBounds(1, 1, 100, 300);
        dasha = new Label("Стрельченя");
        dasha.setBounds(1, 1, 100, 300);
        di = new Label("Стишенок");
        di.setBounds(1, 1, 100, 300);
        vika = new Label("Логинова");
        vika.setBounds(1, 1, 100, 300);
        Panel panel = new Panel();
        frame.add(panel);
        Button set = new Button("Set");
        panel.add(set);

        Checkbox p1 = new Checkbox("После того, что универ сделал с моим мозгом, он должен на мне жениться");
        frame.add(p1);
        p1.setBounds(10, 10, 120, 20);

        Checkbox p2 = new Checkbox("Если писать шпоры на купюрах, то попоытка отобрать шпоры у студента приобретет вид вымогательства");
        frame.add(p2);
        p2.setBounds(10, 30, 120, 20);
        frame.setVisible(true);
    }
}
