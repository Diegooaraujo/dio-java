public class App {
    public static void main(String[] args) throws Exception {
        // Gere todas as palavras reservadas
        printReservedWords();
    }

    public static void printReservedWords() {
        String[] reservedWords = {
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const",
            "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float",
            "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
            "new", "null", "package", "private", "protected", "public", "return", "short", "static", "strictfp",
            "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile",
            "while"
        };

        for (String word : reservedWords) {
            System.out.println(word);
        }
    }
}