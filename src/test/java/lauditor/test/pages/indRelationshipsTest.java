package lauditor.test.pages;

import lauditor.baseClass.BaseClass;
import lauditor.pom.pages.indRelationships;

import org.testng.annotations.Test;

public class indRelationshipsTest extends BaseClass {
    @Test
    public void testRela() throws InterruptedException {
        indRelationships relation = new indRelationships(driver);
        relation.indFound("docker.ananth@gmail.com");
    }

}
