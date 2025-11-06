
public class TestRun {

    public static void main(String[] args) {
        String text = "xyzabxyzabxyz";
        String pattern = "xyz";

        findPatternIndexes(text, pattern);
    }

    private static void findPatternIndexes(String text, String pattern) {

        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i < n; i++) {

            String sub = text.substring(i, i + m);

            System.out.println("Sub >>>> " + sub);

            if (sub.equals(pattern)) {
                System.out.print(i + " ");
            }

        }

    }
}