import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TestCaseMapper {

    private static final String CSV_FILE = "src/main/resources/TestCaseMapping.csv";
    private static final String CSV_SPLIT_BY = ",";

    // Method to map test case IDs with script names from the CSV file
    public static Map<String, String> getTestCaseMapping() {
        Map<String, String> testCaseMap = new HashMap<>();
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE))) {
            while ((line = br.readLine()) != null) {
                // Split the line by the CSV delimiter (comma)
                String[] mapping = line.split(CSV_SPLIT_BY);

                // Add the Test Case ID and corresponding script file name to the map
                testCaseMap.put(mapping[0], mapping[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return testCaseMap;
    }

    public static void main(String[] args) {
        // Get the test case mapping
        Map<String, String> testCaseMapping = getTestCaseMapping();

        // Print the test case mappings
        testCaseMapping.forEach((testCaseID, scriptFileName) ->
                System.out.println("TestCaseID: " + testCaseID + " , ScriptFileName: " + scriptFileName));
    }
}
