import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestCalculator {
    public static void main(String[] args) {
        String[] inputFiles = {"input1.txt", "input2.txt", "input3.txt"};
        String[] expectedOutputFiles = {"expected_output1.txt", "expected_output2.txt", "expected_output3.txt"};

        for (int i = 0; i < inputFiles.length; i++) {
            System.out.println("Running test case " + (i + 1) + ":");

            try {
                String input = readInputFromFile(inputFiles[i]);
                String expectedOutput = readExpectedOutputFromFile(expectedOutputFiles[i]);

                ProcessBuilder processBuilder = new ProcessBuilder("java", "-cp", ".", "Calculator");
                processBuilder.redirectErrorStream(true);
                
                Process process = processBuilder.start();
                
                try (PrintWriter writer = new PrintWriter(process.getOutputStream())) {
                    writer.print(input);
                    writer.flush();
                }

                String output = readOutput(process);

                if (output.trim().equals(expectedOutput.trim())) {
                    System.out.println("Test passed!");
                } else {
                    System.out.println("Test failed!");
                    System.out.println("Expected: " + expectedOutput);
                    System.out.println("Actual: " + output);
                }

            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static String readInputFromFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

    private static String readExpectedOutputFromFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

    private static String readOutput(Process process) throws IOException {
        StringBuilder output = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }
        }
        return output.toString();
    }
}

