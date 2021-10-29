import org.junit.jupiter.api.Test;

import static com.company.Main.arrayAfterLastNumber;
import static com.company.Main.onlyOneOrFour;
import static org.junit.jupiter.api.Assertions.*;

public class test_class {
    @Test
    public void TestArrayAfterLastNumber1 (){
        int [] in = {5, 15, 8, 4, 99};
        int [] out ={99};
        assertArrayEquals(out, arrayAfterLastNumber(in));
    }
    @Test
    public void TestArrayAfterLastNumber2 (){
        int [] in = {5, 15, 8, 4, 99, 15, 12};
        int [] out ={99, 15, 12};
        assertArrayEquals(out, arrayAfterLastNumber(in));
    }
    @Test
    public void TestArrayAfterLastNumber3 (){
        int [] in = {5, 15, 8, 1, 99};
        assertThrows(RuntimeException.class,()->{arrayAfterLastNumber(in);});
    }
    @Test
    public void TestArrayAfterLastNumber4 (){
        int [] in = {5, 15, 8, 4};
        int [] out ={};
        assertArrayEquals(out, arrayAfterLastNumber(in));
    }
    @Test
    public void TestOnlyOneOrFour1 (){
        int [] in = {1, 1, 1, 1, 1};
        assertFalse(onlyOneOrFour(in));
    }
    @Test
    public void TestOnlyOneOrFour2 (){
        int [] in = {1, 1, 1, 4, 1};
        assertTrue(onlyOneOrFour(in));
    }
    @Test
    public void TestOnlyOneOrFour3 (){
        int [] in5 = {1, 4, 1, 12, 1};
        assertFalse(onlyOneOrFour(in5));
    }
}
