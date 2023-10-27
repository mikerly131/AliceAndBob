import org.junit.Test;

import static org.junit.Assert.*;

// Testing against methods in greeting class
public class GreetingTest {

    //Test the getGreeting method when name is Alice
    @Test
    public void determineGreetingAlice() {
        Greeting greeting = new Greeting();
        String testGreet = greeting.getGreeting("Alice");
        String validGreet = ("Greeting's Alice");
        assertEquals(testGreet, validGreet);
    }

    @Test
    public void determineGreetingBob() {
        Greeting greeting = new Greeting();
        String testGreet = greeting.getGreeting("Bob");
        String validGreet = ("Greeting's Bob");
        assertEquals(testGreet, validGreet);
    }

    @Test
    public void determineGreetingOther() {
        Greeting greeting = new Greeting();
        String testGreet = greeting.getGreeting("John");
        String validGreet = ("You are neither Alice nor Bob");
        assertEquals(testGreet, validGreet);
    }

}

