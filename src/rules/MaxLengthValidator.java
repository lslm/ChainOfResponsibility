package rules;

import models.Message;

public class MaxLengthValidator implements MessageValidator{
    @Override
    public void validate(Message message) {
        if (message.getContent().trim().length() > 20) {
            message.addViolation("Mensagem com mais de 20 caracteres");
        }
    }
}
