package lauditor.test.pages;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lauditor.baseClass.BaseClass;

public class RelationSendInviteTest extends BaseClass {

    @Test(dataProvider = "getData")
    public void relationshipInvited(HashMap<String, String> input) throws InterruptedException {

        String[] addGroups = { input.get("addGroup1"), input.get("addGroup2"), input.get("addGroup3"),
                input.get("addGroup4") };

//        Relationsendinvite.RelationIndFound();
//        Relationsendinvite.RelationsendInvite(input.get("email"), input.get("fname"), input.get("lname"),
//                input.get("cemail"),
//                input.get("country"), addGroups);
//        // Relationsendinvite.indFound();
//        Relationsendinvite.setSendRequest();
//        Relationsendinvite.alertBtn();
//        Relationsendinvite.successViewChanges();

    }

    @DataProvider
    public Object[][] getData() throws IOException {

        List<HashMap<String, String>> data = getJsonDataToMap(
                "F:\\JavaSelenium\\SeleniumFrameWrok\\javasel\\src\\test\\java\\Data\\Provider\\RelationshipInvite.json");

        return new Object[][] { { data.get(0) }, { data.get(1) } };
    }

}
