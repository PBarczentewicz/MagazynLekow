import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MedicineWarehouse medicineWarehouse = new MedicineWarehouse();

        Rescuer rescuerLogin;

        Scanner scanner = new Scanner(System.in);
        rescuerLogin = medicineWarehouse.personData.FindRescuer(scanner.next());

        medicineWarehouse.drugConsume(rescuerLogin, 2, "Paracetamol");



    }
}