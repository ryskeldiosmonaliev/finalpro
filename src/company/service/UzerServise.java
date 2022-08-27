package company.service;

import company.model.Uzer;

public interface UzerServise {
    void uzerplas(Uzer uzer);

    Uzer remuzeid(int id);

    void idbaary();

    Uzer byId(int id);
}
