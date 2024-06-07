import com.sun.source.tree.StringTemplateTree;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Drug {

    String drugName;
    String serialNumber;
    String bestBefore;
    Boolean narcotic;
    int howMany;


    public Drug(String drugName, String serialNumber, String bestBefore, Boolean narcotic, int howMany) {
        this.drugName = drugName;
        this.serialNumber = serialNumber;
        this.bestBefore = bestBefore;
        this.narcotic = narcotic;
        this.howMany = howMany;
    }

    public int getQuantity() {
        return howMany;
    }

    public boolean isNarcotic() {
        return this.narcotic;
    }
}
