package raznoe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadcha5 {
    public static void main(String[] args) {
        String textFromLogsFile = "WrongMsisdnError SuccessfulTransaction TimeOutError InternalError SuccessfulTransaction ExternalIDError SuccessfulTransaction WrongIDError InvalidArgumentError SuccessfulTransaction SuccessfulTransaction SuccessfulTransaction WrongMsisdnError";
        String [] str = textFromLogsFile.split(" ");
        for (String s:str) {
            if(Pattern.matches(".*?Error", s)){
                System.out.print(s+" ");
            }

        }
    }
}

//        String text="WrongMsisdnError SuccessfulTransaction TimeOutError InternalError SuccessfulTransaction ExternalIDError SuccessfulTransaction WrongIDError InvalidArgumentError SuccessfulTransaction SuccessfulTransaction SuccessfulTransaction WrongMsisdnError";
//        Pattern pattern = Pattern.compile("[a-zA-Z]+Error");
//        Matcher matcher = pattern.matcher(text);
//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }
//    }