package task2;

public class MainStringBuilder {
    public static void main(String[] args) {


        System.out.println(reverseString("Babah"));

        System.out.println(concatenateWords(new String[]{"English " +
                "vocabulary " +
                "words"}));
        System.out.println(countVowels("Pushka"));

        System.out.println(isPalindrome("Cat"));

        System.out.println(capitalizeWords("horosho"));

        System.out.println(countWords("Menin atym Kim"));

        System.out.println(convertToAscii("Prius"));

        System.out.println(removeSpaces("  Miru nujen mir    "));



    }  //        String тибиндеги сөздү тескери кылып кайтарган метод:
        public static String reverseString(String input) {
            StringBuilder reversed = new StringBuilder(input);
            return reversed.reverse().toString();
        }


//        StringBuilder аркылуу сөздөрдүн массивин бир сапка бириктирген метод:
        public static String concatenateWords(String[] words) {
            StringBuilder sb = new StringBuilder();
            for (String word : words) {
                sb.append(word).append(" ");
            }
            return sb.toString().trim();
        }

//        Сөздүн ичинде канча үндүү тамга бар экенин эсептеген метод:
        public static int countVowels(String input) {
            int count = 0;
            String vowels = "aeiouAEIOU";
            for (char c : input.toCharArray()) {
                if (vowels.indexOf(c) != -1) {
                    count++;
                }
            }
            return count;
        }

//        Сөз палиндром экенин текшерүүчү метод:
        public static boolean isPalindrome(String input) {
            StringBuilder sb = new StringBuilder(input);
            return sb.toString().equals(sb.reverse().toString());
        }

//        Сүйлөмдөгү ар бир сөздүн биринчи тамгасын баш тамга менен жазуучу метод:
        public static String capitalizeWords(String sentence) {
            String[] words = sentence.split(" ");
            StringBuilder sb = new StringBuilder();
            for (String word : words) {
                if (!word.isEmpty()) {
                    sb.append(Character.toUpperCase(word.charAt(0)))
                            .append(word.substring(1)).append(" ");
                }
            }
            return sb.toString().trim();
        }

//        Сүйлөмдөгү сөздөрдүн санын эсептөөчү метод:
        public static int countWords(String sentence) {
            if (sentence == null || sentence.isEmpty()) {
                return 0;
            }
            String[] words = sentence.split("\\s+");
            return words.length;
        }

//        Ар бир тамганы ASCII коду менен алмаштырган метод:
        public static String convertToAscii(String input) {
            StringBuilder sb = new StringBuilder();
            for (char c : input.toCharArray()) {
                sb.append((int) c).append(" ");
            }
            return sb.toString().trim();
        }

//        Сүйлөмдөн бардык боштуктарды алып салуучу метод:
        public static String removeSpaces(String input) {
            StringBuilder sb = new StringBuilder(input);
            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) == ' ') {
                    sb.deleteCharAt(i);
                    i--;
                }
            }
            return sb.toString();
        }
    }
