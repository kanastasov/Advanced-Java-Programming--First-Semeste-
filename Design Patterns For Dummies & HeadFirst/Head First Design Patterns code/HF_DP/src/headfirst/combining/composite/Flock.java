package headfirst.combining.composite;

import java.util.Iterator;
import java.util.ArrayList;

public class Flock implements Quackable {
	ArrayList quackers = new ArrayList();
 
	public void add(Quackable quacker) {
		quackers.add(quacker);
	}
 
	public void quack() {
		Iterator iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = (Quackable)iterator.next();
			quacker.quack();
		}
	}
 
	public String toString() {
		return "Flock of Quackers";
	}
}
