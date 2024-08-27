package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void testAddScore(){
        Student s1 = new Student("61xxxxxx", "Pong");
        assertEquals(0, s1.getScore());
        s1.addScore(40.5);
        assertEquals(40.5, s1.getScore());
        s1.addScore(10);
        assertEquals(50.5, s1.getScore());
    }

    @Test
    void testCalculateGrade(){
        Student s1 = new Student("61xxxxxx", "Pong");
        s1.addScore(60.8);
        assertEquals('C', s1.grade());
    }

    @Test
    void testChangeName(){
        Student s1 = new Student("61xxxxxx", "Pong");
        s1.changeName("Pung");
        assertEquals("Pung", s1.getName());
        s1.changeName("Pang");
        assertEquals("Pang", s1.getName());
    }

    @Test
    void testIsId(){
        Student s1 = new Student("61xxxxxx", "Pong");
        assertEquals(true, s1.isId("61xxxxxx"));
        assertEquals(false, s1.isId("61xxxxxz"));

    }

    @Test
    void testToString(){
        Student s1 = new Student("61xxxxxx", "Pong", 30.0);
        assertEquals("{id: '61xxxxxx', name: 'Pong', score: 30.0}",s1.toString());
    }
}