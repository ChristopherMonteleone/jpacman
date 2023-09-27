package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.board.Unit;
import nl.tudelft.jpacman.npc.Ghost;
import nl.tudelft.jpacman.sprite.Sprite;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class GhostTest {

    private Ghost ghost;
    private Map<Direction, Sprite> spriteMap;

    @BeforeEach
    void setUp() {
        // Initialize a mock Sprite map with a single sprite.
        spriteMap = Collections.singletonMap(Direction.NORTH, mock(Sprite.class));
        // Create a Ghost instance with a mock Sprite map, a base move interval of 100, and interval variation of 20.
        ghost = new TestGhost(spriteMap, 100, 20);
    }

    @Test
    void testGetInterval() {
        long interval = ghost.getInterval();
        assertThat(interval).isBetween(100L, 120L); // Check if the interval falls within the specified range.
    }

    // A simple concrete subclass of Ghost for testing purposes.
    private static class TestGhost extends Ghost {
        public TestGhost(Map<Direction, Sprite> spriteMap, int moveInterval, int intervalVariation) {
            super(spriteMap, moveInterval, intervalVariation);
        }

        @Override
        public Optional<Direction> nextAiMove() {
            return Optional.empty();
        }

        @Override
        protected Direction randomMove() {
            return null;
        }
    }
}
