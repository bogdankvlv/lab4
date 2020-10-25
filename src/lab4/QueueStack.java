
package lab4;

/**
 *
 * @author Bogdan Kovalov
 * @since 10/24/2020
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;

public class QueueStack{
private LinkedList<Song> list;
// constructor creates a linked list that stores songs from one text file
public QueueStack (String filename){
// take the filename, open it and convert to queue
   list=new LinkedList<Song>();
   try {
       File file = new File(filename);
       FileReader filereader = new FileReader(file);
       BufferedReader br=new BufferedReader(filereader);
       String line;
       while(true) {
           line=br.readLine();
           if(line==null)
               break;
           Song s=new Song(line);
           list.add(s);
          
       }
   }
   catch (Exception e) {
   e.printStackTrace();
   }
}
public LinkedList<Song> getListOfSong(){
   return list;
}
}
