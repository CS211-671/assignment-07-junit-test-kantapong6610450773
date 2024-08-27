package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    StudentList s1List;
    @BeforeEach
    void init() {
        s1List = new StudentList(){};
    }

    @Test
    void testAddNewStudentAndFindStudentById() {
        s1List.addNewStudent("61xxxxxx", "Pong");
        s1List.addNewStudent("61xxxxxz", "Ping");
        s1List.addNewStudent("61xxxxxy", "Pang");
        Student foundStudent = s1List.findStudentById("61xxxxxx");
        assertNotNull(foundStudent);
        assertEquals("61xxxxxx", foundStudent.getId());
        assertEquals("Pong", foundStudent.getName());
        assertEquals(3,s1List.getStudents().size());
    }

    @Test
    void giveScoreToId() {
        s1List.addNewStudent("61xxxxxx", "Pong");
        s1List.giveScoreToId("61xxxxxx", 85.0);
        Student foundStudent = s1List.findStudentById("61xxxxxx");
        assertNotNull(foundStudent);
        assertEquals(85.0, foundStudent.getScore());
    }

    @Test
    void viewGradeOfId() {
        s1List.addNewStudent("61xxxxxx", "Pong", 90.0);
        String grade = s1List.viewGradeOfId("61xxxxxx");
        assertEquals("A", grade);
    }
}