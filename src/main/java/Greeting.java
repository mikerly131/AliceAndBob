public class Greeting {
    public Greeting() {
    }

    public String getGreeting(String name) {
        String greeting;
        if (name.equals("Alice") || name.equals("Bob")) {
            greeting = ("Greeting's " + name);
        } else {
            greeting = ("You are neither Alice nor Bob");
        }

        return greeting;
    }

}
