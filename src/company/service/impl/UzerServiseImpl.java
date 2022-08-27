package company.service.impl;

import company.MyExsepsion;
import company.dao.UzerDao;
import company.model.Uzer;
import company.service.UzerServise;

import java.util.ArrayList;
import java.util.List;

public class UzerServiseImpl implements UzerServise {
    private final UzerDao uzerDao = new UzerDao();


    @Override
    public void uzerplas(Uzer uzer) {
        List<Uzer> uzers = uzerDao.getUzers();
        uzers.add(uzer);
    }

    @Override
    public Uzer remuzeid(int id) {
        Uzer uzer = new Uzer();
        for (int i = 0; i < uzerDao.getUzers().size(); i++) {
            if (uzerDao.getUzers().get(i).getId() == id) {
                uzer = uzerDao.getUzers().remove(i);
            }
        }
        return uzer;
    }


    @Override
    public void idbaary() {
        for (Uzer u : uzerDao.getUzers()) {
            System.out.println(u);
        }
    }

    @Override
    public Uzer byId(int id) throws MyExsepsion {
        List<Integer> list = new ArrayList<>();
        Uzer uzer = new Uzer();
        for (int i = 0; i < uzerDao.getUzers().size(); i++) {
            list.add(uzerDao.getUzers().get(i).getId());
            if (uzerDao.getUzers().get(i).getId() == id) {
                uzer = uzerDao.getUzers().get(i);
            }
        }
        if (list.contains(id)) ;
        else {
            throw new MyExsepsion("такого id не сушущтвует");

        }
        return uzer;

    }
}
