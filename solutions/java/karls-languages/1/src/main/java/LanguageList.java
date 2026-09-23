import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        if(languages.isEmpty()){
            return true;
        }
        return false;
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        String firstLanguage = languages.get(0);
        return firstLanguage;
    }

    public int count() {
        int count = languages.size();
        return count;
    }

    public boolean containsLanguage(String language) {
        if(languages.contains("Kotlin")){
            return false;
        }
        return true;
    }

    public boolean isExciting() {
        if(languages.contains("Java") || languages.contains("Kotlin")){
            return true;
        }
        return false;
    }
}
