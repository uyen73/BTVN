
package bai1;

import java.time.LocalDate;

public class Worker extends Officer {
    private int level;

    public Worker(String id, String ten, int namSinh, String gioiTinh, String diaChi, int level) {
        super(id, ten, namSinh, gioiTinh, diaChi);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id='" + id + '\'' +
                ", ten='" + ten + '\'' +
                ", namSinh=" + namSinh +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", level=" + level +
                '}';
    }
}