package lab4;

/**
 *
 * @author Bogdan Kovalov
 * @since 10/24/2020
 */
public class Playlist {

    
    private Song first;

    /**
     * Constructor method that creates a playlist as a list.
     */
    public Playlist() {

        first = null;
    }
    
 /**
  * Method that adds songs into a playlist and accepts the parameter as s.
  * @param s The song 
  */
    public void addSong(Song s) {
        //Checks if the list is empty or not.
        if (first == null) {
            s.setNext(first);
            first = s;
            return;
        }
        //add song at the end of the list.
        Song temp = first;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(s);
    }
//return song from the head of the list

    public Song listenToSong() {
        Song temp = first;
        first = first.getNext();
        return temp;
// retrieves the next song to listen to
    }

    public void printPlaylist() {
        Song temp = first;
        System.out.println("Playlist");
        System.out.println("");
        while (temp != null) {
            System.out.println(temp.getTrack());
            temp = temp.getNext();
        }
    }
}
