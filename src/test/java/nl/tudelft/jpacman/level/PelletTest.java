package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.sprite.Sprite;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class PelletTest {

    private Pellet pellet;
    private Sprite sprite;

    @BeforeEach
    void setUp() {
        // Initialize a mock Sprite for testing.
        sprite = mock(Sprite.class);
        // Create a Pellet instance with a point value of 10 and the mock Sprite.
        pellet = new Pellet(10, sprite);
    }

    @Test
    void testGetValue() {
        int value = pellet.getValue();
        assertThat(value).isEqualTo(10); // Check if the point value is correct.
    }

    @Test
    void testGetSprite() {
        Sprite pelletSprite = pellet.getSprite();
        assertThat(pelletSprite).isEqualTo(sprite); // Check if the sprite is correctly returned.
    }
}
