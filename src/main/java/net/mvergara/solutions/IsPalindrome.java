package net.mvergara.solutions;

public class IsPalindrome {
    public boolean isPalindrome(String s) {
        String preperedString = prepareString(s);
        System.out.println(preperedString);
        int left = 0;
        int right = preperedString.length() -1;

        while (left < right) {
            if(preperedString.charAt(left) != preperedString.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private String prepareString(String s){
        StringBuilder output = new StringBuilder();
        for(Character c: s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                output.append(Character.toLowerCase(c));
            }
        }
        return output.toString();
    }
}
