package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.sprite.EmptySprite;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SpriteTest {
    private EmptySprite emptySprite;

    @BeforeEach
    void setUp() {
        // Initialize the emptySprite object with an instance of EmptySprite.
        emptySprite = new EmptySprite();
    }

    @Test
    void testEmpty() {
        assertThat(emptySprite.getWidth()).isEqualTo(0);
    }
}
