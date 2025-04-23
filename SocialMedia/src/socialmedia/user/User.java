

package socialmedia.user;



public class User {
    private String quality;
    private String name;
    private String email;
    private int pass;

    public User() {
    }

    public User(String quality, String name, String email, int pass) {
        this.quality = quality;
        this.name = name;
        this.email = email;
        this.pass = pass;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" + "quality=" + quality + ", name=" + name + ", email=" + email + ", pass=" + pass + '}';
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
