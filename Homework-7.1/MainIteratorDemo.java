
package iterator;

public class MainIteratorDemo {
    public static void main(String[] args) {
        StreamingService service = new StreamingService();
        service.addEpisode(new Episode("Intro", 1));
        service.addEpisode(new Episode("Episode 1", 45));
        service.addEpisode(new Episode("Episode 2", 50));
        service.addEpisode(new Episode("Episode 3", 48));

        System.out.println("--- Normal Order ---");
        service.playAllEpisodes(service.createNormalOrderIterator());

        System.out.println("--- Reverse Order ---");
        service.playAllEpisodes(service.createReverseOrderIterator());

        System.out.println("--- Random Order ---");
        service.playAllEpisodes(service.createRandomOrderIterator());

        System.out.println("--- Skip Intro ---");
        service.playAllEpisodes(service.createSkipIntroIterator());
    }
}
