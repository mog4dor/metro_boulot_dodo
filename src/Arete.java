import java.util.ArrayList;

import static java.util.Collections.sort;

public class Arete implements Comparable<Arete>{


    private int num_sommet1;
    private int num_sommet2;
    private int tps;

    private boolean areteVisitee = false;


    public Arete(int s1, int s2, int t)
    {
        this.num_sommet1 = s1;
        this.num_sommet2 = s2;
        this.tps = t;
    }

    public Arete(int s1, int s2)
    {
        this.num_sommet1 = s1;
        this.num_sommet2 = s2;
        this.tps = 0;
    }

    public Arete() {

    }

    public boolean isAreteVisitee() {
        return areteVisitee;
    }

    public void setAreteVisitee(boolean areteVisitee) {
        this.areteVisitee = areteVisitee;
    }


    public int getNum_sommet1() {
        return this.num_sommet1;
    }

    public void setNum_sommet1(int num_sommet1) {
        this.num_sommet1 = num_sommet1;
    }

    public int getNum_sommet2() {
        return this.num_sommet2;
    }

    public void setNum_sommet2(int num_sommet2) {
        this.num_sommet2 = num_sommet2;
    }

    public int getTps() {
        return this.tps;
    }

    public void setTps(int tps) {
        this.tps = tps;
    }

    @Override
    public String toString() {
//        return "Pour aller de " + s1.getNom_sommet() + " à " + s2.getNom_sommet() + " il vous faudra " + this.getTps();
        return this.getNum_sommet1() + " " + this.getNum_sommet2() + " " + this.getTps();
    }

    @Override
    public int compareTo(Arete o) {
        return this.getTps()-o.getTps();
    }
}
