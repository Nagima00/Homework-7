
package iterator;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class RandomOrderIterator implements EpisodeIterator {
    private List<Episode> shuffledEpisodes;
    private int currentIndex = 0;

    public RandomOrderIterator(List<Episode> episodes) {
        shuffledEpisodes = new ArrayList<>(episodes);
        Collections.shuffle(shuffledEpisodes);
    }

    @Override
    public boolean hasNext() {
        return currentIndex < shuffledEpisodes.size();
    }

    @Override
    public Episode next() {
        return shuffledEpisodes.get(currentIndex++);
    }
}
