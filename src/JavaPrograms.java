
/**
 * Created by Attila Leleu on 2/23/2016.
 */
public class JavaPrograms {
    public static final int LINES = 7;

    public static void main(String[] args) {
        drawCone3();
    }

    // ***** not the best approach / use of "magic numbers" *****
    public static void drawCone() {
        for (int line = 1; line <= 5; line++) {
            for (int i = 1; i <= line - 1; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= 11 - (2 * line); i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // ***** inverted drawCone using the same method *****
    public static void drawCone2() {
        for (int line = 5; line >= 1; line--) {
            for (int i = 1; i <= line - 1; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= 11 - (2 * line); i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // ***** a revised algorithm *****
    public static void drawCone3() {
        for (int line = LINES; line >= 1; line--) {
            for (int i = 1; i <= (line - 1); i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= (2 * LINES + 1 - 2 * line); i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
