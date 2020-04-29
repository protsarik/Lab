package Lab_6;
// На предприятии сотрудники могут работать в штате либо по договору подряда. Для штатных сотрудников заработная плата назначается исходя из оклада,
// размера надбавки (% от оклада) и премии, а также в случае отсутствия на работе (отпуск болезнь и др.) оклад выплачивается пропорционально отработанным дням.
// Для сотрудников, работающих по договору подряда заработная плата начисляется исходя из ставки за час и количества отработанных.
//Написать программу для начисления заработной платы и формирования ведомости для выдачи заработной платы.

public class Work {
    private double oklad;
    private double nadbabka;
    private double premiya;
    private int time = 176;
    private double Z;


    public Work(double okl, double nadb, double prem, int times) {
        oklad = okl;
        nadbabka = nadb;
        premiya = prem;
        time = times;
    }

    public double Zarplata() {
        if (time == 176) {
            Z = oklad + oklad * nadbabka + premiya;
        } else {
            Z = (oklad + oklad * nadbabka) / 176 * time + premiya;
        }
        return Z;
    }

    public static void main(String[] args) {

        Work w1 = new Work(10000, 0.15, 5000, 170);
        System.out.println("Z = " + w1.Zarplata());
    }
}
