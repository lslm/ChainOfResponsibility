package models;

import java.util.ArrayList;

public class Message {
    private String content;
    private ArrayList<String> violations;

    public Message(String content) {
        this.content = content;
        violations = new ArrayList<String>();
    }

    public void addViolation(String violation) {
        this.violations.add(violation);
    }

    public String getContent() {
        return content;
    }

    public ArrayList<String> getViolations() {
        return violations;
    }

    public boolean hasAnyViolation() {
        return violations.size() > 0;
    }
}
