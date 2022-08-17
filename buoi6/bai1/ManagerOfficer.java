
package bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerOfficer {
    private List<Officer> officers;

    public ManagerOfficer() {
        this.officers = new ArrayList<>();
    }

    public boolean deleteOfficer(String id) {
        Officer off = this.officers.stream()
                .filter(officer -> officer.getId().equals(id))
                .findFirst().orElse(null);
        if (off == null) {
            return false;
        }
        this.officers.remove(off);
        return true;
    }

    public void addOfficer(Officer officer) {
        this.officers.add(officer);
    }

    public List<Officer> searchOfficerByID(String id) {
        return this.officers.stream().filter(o -> o.getId().contains(id)).collect(Collectors.toList());
    }

    public void showListInforOfficer() {
        this.officers.forEach(o -> System.out.println(o.toString()));
    }

    public boolean checkiD(String id) {
        Officer off = this.officers.stream()
                .filter(officer -> officer.getId().equals(id))
                .findFirst().orElse(null);
        if (off == null) {
            return false;
        }
        return true;
    }

    public boolean checkTimKiem(String id) {
        Officer off = this.officers.stream()
                .filter(officer -> officer.getId().equals(id))
                .findFirst().orElse(null);
        if (off == null) {
            return false;
        }
        return true;
    }
}