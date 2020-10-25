package lab4;

/**
 *
 * @author Bogdan Kovalov
 * @since 10/25/2020
 */
public class SongHistoryList {

    private Song first;

    /**
     * 
     * Constructor Method that sets the first list to null.
     */
    public SongHistoryList() {
        first = null;
    }

    /**
     * Method that adds song to the list with param s
     * @param s The song.
     */
    public void addSong(Song s) {
        s.setNext(first);
        first = s;
    }
 
    /**
     * Method that returns the last song listened to 
     * @return The last listened song.
     */
    public Song lastListened() {

        Song temp = first;
        first = first.getNext();
        return temp;
    }

    public void printHistory() {
        Song temp = first;
        System.out.println("History");
        System.out.println();
        while (temp != null) {
            System.out.println(temp.getTrack());
            temp = temp.getNext();
        }
    }
}
