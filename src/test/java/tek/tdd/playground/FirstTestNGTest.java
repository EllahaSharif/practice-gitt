package tek.tdd.playground;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.reporters.XMLConstants;

public class FirstTestNGTest {
    @BeforeMethod
    public void beforMetode() {
        System.out.println("Before");
    }
@AfterMethod
    public void runAfter(){
        System.out.println("After");
}
    @Test
    public void myFirstTest(){
        System.out.println("This is mu first test ");

    }
    @Test
    public void mySecondTest(){
        doit();
        System.out.println("my sencond");
    }
    public void doit(){
        System.out.println("examople");
    }
}
