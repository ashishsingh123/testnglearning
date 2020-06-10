package testng.example;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

class DependencyTest
{
    private int param;

    public DependencyTest(int param) {
        this.param = param;
    }

    @Test
    public void testMethodOne() {
        System.out.println("Test method one with param values: " + this.param);
    }

    @Test
    public void testMethodTwo() {
        System.out.println("Test method two with param values: " + this.param);
    }
}

public class SimpleTestFactory
{
    @Factory
    public Object[] factoryMethod()
    {
        return new Object[] { new DependencyTest(1), new DependencyTest(2) };
    }
}