import java.util.*;
class chatbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chatbot: Hello! I am a chatbot. How can I help you? Type 'exit' to close this chat.");
        while (true) {
            System.out.print("You: ");
            String userinput = sc.nextLine();

            if (userinput.equalsIgnoreCase("exit")) {
                System.out.println("Chatbot: Nice to meet you! Closing this chat.");
                break;
            } else if (userinput.equalsIgnoreCase("hi") || userinput.equalsIgnoreCase("hello")) {
                System.out.println("Chatbot: Hello! Welcome to the chatbot. How are you?");
            } else if (userinput.equalsIgnoreCase("I am good , Thankyou ! , do you know about java?")) {
                System.out.println("Chatbot: Yes, Java is a programming language widely used in several organizations.");
            } else if (userinput.equalsIgnoreCase("who invented java and why?")) {
                System.out.println("Chatbot: Java was invented by James Gosling in 1995 at Sun Microsystems to develop electronic devices and enterprise applications.");
            } else {
                System.out.println("Chatbot: Sorry! I can't understand what you're trying to say.");
            }
        }
        sc.close();
    }
}
