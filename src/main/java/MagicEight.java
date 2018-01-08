import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MagicEight {

    private ArrayList<String> phrases;
    List arrlist = new ArrayList<>();

    public MagicEight() {
        this.phrases = new ArrayList<>();
        }

        public int getPhraseCount () {
            return this.phrases.size();
        }


        public void addPhrase (String phrase){
            this.phrases.add(phrase);
        }

        public static String shakeBall () {
            return "REPLY HAZY, TRY AGAIN";
        }

        public String getRandomPhrase () {
            arrlist.add("DON'T COUNT ON IT");
            arrlist.add("SIGNS POINT TO YES");
            arrlist.add("CONCENTRATE AND ASK AGAIN");
            Collections.shuffle(this.arrlist);
            System.out.println(this.arrlist[0]);
        }

    }
}
