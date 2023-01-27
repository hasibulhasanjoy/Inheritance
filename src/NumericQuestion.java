public class NumericQuestion extends Question {

    @Override
    public boolean checkAnswer(String response) {
        Double ans = Double.parseDouble(response) - Double.parseDouble(super.getAnswer());
        ans = Math.abs(ans);
        System.out.println(ans);
        int a = ans.compareTo(0.01);
        if(a<=0){
            return true;
        }
        return false;
    }
}
