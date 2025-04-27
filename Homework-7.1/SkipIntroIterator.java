
package iterator;

import java.util.List;

public class SkipIntroIterator implements EpisodeIterator {
    private List<Episode> episodes;
    private int currentIndex = 0;

    public SkipIntroIterator(List<Episode> episodes) {
        this.episodes = episodes;
        skipShortEpisodes();
    }

    private void skipShortEpisodes() {
        while (currentIndex < episodes.size() && episodes.get(currentIndex).getDurationMinutes() <= 2) {
            currentIndex++;
        }
    }

    @Override
    public boolean hasNext() {
        return currentIndex < episodes.size();
    }

    @Override
    public Episode next() {
        Episode nextEpisode = episodes.get(currentIndex++);
        skipShortEpisodes();
        return nextEpisode;
    }
}
