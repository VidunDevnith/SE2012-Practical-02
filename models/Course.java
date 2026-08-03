package models;
/**
 * Represents a course with a course code and title.
 */
public class Course {
    private String code;
    private String title;
    /**
     * Creates a new Course object.
     *
     * @param code Course code
     * @param title Course title
     */
    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }
    /**
     * Returns the course code.
     *
     * @return course code
     */
    public String getCode() {
        return code;
    }
    /**
     * Returns the course title.
     *
     * @return course title
     */
    public String getTitle() {
        return title;
    }
    /**
     * Returns the course details.
     *
     * @return printable course information
     */
    @Override
    public String toString() {
        return "Course Code: " + code + ", Title: " + title;
    }
}

