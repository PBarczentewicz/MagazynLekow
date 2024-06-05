import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class MedicineWarehouse {

    PersonData personData;

    ArrayList<Drug> drugList = new ArrayList<>();

    public MedicineWarehouse() {
        addDrugToMagazine();
        personData = new PersonData();
    }

    public void addDrugToMagazine() {
        drugList.add(new Drug("Morphine", "20201010", "20240501", true, 60));
        drugList.add(new Drug("Fentanyl", "23456789", "20260101", true, 55));
        drugList.add(new Drug("Diazepam", "4567IL", "20303006", true, 3));
        drugList.add(new Drug("Paracetamol", "FU9090", "20210601", false, 12));
        drugList.add(new Drug("Ibuprofen", "44400291GF", "20240630", false, 160));
    }

    public void drugConsume(Rescuer useDrugRescuer, int howMany, String name) {
        if (useDrugRescuer.medicalProfession) {
            for (Drug temp : drugList) {
                if (Objects.equals(name, temp.drugName)) {
                    if (temp.getQuantity() >= howMany) {
                        temp.howMany -= howMany;
                        System.out.println("Usunąłem " + howMany + " Nowa ilość to: " + temp.howMany);
                    } else System.out.println("ilość leku w magazynie jest zbyt mała");
                }
            }
        } else System.out.println("Nie masz uprawnień");
    }

    public Drug getDrug(String drugName) {
        for (Drug drug : drugList) {
            if (drug.drugName.equals(drugName)) ;
            return drug;
        }
        return null;
    }

    public void whatIsNarcotic (){
        for (Drug drug : drugList){
            if (drug.isNarcotic()){
                System.out.println(drug.drugName + "jest narkotykiem. Jego ilość w magazynie wynosi: " + drug.howMany);
            }
        }
    }

    public void end3Weeks(){
        LocalDate today = LocalDate.now();
        LocalDate tempDate = today.plusWeeks(3);
        for (Drug drug : drugList){
            if (tempDate.isAfter(drug.bestBefore))
                System.out.println("Lek " + drug.drugName + " jest poza terminem");
        }
    }


}

