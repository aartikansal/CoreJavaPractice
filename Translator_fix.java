

/*
Code doesn't fix itself
*/

public class Translator_fix {
    public static void main(String[] args) {
        Translator translator = new Translator();
        System.out.println(translator.translate());
    }

    public static class Translator {
        public String translate() {
            return "I translate from Russian";
        }
    }


}