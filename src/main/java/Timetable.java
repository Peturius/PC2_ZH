import java.util.ArrayList;

public class Timetable {

    ArrayList<Minta> adatok = new ArrayList<>();

    public void newCourse(String name)  {
        Minta minta = new Minta();

        boolean vanE = false;
        for (Minta value : adatok) {
            if (value.courseName.equals(name)) {
                vanE = true;
            }
        }
        if (!vanE) {
            minta.courseName = name;
            minta.timestamp = " -";adatok.add(minta);
        }
    }

    public void removeCourse(String name) {

        for(int i = 0; i < adatok.size(); i++) {
            if(adatok.get(i).courseName.equals(name)) {
                adatok.remove(i);
            }
        }
    }

    public String getCourses(){
        String adat = "";
        for (int i = 0; i < adatok.size(); i++) {
            adat = adat + adatok.get(i).courseName + adatok.get(i).timestamp;
            if (i != adatok.size()-1) {
                adat = adat + "\r\n";
            }
        }

        return adat;
    }
}

class Minta {
    String courseName;
    String timestamp;
}

class Scheduler extends Timetable {
    public void setTimestamp (String name, String time){

        boolean vanE = false;
        for (int i = 0; i < adatok.size(); i++) {
            if (adatok.get(i).courseName.equals(name)) {
                vanE = true;
            }
        }
        if (vanE == true) {
            for (int i = 0; i < adatok.size(); i++) {
                if (adatok.get(i).courseName.equals(name)) {
                    adatok.get(i).timestamp = " " +time;
                }
            }
        }
    }
}
