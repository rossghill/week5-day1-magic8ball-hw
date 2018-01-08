import java.util.ArrayList;

public class MagicEight {

    private ArrayList<String> phrases;

    public int getPhraseCount(){
        return this.phrases.size();
    }

    public MagicEight() {
        this.phrases = new ArrayList<>();
    }

    public void addPhrase(String phrase) {
        this.phrases.add(phrase);
    }


    public static String shakeBall() {
        return("REPLY HAZY, TRY AGAIN");
    }
}
