package org.first;

public class CourseDetails {
private void javaCourse() {
System.out.println(" Java course is started");
}
private void pythonCourse() {
System.out.println("Python course is not started");
}
public static void main(String[] args) {
	CourseDetails c = new CourseDetails();
	c.javaCourse();
	c.pythonCourse();
}
}
