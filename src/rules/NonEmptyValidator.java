package rules;

import models.Message;

public class NonEmptyValidator implements MessageValidator {
    @Override
    public void validate(Message message) {
        if (message.getContent().trim().length() == 0) {
            message.addViolation("Mensagem vazia");
        }
    }
}
