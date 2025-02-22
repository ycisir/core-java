package VII_object_oriented_programming;

class TestClass {
    final int x=100;
}

public class FinalKeyword {
    public static void main(String[] args) {
        TestClass t=new TestClass();

        //t.x=200; // we cannot change bcoz it is finalFinalKeyword.java

        System.out.println(t.x);
    }
}
