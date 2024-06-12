import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Objects;

public class MedicineWarehouse {

    PersonData personData;
    Log loginInfo;
    ArrayList<Drug> drugList = new ArrayList<>();

    public MedicineWarehouse() {
        addDrugToMagazine();
        personData = new PersonData();
    }

    public void addDrugToMagazine() {
        drugList.add(new Drug("Morphine", "20201010", "2024-05-01", true, 60));
        drugList.add(new Drug("Fentanyl", "23456789", "2026-01-01", true, 55));
        drugList.add(new Drug("Diazepam", "4567IL", "2030-03-06", true, 3));
        drugList.add(new Drug("Paracetamol", "FU9090", "2021-06-01", false, 12));
        drugList.add(new Drug("Ibuprofen", "44400291GF", "2024-06-30", false, 160));
    }

    public void drugConsume(int howMany, String name) {
        if (loginInfo.userLog.medicalProfession) {
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


    public void whatIsNarcotic() {
        for (Drug drug : drugList) {
            if (drug.isNarcotic()) {
                System.out.println(drug.drugName + "jest narkotykiem. Jego ilość w magazynie wynosi: " + drug.howMany);
            }
        }
    }

    public void end3Weeks() {
        String str = "1986-04-08";
        LocalDate expiredDate = LocalDate.now().plusWeeks(3);
        for (Drug drug : drugList) {
            if (expiredDate.isAfter(LocalDate.parse(drug.bestBefore, DateTimeFormatter.ofPattern("yyyy-MM-dd"))))
                System.out.println("Lek " + drug.drugName + " jest poza terminem");
        }
    }
}

