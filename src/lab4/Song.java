package lab4;

/**
 *
 * @author Bogdan Kovalov
 * @since 10/24/2020
 *
 */
public class Song {

    //Declaration of variables.
    
    private String track;
    private Song next;

    
    public Song() {
        track = "";
        next = null;
    }

    public Song(String track) {
        this.track = track;
        next = null;
    }

    /**
     * Method getNext that returns the next song.
     * @return the next song
     */
    public Song getNext() {
        return next;
    }

    /**
     * This method is a setter and accepts next as a parameter.
     * @return the next song
     */
    public void setNext(Song next) {
        this.next = next;
    }

    /**
     * Method that returns the track name
     * 
     * @return the track name
     */
    public String getTrack() {
        return track;
    }

    /**
     * setTrack method that is a setter and accepts track as a method\
     * 
     * @param track the track name as a string 
     */
    public void setTrack(String track) {
        this.track = track;
    }
}
