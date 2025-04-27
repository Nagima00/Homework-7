
package iterator;

public class Episode {
    private String title;
    private int durationMinutes;

    public Episode(String title, int durationMinutes) {
        this.title = title;
        this.durationMinutes = durationMinutes;
    }

    public String getTitle() {
        return title;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }
}
