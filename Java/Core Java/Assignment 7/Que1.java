/*
    1. Create an interface relational
    interface relational
    {
    void greaterThan();
    void lessThan();
    void greaterThaneq();
    void lessThaneq();
    }
    Write an implementing class implRel which implements realational
    class implRel implements relational
    {
    int a, b;
    implRel(int a,int b)
    {
    this.a=a;
    this.b=b;
    }
    - - -
    }
    Create a class relationdemo (Que1) .In main create an object of implRel (implementing
    class) and invoke all the methods …

*/
interface relational {
    void greaterThan();
    void lessThan();
    void greaterThaneq();
    void lessThaneq();
}

class implRel implements relational {
    int a, b;
    
    implRel(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void greaterThan() {
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else {
            System.out.println(a + " is not greater than " + b);
        }
    }
    
    @Override
    public void lessThan() {
        if (a < b) {
            System.out.println(a + " is less than " + b);
        } else {
            System.out.println(a + " is not less than " + b);
        }
    }
    
    @Override
    public void greaterThaneq() {
        if (a >= b) {
            System.out.println(a + " is greater than or equal to " + b);
        } else {
            System.out.println(a + " is not greater than or equal to " + b);
        }
    }
    
    @Override
    public void lessThaneq() {
        if (a <= b) {
            System.out.println(a + " is less than or equal to " + b);
        } else {
            System.out.println(a + " is not less than or equal to " + b);
        }
    }
}

public class Que1 {
    public static void main(String[] args) {
        // Create an object of implRel
        implRel obj = new implRel(10, 5);
        
        // Invoke the methods
        obj.greaterThan();
        obj.lessThan();
        obj.greaterThaneq();
        obj.lessThaneq();
    }
}

