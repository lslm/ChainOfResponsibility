package rules;

import models.Message;

public class ForbiddenWordsValidator implements MessageValidator {
    @Override
    public void validate(Message message) {
        if (message.getContent().contains("idiota")) {
            message.addViolation("Mensagem contém palavra proibida idiota");
        }
    }
}
