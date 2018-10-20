package excercises.Kalendar;

import excercises.Kalendar.Model.Model;

public class Main {

    public static void main(String[] args) {
        Controller c = new Controller();
        View v = new View();
        Model m = new Model();

        v.mEnu();
        m.cHoose(c.vVod());


    }
}
