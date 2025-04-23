package socialmedia;

import java.lang.reflect.Array;
import java.util.Arrays;
import socialmedia.user.User;
import socialmedia.user.chat.Chat;
import socialmedia.user.video.Video;

public class SocialMedia {

    public static void main(String[] args) {

        User u =new User("hd", "video", "mail",123);
        Chat c = new Chat("hello", "smail", 123);
        Video v = new Video();
        v.setVideoCall("musicvideo");
        v.setQuality("mp4");
        
        System.out.println(v.getVideoCall());
        System.out.println(c.toString());
        System.out.println(u.toString());
        System.out.println(v.getQuality());
    }

}
