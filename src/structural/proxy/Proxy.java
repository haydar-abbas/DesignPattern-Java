package structural.proxy;

import java.util.Arrays;
import java.util.List;

public class Proxy implements ISP{

    private final ISP isp;
    List<String> blockList = Arrays.asList("facebook", "tiktok");

    public Proxy(ISP isp) {
        this.isp = isp;
    }

    @Override
    public String serveSite(String domain) {
        System.out.printf(" -> %s Requested\n", domain);
        if(blockList.contains(domain)) {
            return "This site is blocked!";
        }
        return this.isp.serveSite(domain);
    }
}
