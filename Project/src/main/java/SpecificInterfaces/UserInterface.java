package SpecificInterfaces;

import Data.Course;
import Data.CourseDate;
import neo4j_JVM_API.Neo4JAPI;

/**
 * A class containing all the functionality that a user should be able to access without signing in
 * 
 * 
 * @author Jesper.
 *
 */
public class UserInterface {

	private Neo4JAPI neoapi;
	
	/**
	 * Constructor
	 * @param neoapi
	 */
	public UserInterface(Neo4JAPI neoapi) {
		this.neoapi = neoapi;
	}
	
	/**
	 *  Gets course information using the course code and course date
	 * @param courseCode
	 * @param courseDate
	 * @return
	 */
	public Course getCourseByCode(String courseCode, CourseDate courseDate) {
		return this.neoapi.getMethods.getCourse(courseCode, courseDate);
	}
	
	public Course[] getCoursesByTopic(String topic) {
		
		throw new RuntimeException("");
		
		//this.neoapi.getMethods.getCoursesByTopic(topic);
		
	}
	
	
}