/**
 * OOPSBannerApp
 * UC4 - Array & Loops Implementation
 *
 * @author Ishu
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String line1 = String.join("   ",
                " ***** ",
                " ***** ",
                " ***** ",
                " ***** ");

        String line2 = String.join("   ",
                "*     *",
                "*     *",
                "*     *",
                "*     *");

        String[] banner = {
                line1,
                line2,
                line2,
                line2,
                line2,
                line2,
                line1
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}