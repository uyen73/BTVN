
package bai1;

import java.time.LocalDate;

public class Staff extends Officer {
    private String task;

    public Staff(String id, String ten, int namSinh, String gioiTinh, String diaChi, String task) {
        super(id, ten, namSinh, gioiTinh, diaChi);
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id='" + id + '\'' +
                ", ten='" + ten + '\'' +
                ", namSinh=" + namSinh +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", task='" + task + '\'' +
                '}';
    }
}

