package VII_object_oriented_programming;
class ABC {
    void m1(int a) {
        System.out.println(a);
    }

    void m2(int b) {
        System.out.println(b);
    }
}

class XYZ extends ABC {
    void m1(int a) { //overriding ---> inheritance concept
        System.out.println(a*a);
    }

    void m2(int a, int b) { //overloading ---> polymorphism concept
        System.out.println(a+b);
    }
}


public class OverridingVsOverloading {
    public static void main(String[] args) {
        XYZ xyzobj=new XYZ();
        xyzobj.m1(10);
        xyzobj.m2(10);
        xyzobj.m2(10,20);
    }
}
