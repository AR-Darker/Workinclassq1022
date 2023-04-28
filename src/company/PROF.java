package company;

public enum PROF {
    WORKER(2),
    DIRECTOR(3);

    private int koef;

    PROF(int koef) {
        this.koef = koef;
    }

    public int getKoef() {
        return koef;
    }

}
