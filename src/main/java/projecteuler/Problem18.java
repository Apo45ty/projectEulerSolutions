import java.math.BigInteger;

public class Problem18{
    public static void main(String... args){
        int count = 0;
        for(int i=1;i<=1000;i++){
            String sI = intToName(i).replace(" ","");
            System.out.println(sI);
            count+=sI.length();
        }
        System.out.println(count);
    }
    private static String intToName(int number){
        String result = "";
        String numberInString = ""+number;
        if(numberInString.length()==4){
            result+=getSingleNumberName(Integer.parseInt(""+numberInString.charAt(0)))+"thousand";
            String hundred = getSingleNumberName(Integer.parseInt(""+numberInString.charAt(1)));
            if(hundred.length()>0)
                hundred+="hundred";
            result+=hundred;
            String deca = getDecaNumberName(Integer.parseInt(numberInString.substring(2)));     
            if(deca.length()>0)
                deca="and"+deca;
            result+=deca;
        } else if(numberInString.length()==3){
            String hundred = getSingleNumberName(Integer.parseInt(""+numberInString.charAt(0)));
            if(hundred.length()>0)
                hundred+="hundred";
            result+=hundred;
            String deca = getDecaNumberName(Integer.parseInt(numberInString.substring(1)));     
            if(deca.length()>0)
                deca="and"+deca;
            result+=deca;
        } else if(numberInString.length()==2){
            return getDecaNumberName(number);
        } else if(numberInString.length()==1){
            return getSingleNumberName(number);
        }
        return result;
    }
    private static String getSingleNumberName(int number){
        String result = "";
        switch(number){
            case 0:
            return "";
            case 1:
            return "one";
            case 2:
            return "two";
            case 3:
            return "three";
            case 4:
            return "four";
            case 5:
            return "five";
            case 6:
            return "six";
            case 7:
            return "seven";
            case 8:
            return "eight";
            case 9:
            return "nine";
        }

        return result;
    }
    private static String getDecaNumberName(int number){
        String result = "";
        String numberInString = ""+number;
        switch(number){
            case 0:
            return ""+getSingleNumberName(Integer.parseInt((""+numberInString.charAt(0))));
            case 19:
            return "nineteen";
            case 18:
            return "eighteen";
            case 17:
            return "seventeeen";
            case 16:
            return "sixteen";
            case 15:
            return "fifteen";
            case 14:
            return "fourteen";
            case 13:
            return "thirteen";
            case 12:
            return "twelve";
            case 11:
            return "eleven";
            case 10:
            return "ten";
        }
        if(number >=90)
        return "ninety"+getSingleNumberName(Integer.parseInt((""+numberInString.charAt(1))));;
        if(number >=80)
        return "eighty"+getSingleNumberName(Integer.parseInt((""+numberInString.charAt(1))));;
        if(number >=70)
        return "seventy"+getSingleNumberName(Integer.parseInt((""+numberInString.charAt(1))));;
        if(number >=60)
        return "sixty"+getSingleNumberName(Integer.parseInt((""+numberInString.charAt(1))));;
        if(number >=50)
        return "fifty"+getSingleNumberName(Integer.parseInt((""+numberInString.charAt(1))));;
        if(number >=40)
        return "forty"+getSingleNumberName(Integer.parseInt((""+numberInString.charAt(1))));;
        if(number >=30)
        return "thirty"+getSingleNumberName(Integer.parseInt((""+numberInString.charAt(1))));;
        if(number >=20)
        return "twenty"+getSingleNumberName(Integer.parseInt((""+numberInString.charAt(1))));;
        if(number >0){
            return getSingleNumberName(Integer.parseInt((""+numberInString.charAt(0))));
        }
        return result;
    }
}