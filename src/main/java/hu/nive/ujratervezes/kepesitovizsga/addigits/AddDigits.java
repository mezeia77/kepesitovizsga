package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {
    public int addDigits(String s) {
        if(s==null || "".equals(s)){
            return -1;
        }
        int result = 0;

        for (char c:s.toCharArray()){
            if(c>= 49 && c<=57){
                result+=c-48;
            }
        }

        return result;
    }
}
