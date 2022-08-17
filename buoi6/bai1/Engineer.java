
package bai1;


import java.time.LocalDate;

public class Engineer extends Officer {
    private String nghanhDT;

    public Engineer(String id, String ten, int namSinh, String gioiTinh, String diaChi, String nghanhDT) {
        super(id, ten, namSinh, gioiTinh, diaChi);
        this.nghanhDT = nghanhDT;
    }

    public String getNghanhDT() {
        return nghanhDT;
    }

    public void setNghanhDT(String nghanhDT) {
        this.nghanhDT = nghanhDT;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "id='" + id + '\'' +
                ", ten='" + ten + '\'' +
                ", namSinh=" + namSinh +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", nghanhDT='" + nghanhDT + '\'' +
                '}';
    }
}