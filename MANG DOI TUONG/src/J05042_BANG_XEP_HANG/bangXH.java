package J05042_BANG_XEP_HANG;

public class bangXH {
    private String name;
    private int AC, submit;

    public bangXH() {
    }

    public bangXH(String name, int AC, int submit) {
        this.name = name;
        this.AC = AC;
        this.submit = submit;
    }

    public String getName() {
        return name;
    }

    public int getAC() {
        return AC;
    }

    public int getSubmit() {
        return submit;
    }

    public String toString() {
        return this.name + " " + this.AC + " " + this.submit;
    }
}
