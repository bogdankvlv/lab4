
package lab4;

/**
 *
 * @author Bogdan Kovalov
 * @since 10/25/2020
 */
import java.util.ArrayList;
import java.util.LinkedList;

public class MyApp {
   
   public static void addToPlaylist(Playlist play,ArrayList<QueueStack> allTheWeeks) {
       for (int i = 0; i < allTheWeeks.size(); i++) {
           QueueStack Q=allTheWeeks.get(i);
           LinkedList<Song> list=Q.getListOfSong();
           for(int num=0; num<list.size(); num++) {
               play.addSong(list.get(num));
           }
       }
   }
   
   public static void readDataFromFiles(ArrayList<QueueStack> allTheWeeks,String myFiles[]) {
       for (int i=0; i < myFiles.length; i++){
       QueueStack dataExtract = new QueueStack(myFiles[i]);
       allTheWeeks.add(dataExtract);
       }
   }
   
   public static void main(String args[]) {
   // The files you'll be reading stored in a data structure to make it iterable
       
   String myFiles[]= {"week1.csv", "week2.csv", "week3.csv", "week4.csv"};
   
   ArrayList<QueueStack> allTheWeeks = new ArrayList<QueueStack>();
   readDataFromFiles(allTheWeeks,myFiles);
  
   Playlist play1=new Playlist();
   
   addToPlaylist(play1,allTheWeeks);
  
   play1.printPlaylist();
  
   SongHistoryList history=new SongHistoryList();
  
   history.addSong(play1.listenToSong());
   history.addSong(play1.listenToSong());
   history.addSong(play1.listenToSong());
   history.addSong(play1.listenToSong());
  
   history.printHistory();
   System.out.println();
   System.out.println("Latest song listen: "+history.lastListened().getTrack());
   }
}
