package co.igb.util;

/**
 * @author dbotero
 */
public class IGBUtils {

    public static String getProperParameter(String property, String companyName) {
        String[] parts = property.split(";");
        for (String part : parts) {
            String[] subparts = part.split(",");
            if (subparts[0].trim().equalsIgnoreCase(companyName)) {
                return subparts[1].trim();
            }
        }
        return null;
    }
}