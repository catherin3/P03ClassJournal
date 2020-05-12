package sg.edu.rp.c346.p03_classjournal;

import java.io.Serializable;

public class Grade implements Serializable {
    private int tvWeek;
    private String tvDG;
    private String tvGrade;

    public Grade(int tvWeek, String tvDG, String tvGrade) {
        this.tvWeek = tvWeek;
        this.tvDG = tvDG;
        this.tvGrade = tvGrade;
    }

    public int getTvWeek() {
        return tvWeek;
    }

    public String getTvDG() {
        return tvDG;
    }

    public String getTvGrade() {
        return tvGrade;
    }
}
