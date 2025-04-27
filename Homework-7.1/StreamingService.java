
package iterator;

import java.util.ArrayList;
import java.util.List;

public class StreamingService {
    private List<Episode> episodes = new ArrayList<>();

    public void addEpisode(Episode episode) {
        episodes.add(episode);
    }

    public EpisodeIterator createNormalOrderIterator() {
        return new NormalOrderIterator(episodes);
    }

    public EpisodeIterator createReverseOrderIterator() {
        return new ReverseOrderIterator(episodes);
    }

    public EpisodeIterator createRandomOrderIterator() {
        return new RandomOrderIterator(episodes);
    }

    public EpisodeIterator createSkipIntroIterator() {
        return new SkipIntroIterator(episodes);
    }

    public void playAllEpisodes(EpisodeIterator iterator) {
        iterator.forEachRemaining(episode -> System.out.println("Playing: " + episode.getTitle()));
    }
}
