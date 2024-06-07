// Absolute URL specifies the complete location of a resource. Relative URL specifies the location of a resource from a current resource.

//Scheme represent protocol

import java.net.MalformedURLException;
import java.net.URL;

public class URLStructure {
    public static void main(String[] args) throws MalformedURLException {
        URL myUrl = new URL("https://facebook.com:8080/profile?name='Prabesh'#about");

        System.out.println(myUrl.toString());
        System.out.println(myUrl.getProtocol());
        System.out.println(myUrl.getHost());
        System.out.println(myUrl.getPort());
        System.out.println(myUrl.getPath());
        System.out.println(myUrl.getQuery());
        System.out.println(myUrl.getAuthority());
        System.out.println(myUrl.getFile());
        System.out.println(myUrl.getRef());
    }
}
