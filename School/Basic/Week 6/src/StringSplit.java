// split --> separates String in multple parts using text, symbol or space

public class StringSplit {
    public static void main(String[] args) {
        String text = "My-Choice----My-legacy-";
        String[] arr = text.split("-");

        String myText = "";

        for (String newText : arr) {
            if (!newText.equals("")) {
                myText = myText + newText + " ";
            }

        }
        System.out.println(myText);
    }
}
