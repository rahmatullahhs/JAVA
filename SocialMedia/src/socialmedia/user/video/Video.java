package socialmedia.user.video;

import socialmedia.user.User;

public class Video extends User {

    String videoCall;
    String contant;
    float videoDuration;

    public Video() {
    }

    public Video(String videoCall, String contant, float videoDuration) {
        this.videoCall = videoCall;
        this.contant = contant;
        this.videoDuration = videoDuration;
    }

    public Video(String videoCall, String contant, float videoDuration, String quality, String name, String email, int pass) {
        super(quality, name, email, pass);
        this.videoCall = videoCall;
        this.contant = contant;
        this.videoDuration = videoDuration;
    }

    public String getVideoCall() {
        return videoCall;
    }

    public void setVideoCall(String videoCall) {
        this.videoCall = videoCall;
    }

    public String getContant() {
        return contant;
    }

    public void setContant(String contant) {
        this.contant = contant;
    }

    public float getVideoDuration() {
        return videoDuration;
    }

    public void setVideoDuration(float videoDuration) {
        this.videoDuration = videoDuration;
    }

    @Override
    public String toString() {
        return "Video{" + "videoCall=" + videoCall + ", contant=" + contant + ", videoDuration=" + videoDuration + '}';
    }

   
    
    
    
    
    
    
    
    
    
    
    
}
