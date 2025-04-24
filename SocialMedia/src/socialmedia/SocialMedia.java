package socialmedia;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import socialmedia.user.User;
import socialmedia.user.chat.Chat;
import socialmedia.user.video.Video;

public class SocialMedia {

    public static void main(String[] args) {

        
        Scanner s=new Scanner(System.in);
        
        
        User u =new User("hd", "video", "mail",123);
       
        Chat c = new Chat("hello", "smail", 123);
        Video v1 = new Video();
         Video v2 = new Video();
          Video v3 = new Video();
        v1.setVideoCall("music video");
        v2.setVideoCall("video Call");
        v3.setVideoCall("Short Video");
        v1.setQuality("mp4");
        v2.setQuality("mp4");
        v3.setQuality("mp4");
        
        
        
        
        
        
        System.out.println(v1.getVideoCall());
        System.out.println(c.toString());
        System.out.println(u.toString());
        System.out.println(v1.getQuality());
        
        
        
        
    }

}
