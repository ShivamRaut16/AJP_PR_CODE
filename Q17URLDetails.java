import java.net.*;

public class Q17URLDetails {
    public static void main(String[] args) {
        try {
            // Create a URI object from the string
            URI uri = new URI("http://www.msbte.org.in");

            // Convert URI to URL
            URL url = uri.toURL();

            // Retrieve and display the protocol, host, port, and file
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort()); // Returns -1 if no port is specified (default is 80 for HTTP)
            System.out.println("File: " + url.getFile());

        } catch (URISyntaxException | MalformedURLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
