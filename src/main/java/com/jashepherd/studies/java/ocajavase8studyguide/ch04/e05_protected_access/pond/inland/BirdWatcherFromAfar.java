package com.jashepherd.studies.java.ocajavase8studyguide.ch04.e05_protected_access.pond.inland;

import com.jashepherd.studies.java.ocajavase8studyguide.ch04.e05_protected_access.pond.shore.Bird;

/**
 * Chapter 4: Methods and Encapsulation<br>
 * Applying Access Modifiers<br>
 * Protected Access - pages 177-178
 */
public class BirdWatcherFromAfar {
	public void watchBird() {
		Bird bird = new Bird();
//		bird.floatInWater();  // DOES NOT COMPILE
//		System.out.println(bird.text);  // DOES NOT COMPILE
	}
}