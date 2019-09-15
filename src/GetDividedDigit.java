public class GetDividedDigit {


    public String getDivDigit(Integer input) {
        if (input % 3 == 0) {
            return String.valueOf(input/3);
        }
        if (input % 5 == 0) {
            return String.valueOf(input/5);
        }else{
            return String.valueOf(input);
        }
    }
    
}
