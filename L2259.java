package LeetCode;

public class L2259 {
    public String removeDigit(String number, char digit) {
        String maxResult = "";
        for(int i = 0; i< number.length(); i++){
            if(number.charAt(i) == digit){
                String newNumber = number.substring(0,i)+ number.substring(i+1);
                if(maxResult.compareTo(newNumber) < 0){
                    maxResult = newNumber;
                }
            }
        }

        return maxResult;

    }
}
