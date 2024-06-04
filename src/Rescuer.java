import java.util.ArrayList;
import java.util.List;

public class Rescuer {

    int idRescuer;
    String name;
    String surname;
    String degree;
    String medicalProfession;
    List rescuerList = new ArrayList<>();


    public Rescuer(int idRescuer, String name, String surname, String degree, String medicalProfession) {
        this.idRescuer = idRescuer;
        this.name = name;
        this.surname = surname;
        this.degree = degree;
        this.medicalProfession = medicalProfession;

    }

    public void addRescuer(int idRescuer, String name, String surname, String degree, String medicalProfession) {
        Rescuer rescuer = new Rescuer(rescuerList.size() + 1, name, surname, degree, medicalProfession);
        rescuerList.add(rescuer);
    }

    public String getRescuer (String surname){
        for (int i=0; i<rescuerList.size(); i++){
            if (surname == rescuerList.get(Integer.parseInt(surname))){
            }
        }
        return surname;
    }


}



