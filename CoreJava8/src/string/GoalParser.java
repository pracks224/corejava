package string;

import java.util.ArrayList;
import java.util.List;

public class GoalParser {
    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(interpret(command));
    }

    public static String interpret(String command) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G')
                builder.append("G");
            else if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')')
                    builder.append("o");
                else
                    builder.append("al");
            }
        }
        return builder.toString();
    }

}

