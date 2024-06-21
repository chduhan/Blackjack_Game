package main.java.com.example.blackjack;

import com.example.blackjack.BlackjackGame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the BlackjackGame class.
 */
public class BlackjackGameTest {

    @Test
    public void testInitializeGameGoodScenario() {
        BlackjackGame game = new BlackjackGame();
        assertDoesNotThrow(() -> {
            game.initializeGame();
        });
    }

    @Test
    public void testShuffleGoodScenario() {
        BlackjackGame game = new BlackjackGame();
        assertDoesNotThrow(() -> {
            game.shuffle();
        });
    }

    // ... Repeat the pattern for other methods ...

    @Test
    public void testPlayAgainBoundaryScenario() {
        BlackjackGame game = new BlackjackGame();
        boolean result = game.playAgain();
        assertTrue(result);
    }

    @Test
    public void testForceEndBadScenario() {
        BlackjackGame game = new BlackjackGame();
        boolean result = game.forceEnd();
        assertFalse(result);
    }

    @Test
    public void testEndGameGoodScenario() {
        BlackjackGame game = new BlackjackGame();
        assertDoesNotThrow(() -> {
            game.endGame();
        });
    }
}
