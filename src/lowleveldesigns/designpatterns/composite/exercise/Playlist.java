package lowleveldesigns.designpatterns.composite.exercise;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements IComponent{

   public String playListName;
   public List<IComponent> playlist = new ArrayList<>();

   public Playlist(String playListName){
      this.playListName = playListName;
   }

   public Playlist(String playListName, List<IComponent> playlist) {
      this.playListName = playListName;
      this.playlist = playlist;
   }

   @Override
   public void play() {
      System.out.println("Playing the playlist of "+ this.playListName);
      this.playlist.stream().forEach(song -> song.play());
   }

   @Override
   public void setPlaybackSpeed(float speed) {
      playlist.stream().forEach(song -> song.setPlaybackSpeed(speed));
   }

   @Override
   public String getName() {
      return this.playListName;
   }

   public void add(IComponent component){
this.playlist.add(component);
   }

   public void remove(IComponent component){
this.playlist.remove(component);
   }
}
