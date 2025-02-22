package VII_object_oriented_programming;

final class TestClass4 {
    final void m1() {
        System.out.println("this is method m1 of parent test2 class");
    }
}

//we cant extend Testclass4 bcz its is final
//class TestClass5 extends TestClass2 {

//}

public class FinalKeyword3 {
    public static void main(String[] args) {
        TestClass t=new TestClass();

        //t.x=200; // we cannot change bcoz it is finalFinalKeyword.java

        System.out.println(t.x);
    }
}
