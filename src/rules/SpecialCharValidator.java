package rules;

import models.Message;

public class SpecialCharValidator implements MessageValidator {
    @Override
    public void validate(Message message) {
        if (message.getContent().contains("#")) {
            message.addViolation("Mensagem contém character inválido");
        }
    }
}
