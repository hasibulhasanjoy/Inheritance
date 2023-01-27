public class Question {
    private String text;
    private String answer;

    /**
     *
     */
    public Question() {
        text = "";
        answer = "";
    }

    /**
     * @return
     */
    public String getText() {
        return text;
    }

    /**
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return
     */
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     *
     */
    public void display() {
        System.out.println(text);
    }

    /**
     * @param response
     * @return
     */
    public boolean checkAnswer(String response) {
        response = response.trim().toLowerCase();
        answer= answer.trim().toLowerCase();
        return response.equals(answer);
    }
}
