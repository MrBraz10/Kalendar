package excercises.Kalendar.Model;

import excercises.Kalendar.View;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Model {

    public int currectDay() {

        GregorianCalendar newCal = new GregorianCalendar();
        int day = newCal.get(Calendar.DAY_OF_WEEK);
        return day;

    }

    public void cHoose(int number) {

        View v = new View();



        if (number == 1) {
            switch (currectDay()) {
                case 1:
                    v.mOn();
                    break;
                case 2:
                    v.tUe();
                    break;
                case 3:
                    v.wEd();
                    break;
                case 4:
                    v.fIr();
                    break;
                case 5:
                    v.fRy();
                    break;
                case 6:
                    v.sAt();
                    break;
                case 7:
                    v.sUn();
                    break;
            }
        } else if (number == 2) {
            v.rAspisanie();
        } else {
            System.out.println("дурак что ли ?");
        }

    }
}
