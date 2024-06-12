import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Log {

    public MedicineWarehouse medicineWarehouse;
    public PersonData personData;
    public Rescuer userLog;
    Scanner scanner = new Scanner(System.in);

    public Log() {
        UserLogin();
        WhatToDo();
    }

    public void UserLogin() {
        System.out.println("Podaj swoje imie: ");
        String name = scanner.nextLine();
        System.out.println("Podaj swoje nazwisko: ");
        String surname = scanner.nextLine();
        userLog = personData.FindRescuer(name, surname);
        System.out.println("jesteś zalogowany jako: " + userLog.name + " " + userLog.surname);
    }

    public void WhatToDo() {
        if (userLog != null) {
            System.out.println("Jaką operacje chcesz wykonać? ");
            System.out.println("1 ---> sciągnąć lek z magazynu po akcji");
            System.out.println("2 ---> sprawdzić daty ważności leków");
            int myChoice = scanner.nextInt();
            switch (myChoice) {
                case 1:
                    if (userLog.medicalProfession) {
                        System.out.println("Podaj nazwę leku: ");
                        String drugName = scanner.nextLine();
                        System.out.println("Podaj ilość leku do zużycia: ");
                        int quantity = scanner.nextInt();
                        medicineWarehouse.drugConsume(quantity, drugName);
                    } else {
                        System.out.println("nie masz uprawnień do wykonania takiej operacji!");
                    }
                case 2:
                    if (userLog != null) {
                        medicineWarehouse.end3Weeks();
                    } else {
                        System.out.println("nie jesteś ratownikiem. Nie możesz sprawdzić magazynu leków");
                    }
            }
        }
    }
}
