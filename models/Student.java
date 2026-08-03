package models;
/**
 * Represents a student with an ID and name.
 */
public class Student {
    private String id;
    private String name;
    /**
     * Creates a new Student object.
     *
     * @param id Student ID
     * @param name Student name
     */
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
    /**
     * Returns the student ID.
     *
     * @return student ID
     */
    public String getId() {
        return id;
    }
    /**
     * Returns the student name.
     *
     * @return student name
     */
    public String getName() {
        return name;
    }
    /**
     * Returns the student details.
     *
     * @return printable student information
     */
    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }
}

