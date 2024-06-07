import java.net.URI;
import java.net.URISyntaxException;

public class URIStructure {
    public static void main(String[] args) throws URISyntaxException {
        URI opaqueURI = new URI("mailto:work@gmail.com");
        // URI myUri = URI.create("https://facebook.com/");
        URI hierarchicalURI = new URI("https://facebook.com");
        URI relativeURI = URI.create("/path/to/resources.html");

        URI resolvedURI = hierarchicalURI.resolve(relativeURI);
        URI relativizedURL = resolvedURI.relativize(relativeURI);

        System.out.println(resolvedURI.toString());
        System.out.println(relativizedURL.toString());

        System.out.println(opaqueURI.isOpaque());
    }
}
