public class StringCheckerTests implements StringChecker{
    public boolean checkString(String s){
        if(!s.equals("hello")){
            return true;
        }else{
            return false;
        }
    }
}