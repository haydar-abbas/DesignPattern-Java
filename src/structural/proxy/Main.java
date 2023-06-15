package structural.proxy;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> domains = Arrays.asList("twitter", "youtube", "facebook", "linkedin", "tiktok");
        ISP isp = new Proxy(new Zain());

        for (String domain : domains) {
            System.out.println(isp.serveSite(domain));
        }
    }
}
