import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Log {

    public MedicineWarehouse medicineWarehouse = new MedicineWarehouse();
    public PersonData personData = new PersonData();
    ActionData actionData = new ActionData();
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
        if (userLog != null) {
            System.out.println("jesteś zalogowany jako: " + userLog.name + " " + userLog.surname);
        } else {
            System.out.println("nie odnalzałem ratownika o podanych danych");
        }
    }


    public void WhatToDo() {
        if (userLog != null) {
            System.out.println("Jaką operacje chcesz wykonać? ");
            System.out.println("1 ---> sciągnąć lek z magazynu po akcji");
            System.out.println("2 ---> sprawdzić daty ważności leków");
            System.out.println("3---> dodać dane akcji do archiwum");
            int myChoice = scanner.nextInt();
            switch (myChoice) {
                case 1:
                    if (userLog.medicalProfession) {
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Podaj nazwę leku: ");
                        String drugName = new Scanner(System.in).nextLine();
                        new Scanner(System.in).nextInt();
                        System.out.println("Podaj ilość leku do zużycia: ");
                        int quantity = scanner.nextInt();
                        medicineWarehouse.drugConsume(quantity, drugName);
                    } else {
                        System.out.println("nie masz uprawnień do wykonania takiej operacji!");
                        break;
                    }
                case 2:
                    if (userLog != null){
                        medicineWarehouse.end3Weeks();
                    } else {
                        System.out.println("nie jesteś ratownikiem. Nie możesz sprawdzić magazynu leków");
                    }
                case 3:
                    if (userLog!=null){
                        actionData.//addAction
                    }
            }
        }
    }
}
