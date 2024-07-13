// Relativize method returns the relative URI when combined with base URI gives the target URI.

import java.net.*;

public class RelativizeURIPractice {
    public static void main(String[] args) {
        URI baseUri = URI.create("https://facebook.com/profile");
        URI targetUri = URI.create("https://facebook.com/profile/sonia/index.php");

        URI relativizedUri = baseUri.relativize(targetUri);
        System.out.println(relativizedUri);
    }
}
