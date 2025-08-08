import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();  // Convert to lowercase once

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }

        String cleaned = sb.toString();//cleaned string will be found after removing all special characters

//palindrome logic 
        int left = 0, right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                System.out.println("notpalindrome");
                return;
            }
            left++;
            right--;
        }

        System.out.println("palindrome");
    }
}
