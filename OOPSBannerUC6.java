public class OOPSBannerUC6 {

    public static void main(String[] args) {

        String[] banner = buildBanner();

        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Builds the full OOPS banner
    public static String[] buildBanner() {

        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();

        String[] banner = new String[o.length];

        for (int i = 0; i < o.length; i++) {
            banner[i] = o[i] + "  " + o[i] + "  " + p[i] + "  " + s[i];
        }

        return banner;
    }

    // Pattern for letter O
    public static String[] buildO() {
        return new String[] {
            "*****",
            "*   *",
            "*   *",
            "*   *",
            "*****"
        };
    }

    // Pattern for letter P
    public static String[] buildP() {
        return new String[] {
            "*****",
            "*   *",
            "*****",
            "*    ",
            "*    "
        };
    }

    // Pattern for letter S
    public static String[] buildS() {
        return new String[] {
            "*****",
            "*    ",
            "*****",
            "    *",
            "*****"
        };
    }
}
