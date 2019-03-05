public class Tasks1_3 {
    public static void main(String[] args) {

        System.out.println(sumDouble(0, 15));
        System.out.println(sumDouble(8, 2));
        System.out.println(sumDouble(4, 4));
        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static int sumDouble(int a, int b) {
        return a == b ? a * 4 : a + b;
    }

    public static String altPairs(String str) {
        int currentPos = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (currentPos < str.length()) {
            stringBuilder.append(str.charAt(currentPos));
            if (currentPos + 1 < str.length()) {
                stringBuilder.append(str.charAt(currentPos + 1));
            }
            currentPos += 4;
        }
        return stringBuilder.toString();
    }

}
