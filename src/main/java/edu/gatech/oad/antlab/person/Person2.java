package edu.gatech.oad.antlab.person;
import java.util.Random;
import java.lang.StringBuilder;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Joseph Nam 
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 2 put your implementation here
            StringBuilder sb = new StringBuilder(input);
            Random rand = new Random();
            String output = "";
            for (int i = 0; i < input.length() - 1; i++) {
                int a = rand.nextInt(sb.length() - 1);
                output = output + sb.charAt(a);
                sb.deleteCharAt(a);
            }
	  return output;
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
