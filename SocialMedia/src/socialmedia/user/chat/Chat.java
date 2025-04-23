

package socialmedia.user.chat;

import socialmedia.user.User;



public class Chat extends User{
    String massage;
    String emoji;
    int numbers;

    public Chat() {
    }

    public Chat(String massage, String emoji, int numbers) {
        this.massage = massage;
        this.emoji = emoji;
        this.numbers = numbers;
    }

    public Chat(String massage, String emoji, int numbers, String quality, String name, String email, int pass) {
        super(quality, name, email, pass);
        this.massage = massage;
        this.emoji = emoji;
        this.numbers = numbers;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "Chat{" + "massage=" + massage + ", emoji=" + emoji + ", numbers=" + numbers + '}';
    }

       
    
    
    
    
    
    
    
    
}
