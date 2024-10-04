import org.testng.TestNG;

import java.util.Map;

public class TestRunner {
    public static void main(String[] args) {

        Map<String, String> testCaseMapping = TestCaseMapper.getTestCaseMapping();


        TestNG testng = new TestNG();

        // Loop through the mapping and execute the corresponding test case based on the mapping
        for (Map.Entry<String, String> entry : testCaseMapping.entrySet()) {
            String testCaseID = entry.getKey();
            String scriptFileName = entry.getValue();

            System.out.println("Running TestCaseID: " + testCaseID + " using script: " + scriptFileName);

            // Dynamically add the corresponding class for execution
            if (scriptFileName.equals("ExampleTest.java")) {
                testng.setTestClasses(new Class[] { ExampleTest.class });
            }
            //else if (scriptFileName.equals("LoginTest.java")) {
             //   testng.setTestClasses(new Class[] { LoginTest.class });
            }

            // Run the selected test
            testng.run();
        }
    }

