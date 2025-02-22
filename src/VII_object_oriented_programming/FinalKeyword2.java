package VII_object_oriented_programming;

class TestClass2 {
    final void m1() {
        System.out.println("this is method m1 of parent test2 class");
    }
}

class TestClass3 extends TestClass2 {
//    void m1() {
        // we cant override m1 method bcz its is final
//    }
}

public class FinalKeyword2 {
    public static void main(String[] args) {
        TestClass t=new TestClass();

        //t.x=200; // we cannot change bcoz it is finalFinalKeyword.java

        System.out.println(t.x);
    }
}
