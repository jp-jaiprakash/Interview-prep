package lowleveldesigns.designpatterns.observer;

import java.util.ArrayList;

public class Subject {
   private ArrayList<Observer> observers = new ArrayList<>();

   public void registerObserver(Observer observer){
      observers.add(observer);
   }

   public void unregisterObserver(Observer observer){
      observers.remove(observer);
   }

   public void notifyMethod(){
      for(Observer o: observers){
         o.update();
      }
   }
}
