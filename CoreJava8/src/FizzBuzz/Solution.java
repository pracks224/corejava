package FizzBuzz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution   {
    private Map<Rule, String> ruleContainers = new HashMap<>();
    private ArrayList<Rule> rules  = new ArrayList<Rule>();
    public Solution() {
        addRule(i -> i % 15 == 0, "FizzBuzz");
        addRule(i -> i % 3 == 0, "Fizz");
        addRule(i -> i % 5 == 0, "Buzz");
    }
    public void addRule(Rule rule, String res) {
        rules.add(rule);
        ruleContainers.put(rule, res);
    }
    public String getValue(int i) {
        for (Rule rule : rules) {
            if (rule.apply(i)) {
                return ruleContainers.get(rule);
            }
        }
        return String.valueOf(i);
    }
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<String>();
        for(int i = 1; i <= n; i++){
            res.add(getValue(i));
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        List<String> ls = sol.fizzBuzz(15);
        System.out.println(ls);
    }
}
