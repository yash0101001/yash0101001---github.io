import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Message {
    String role;
    String text;

    public Message(String role, String text) {
        this.role = role;
        this.text = text;
    }

    @Override
    public String toString() {
        return role + ": " + text;
    }
}

public class ChatBot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Message> messages = new ArrayList<>();

        System.out.println("Ask Me Anything (type 'exit' to quit)");

        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) break;

            // Add user message
            messages.add(new Message("User", input));

            // Get bot response (this is a stub – you'd replace it with real logic or API)
            String botReply = getBotReply(input);

            // Add bot message
            messages.add(new Message("Bot", botReply));

            // Display conversation so far
            for (Message msg : messages) {
                System.out.println(msg);
            }

            System.out.println(); // For spacing
        }

        scanner.close();
        System.out.println("Chat ended.");
    }

    public static String getBotReply(String input) {
        // Simple echo response; replace with real AI or logic
        return "You said: " + input;
    }
}

