import java.util.ArrayList;

public class MedicineWarehouse {

    PersonData personData;
    Drug drug;


    ArrayList<Drug> drugList = new ArrayList<>();

    public MedicineWarehouse() {
        addDrugToMagazine();

    }

    public void addDrugToMagazine() {
        drugList.add(new Drug("Morphine", "20201010", "20240501", true, 60));
        drugList.add(new Drug("Fentanyl", "23456789", "20260101", true, 55));
        drugList.add(new Drug("Diazepam", "4567IL", "20303006", true, 3));
        drugList.add(new Drug("Paracetamol", "FU9090", "20210601", false, 12));
        drugList.add(new Drug("Ibuprofen", "44400291GF", "20241230", false, 160));
    }


    public Rescuer isQualifiedPerson(String name) {
        for (Rescuer temp : personData.rescuerList) {
            if (temp.name.equals(name)) {
                if (temp.medicalProfession == true) {
                    return temp;
                } else {
                    System.out.println("ratownik nie jest uprawiony do obrotu lekami");
                }
            }
        }
        return null;
    }

    public void drugConsume (String useDrugName, int howMany, String name){
        Rescuer rescuer = isQualifiedPerson(name);
        for (Drug temp : drugList){
            if (useDrugName == drug.drugName){
                if (getQuantity(drug.howMany) < howMany){
                    drug.howMany -= howMany;
                }
                else System.out.println("ilość leku w magazynie jest zbyt mała");
            }
        }

    }

    private int getQuantity (){
        return drug.howMany;
    }

}