package company.dao;

import company.model.Uzer;

import java.util.ArrayList;
import java.util.List;

public class UzerDao {
    private final List<Uzer> uzers = new ArrayList<>();

    public UzerDao() {
    }

    public List<Uzer> getUzers() {
        return uzers;
    }
}
