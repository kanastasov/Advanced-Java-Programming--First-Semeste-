package headfirst.combining.observer;

import java.util.Iterator;
import java.util.ArrayList;

public class Flock implements Quackable {
	ArrayList ducks = new ArrayList();
  
	public void add(Quackable duck) {
		ducks.add(duck);
	}
  
	public void quack() {
		Iterator iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.quack();
		}
	}
   
	public void registerObserver(Observer observer) {
		Iterator iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.registerObserver(observer);
		}
	}
  
	public void notifyObservers() { }
  
	public String toString() {
		return "Flock of Ducks";
	}
}
