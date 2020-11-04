import java.util.HashMap;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> cd = new HashMap<String, String>();
        cd.put("Time is Running out", "I think im drowning...");
        cd.put("Sing for Absolution", "Lips are turning blue...");
        cd.put("Butterflies and Hurricanes", "Change everything you are and everything you were...");
        cd.put("Endlessly", "there's a part of me you'll never know...");

        String val = cd.get("Time is Running out");

        for(String key : cd.keySet()){
            System.out.println(String.format("Track: %s: Lyrics: %s", key, cd.get(key)));
        }
        
    }
}