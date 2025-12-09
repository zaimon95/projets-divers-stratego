package g53037.stratego.view;

/**
 * Class that allows to put a string in a chosen color.
 *
 * @author G43004 Fakir Ilias
 */
public class ColorText {

    /**
     * default Color of BASH.
     *
     * @return default color.
     */
    private static String toDefault() {
        return "\033[0m";
    }

    /**
     * Color a string in red.
     *
     * @param a The string that will be coloring
     * @return The colored chain in red
     */
    public static String toRed(String a) {
        return "\033[31m" + a + toDefault();
    }

    /**
     * Color a string in green.
     *
     * @param a The string that will be coloring
     * @return The colored chain in green
     */
    public static String toGreen(String a) {
        return "\033[32m" + a + toDefault();
    }

    /**
     * Color a string in Purple.
     *
     * @param a The string that will be coloring
     * @return The colored chain in Purple
     */
    public static String toPurple(String a) {
        return "\033[35m" + a + toDefault();
    }

    /**
     * Color a string in Blue.
     *
     * @param a The string that will be coloring
     * @return The colored chain in Blue
     */
    public static String toBlue(String a) {
        return "\033[34m" + a + toDefault();
    }

    /**
     * Color a string in Cyan.
     *
     * @param a The string that will be coloring
     * @return The colored chain in Blue
     */
    public static String toCyan(String a) {
        return "\033[36m" + a + toDefault();
    }

    /**
     * Colorie une chaine en jaune.
     *
     * @param a La chaine à colorer.
     * @return La chaine colorée.
     */
    public static String toYellow(String a) {
        return "\033[33m" + a + toDefault();
    }

    /**
     * Color a background of a string in grey.
     *
     * @param a The string that will be coloring
     * @return The colored chain in grey
     */
    public static String bgtoGrey(String a) {
        return "\033[47m" + a + toDefault();
    }
    
    /**
     * Color a background of a string in blue.
     *
     * @param a The string that will be coloring
     * @return The colored chain in grey
     */
    public static String bgtoBlue(String a) {
        return "\033[46m" + a + toDefault();
    }
    
    /**
     * Color a background of a string in blue.
     *
     * @param a The string that will be coloring
     * @return The colored chain in grey
     */
    public static String bgtoGreen(String a) {
        return "\033[42m" + a + toDefault();
    }
}
