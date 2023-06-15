package structural.proxy;

public class Zain implements ISP{
    @Override
    public String serveSite(String domain) {
        return String.format("https://www.%s.com", domain);
    }
}
