package Lesson7Type.company;

import java.util.ArrayList;
import java.util.List;

public class Company {
    public List<Manager> getManagerList() {
        return managerList;
    }

    private final List<Manager> managerList = new ArrayList<>();

    public Company() {
        for (int i = 0; i < 25; i++) {
            managerList.add(new Manager());
            managerList.add(new B2CManager());
            managerList.add(new SalesManager());
            managerList.add(new B2BManager());
        }
    }
}