import java.util.*;

public class LetterFrequency {
    void buildDictionaryWithMap(String text){
        text = text.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            // ё идёт отдельно от а-я
            if((ch >= 'а' && ch <= 'я') || ch == 'ё'){
                map.compute(ch, (character, integer)
                        -> integer == null ? 1 : integer + 1);
            }
        }
        ArrayList<Map.Entry<Character, Integer>> entries =
                new ArrayList<>(map.entrySet());
        entries.sort((o1, o2) -> Character.compare(o1.getKey(), o2.getKey()));
        for(Map.Entry<Character, Integer> entry : entries){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        LetterFrequency letterFrequency = new LetterFrequency();
        String text = "«Война и мир» — один из самых известных и объемных романов Льва Николаевича Толстого. Это эпическое произведение, описывающее события войн и революций начала XIX века, является одним из величайших достижений мировой литературы. Роман состоит из четырех частей и более тысячи персонажей, которые живут, любят, страдают и умирают на фоне исторических событий.";
        letterFrequency.buildDictionaryWithMap(text);
    }
}
