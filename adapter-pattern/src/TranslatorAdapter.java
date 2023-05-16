public class TranslatorAdapter implements VietnameseTarget{
    @Override
    public void send(String words) {
        System.out.println("Reading words ...");
        System.out.println(words);
        String translateWords = translate(words);
        System.out.println(translateWords);
    }
    private String translate(String vietnameseWords){
        System.out.println("Translate");
        return "Hello words";
    }
}
