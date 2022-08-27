package company;

import company.Gender.Gender;
import company.model.Uzer;
import company.service.impl.UzerServiseImpl;

public class Main {
    public static void main(String[] args) {
        Uzer uzer1 = new Uzer(1, "Polly", 25, Gender.WOMEN);
        Uzer uzer2 = new Uzer(2, "Tom", 29, Gender.MAN);
        Uzer uzer3 = new Uzer(3, "Josh", 31, Gender.MAN);

        UzerServiseImpl uzerServise = new UzerServiseImpl();
        uzerServise.uzerplas(uzer1);
        uzerServise.uzerplas(uzer2);
        uzerServise.uzerplas(uzer3);
        System.out.println(uzerServise.byId(1));
        uzerServise.remuzeid(1);
        uzerServise.idbaary();


    }
}