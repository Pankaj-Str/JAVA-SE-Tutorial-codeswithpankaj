package InterviewQuestion;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class StackIndentationChecker{
    public static void main(String[] args) {
        for (String filename : args) {
            if (checkIndentation(filename)) {
                System.out.println(filename + " - Proper indentation");
            } else {
                System.out.println(filename + " - Improper indentation");
            }
        }
    }

    public static boolean checkIndentation(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            Stack<Integer> indentationStack = new Stack<>();
            String line;
            int lineNumber = 0;

            while ((line = br.readLine()) != null) {
                lineNumber++;

                // Ignore completely blank lines
                if (line.trim().isEmpty()) {
                    continue;
                }

                // Find the column number of the first non-blank character
                int columnNumber = 0;
                while (columnNumber < line.length() && Character.isWhitespace(line.charAt(columnNumber))) {
                    columnNumber++;
                }

                if (indentationStack.isEmpty()) {
                    indentationStack.push(columnNumber);
                } else if (columnNumber > indentationStack.peek()) {
                    indentationStack.push(columnNumber);
                } else if (columnNumber < indentationStack.peek()) {
                    while (!indentationStack.isEmpty() && columnNumber < indentationStack.peek()) {
                        indentationStack.pop();
                    }
                    if (indentationStack.isEmpty() || columnNumber != indentationStack.peek()) {
                        // Indentation error found
                        return false;
                    }
                }
            }

            return true; // Indentation is correct
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
