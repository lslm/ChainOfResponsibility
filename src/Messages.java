import models.Message;
import rules.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Messages {
    static ArrayList<MessageValidator> validators = new ArrayList<>();

    public static void main(String[] args) {
        prepareValidators();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a mensagem de texto: ");
        String input = scanner.nextLine();

        Message newMessage = new Message(input);

        for (MessageValidator validator : validators) {
            validator.validate(newMessage);
        }

        if (newMessage.hasAnyViolation()) {
            for (String violation : newMessage.getViolations()) {
                System.out.println(violation);
            }
        } else {
            System.out.println("Mensagem enviada: " + newMessage.getContent());
        }
    }

    static void prepareValidators() {
        validators.add(new MaxLengthValidator());
        validators.add(new NonEmptyValidator());
        validators.add(new SpecialCharValidator());
        validators.add(new ForbiddenWordsValidator());
    }
}
