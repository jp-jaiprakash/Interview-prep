package lowleveldesigns.designpatterns.composite.exercise;

public class Song implements IComponent{

   public String songName;
   public String artist;
   public float speed =1;

   public Song(String songName, String artist){
      this.songName = songName;
      this.artist = artist;
   }

   @Override
   public void play() {
      System.out.println("Playing the Song "+ getName() + " by Artist "+ getArtist() );
   }

   @Override
   public void setPlaybackSpeed(float speed) {
      this.speed = speed;
   }

   @Override
   public String getName() {
      return this.songName;
   }

   public String getArtist(){
      return this.artist;
   }
}
