//Resolve URI is used to create a new URI by combining Base URI with Relative URI.

import java.net.*;

public class ResolveURIPractice {
    public static void main(String[] args) {
        URI baseUri = URI.create("https://facebook.com");
        URI relativeUri = URI.create("/login.php");

        URI resolvedUri = baseUri.resolve(relativeUri);
        System.out.println(resolvedUri);
    }
}
