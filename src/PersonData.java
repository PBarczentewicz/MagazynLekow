import java.lang.reflect.Array;
import java.util.ArrayList;

public class PersonData {
    ArrayList<Rescuer> rescuerList = new ArrayList<>();

    public PersonData() {
        addRescuer();
    }

    public void addRescuer() {
        rescuerList.add(new Rescuer(rescuerList.size() + 1, "Przemysław", "Barczentewicz", "Starszy Ratownik", true, true));
        rescuerList.add(new Rescuer(rescuerList.size() + 1, "Bartłomiej", "Wojewódka", "Ratownik", true, true));
        rescuerList.add(new Rescuer(rescuerList.size() + 1, "Piotr", "Krupa", "Ratownik", false, true));
        rescuerList.add(new Rescuer(rescuerList.size() + 1, "Dominik", "Jagieła", "Starszy Ratownik", false, true));
    }

    public Rescuer FindRescuer(String name) {
        for (Rescuer temp : rescuerList) {
            if (temp.name.equals(name)) {
                System.out.println("Hej jestem " + temp.name);
                return  temp;
            }
        }
        return null;
    }
}
