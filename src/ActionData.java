import java.util.ArrayList;
import java.util.Scanner;

public class ActionData {
    PersonData personData;
    ArrayList<Action> actionList = new ArrayList<>();

    public ActionData() {
        personData = new PersonData();

    }

    private void addAction(int idAction, String actionDate, String actionCoordinatorName, String actionCoordinatorSurname, String rescueBase) {
        Rescuer actionCoordinator = personData.FindRescuer(actionCoordinatorName, actionCoordinatorSurname);
        if (actionCoordinator != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj datę akcji: ");
            actionDate = scanner.nextLine();

            System.out.println("Podaj imie kierownika akcji: ");
            actionCoordinatorName = scanner.nextLine();

            System.out.println("Podaj nazwisko kierownika akcji: ");
            actionCoordinatorSurname = scanner.nextLine();

            System.out.println("Podaj bazę, która brała udział w akcji: ");
            rescueBase = scanner.nextLine();
            actionList.add(new Action(actionList.size()+1, actionDate, actionCoordinatorName, actionCoordinatorSurname, rescueBase));

        }
    }
}