package com.junz.common;

public class Student extends Object{
	
	/** The value is used for character storage. */
    private  char value[];

    /** Cache the hash code for the string */
    private int hash; // Default to 0

	private String name = "";
	
	public Student(String name) {
		this.name = name;
	}
	
	public boolean equals(Object obj) {
        return (this == obj);
    }
	
	public int hashcode() {
		int h = hash;
        if (h == 0 && value.length > 0) {
            char val[] = value;

            for (int i = 0; i < value.length; i++) {
                h = 31 * h + val[i];
            }
            hash = h;
        }
		return 1;
	}
	
}
