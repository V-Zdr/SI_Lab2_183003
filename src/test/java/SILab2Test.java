import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

class SILab2Test {

    private SILab2 siLab2 = new SILab2();
    private static User user1 ;
    private static User user2 ;
    private static User user3 ;
    private static User user4 ;
    private static User user5 ;
    private static List<String> users;
    private static List<String> users2;

    @BeforeAll
    public static void init() {
        System.out.println("Initializing the expected paramethars ");

        user1 = new User("Vladimir","1234","vzdr@gmail.com");
        user2 = null;
        user3 = new User("Vladimir","1234","vzdr2gmail.com");
        user4 = new User("Vladimir","1234","vzdr@gmail!com");
        user5 = new User("Dimitar","1234","vzdr2gmail!com");

        users = new ArrayList<>(5);
        users2 = new ArrayList<>(5);
    }
    @AfterAll
    public static void destroy() {
        System.out.println("The test terminates");
    }

    @Test
    void EachBranchTest(){
        assertAll(

                () -> assertTrue(siLab2.function(user1, users)),
                () -> assertFalse(siLab2.function(user2, users)),
                () -> assertFalse(siLab2.function(user3, users)),
                () -> assertFalse(siLab2.function(user4, users)),
                () -> assertFalse(siLab2.function(user5, users))
        );
    }
    @Test
    void EachPathTest(){
        assertAll(

                () -> assertTrue(siLab2.function(user1, users)),
                () -> assertFalse(siLab2.function(user2, users)),
                () -> assertFalse(siLab2.function(user3, users)),
                () -> assertFalse(siLab2.function(user4, users)),
                () -> assertFalse(siLab2.function(user5, users))

        );
    }
}