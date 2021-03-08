import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Liest einen Wahrheitswert von der Konsole ein.
     * @return Der eingelesen Wahrheitswert.
     * @throws IOException
     */
    public static boolean readBoolean() throws IOException {
        while (true) {
            String eingabe = br.readLine().trim();
            if ((eingabe.equals("1"))
                    || (eingabe.equalsIgnoreCase("j"))
                    || (eingabe.equalsIgnoreCase("ja"))
                    || (eingabe.equalsIgnoreCase("y"))
                    || (eingabe.equalsIgnoreCase("yes"))
                    || (eingabe.equalsIgnoreCase("w"))
                    || (eingabe.equalsIgnoreCase("wahr"))
                    || (eingabe.equalsIgnoreCase("t"))
                    || (eingabe.equalsIgnoreCase("true"))) {
                return true;
            }
            else if ((eingabe.equals("0"))
                    || (eingabe.equalsIgnoreCase("n"))
                    || (eingabe.equalsIgnoreCase("nein"))
                    || (eingabe.equalsIgnoreCase("no"))
                    || (eingabe.equalsIgnoreCase("f"))
                    || (eingabe.equalsIgnoreCase("falsch"))
                    || (eingabe.equalsIgnoreCase("false"))) {
                return false;
            }
            System.out.print("Ungültige Eingabe. Bitte erneut versuchen: ");
        }
    }

    /**
     * Liest eine Text von der Konsole ein.
     * @return Der eingelesene Text.
     * @throws IOException
     */
    public static String readString() throws IOException {
        return br.readLine();
    }


    /**
     * Liest eine Kommazahl von der Konsole ein.
     * @return Eine Kommazahl
     * @throws IOException
     */
    public static double readDouble() throws IOException {
        while (true) {
            String text = br.readLine().trim().replace(',', '.');
            try {
                double zahl = Double.parseDouble(text);
                return zahl;
            }
            catch (NumberFormatException e) {
                System.out.print("Ungültige Eingabe. Bitte erneut versuchen: ");
            }
        }
    }

    /**
     * Liest eine Ganzzahl von der Konsole ein.
     * @return Eine Ganzzahl.
     * @throws IOException
     */
    public static int readInteger() throws IOException {
        while (true) {
            String text = br.readLine().trim();
            try {
                int zahl = Integer.parseInt(text);
                return zahl;
            }
            catch (NumberFormatException e) {
                System.out.print("Ungültige Eingabe. Bitte erneut versuchen: ");
            }
        }
    }
}

