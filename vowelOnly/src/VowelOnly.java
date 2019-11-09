import java.util.Arrays;
import java.util.HashSet;

public class VowelOnly {
    public static void main(String[] args) {
        
        VowelOnly vowelOnly = new VowelOnly();
        String input = "Hello World";
        System.out.println("vowelOnly(input) = " + vowelOnly.vowelOnly(input));
    }


    public String vowelOnly(String input)
    {
        Character[] vowelsChar = new Character[]{'a','e','i','o','u'};
        HashSet<Character> vowels = new HashSet<>(Arrays.asList(vowelsChar));

        StringBuilder stringBuilder = new StringBuilder();
        for (int i= 0; i < input.length(); i++)
        {
            char c = input.charAt(i);
            if (vowels.contains(Character.toLowerCase(c))) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
