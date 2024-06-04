import javax.xml.crypto.Data;
import java.sql.Date;
import java.util.*;

public class Action {

    int idAction;
    int actionDate;
    String actionCoordinator;
    String rescueBase;

    List actionList = new ArrayList();

    Scanner scanner = new Scanner(System.in);


    public void addAction(scanner){
        System.out.println("Podaj datę akcji: ");
        actionDate = scanner.nextInt();
        System.out.println("Podaj koordynatora: ");
        actionCoordinator = String.valueOf(scanner.nextInt());
        System.out.println("Podaj bazę, która brała udział w akcji: ");
        rescueBase = scanner.nextInt();



    }
}
