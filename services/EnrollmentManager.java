package services;
import models.Student;
/**
 * Provides student searching and sorting services.
 */
public class EnrollmentManager {
    /**
     * Searches for a student by ID using linear search.
     *
     * @param students array of students
     * @param count number of students
     * @param id student ID to search
     * @return matching Student object or null if not found
     */
    public Student searchStudentById(Student[] students, int count, String id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId().equalsIgnoreCase(id)) {
                return students[i];
            }
        }
        return null;
    }
    /**
     * Sorts students alphabetically by name using bubble sort.
     *
     * @param students array of students
     * @param count number of students
     */
    public void sortStudentsByName(Student[] students, int count) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (students[j].getName().compareToIgnoreCase(students[j + 1].getName()) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}

