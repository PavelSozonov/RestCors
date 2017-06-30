package hello.resourceRepresentation;

/**
 * Created by pavel on 30.06.17.
 */
public class Greeting {
    private final long id;
    private final String content;

    public Greeting() {
        id = -1;
        content = "";
    }

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
