import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Drug {

    String drugName;
    int serialNumber;
    Date bestBefore;
    String narcotic;
    int howMany;
    List morphine = new ArrayList<>();
    List fentanyl = new ArrayList<>();
    List diazepam = new ArrayList<>();
    List paracetamol = new ArrayList<>();
    List ibuprofen = new ArrayList<>();


    public Drug(String drugName, int serialNumber, Date bestBefore, String narcotic, int howMany) {
        this.drugName = drugName;
        this.serialNumber = serialNumber;
        this.bestBefore = bestBefore;
        this.narcotic = narcotic;
        this.howMany=howMany;
    }

    public void addDrugToMagazine(String drugName, int serialNumber, Date bestBefore, int howMany, String narcotic) {
        Drug drug = new Drug(drugName, serialNumber, bestBefore, narcotic, howMany);
        for (int i = 0; i < howMany; i++) {
            switch (drugName) {
                case "morphine":
                    morphine.add(drug);
                    break;
                case "fentanyl":
                    fentanyl.add(drug);
                    break;
                case "diazepam":
                    diazepam.add(drug);
                    break;
                case "paracetamol":
                    paracetamol.add(drug);
                    break;
                case "ibuprofen":
                    ibuprofen.add(drug);
                    break;
            }
        }
    }
}
