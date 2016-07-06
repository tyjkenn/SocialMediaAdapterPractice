package socialmedia;

/**
 * Puts YouTubeVideos into a SocialMedia Entry, following the adapter pattern
 * @author tyjkenn
 */
public class YouTubeAdapter implements SocialMediaEntry {
    
    //The object that is being adapted
    public YouTubeVideo youTubeVideo;
    
    /**
        * Constructor fro a video
        * @param video the video to be adapted
        */
    public YouTubeAdapter(YouTubeVideo video) {
        youTubeVideo = video;
    } 
    
    /**
        * Adapts the author of the video to be the user of the social media entry
        * @return the author
        */
    public String getUser() {
        return youTubeVideo.getAuthor();
    }
    
    /**
        * Adapts the title and description of the video to be the post text of the social media entry
        * @return title: description
        */
    public String getPostText() {
        return youTubeVideo.getTitle() + ": " + youTubeVideo.getDescription();
    }
}
