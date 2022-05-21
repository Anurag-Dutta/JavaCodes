// import java.util.*;

public class RemoveWhiteSpacesFromString {
    public static void main(String[] args) {
        String sentence = "A n u r a g";
        System.out.print("\nBefore removing all white spaces, the string will be: " + sentence);
        sentence = sentence.replaceAll(" ", "");
        System.out.print("\nAfter removing all white spaces, the string will be: " + sentence);
    }
}
