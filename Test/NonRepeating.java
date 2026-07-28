public class NonRepeating {

    public static void main(String[] args) {

        String str = "swiss";
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {

            boolean isRepeated = false;

            for (int j = 0; j < ch.length; j++) {

                if (i != j && ch[i] == ch[j]) {
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated) {
                System.out.println("First Non-Repeating Character: " + ch[i]);
                break;
            }
        }
    }
}