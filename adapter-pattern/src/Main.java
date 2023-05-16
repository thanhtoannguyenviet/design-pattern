public class Main {
    public static void main(String[] args) {
        String vietnameseWords = "Xin chào thế giới";
        VietnameseTarget vietnameseTarget = new TranslatorAdapter();
        vietnameseTarget.send(vietnameseWords);
    }
}