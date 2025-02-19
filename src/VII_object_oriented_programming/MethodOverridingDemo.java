package VII_object_oriented_programming;

class Bank {
    double roi() {
        return 0;
    }
}

class AxisBank extends Bank {
    double roi() {
        return 11.5;
    }
}

class UnionBank extends Bank {
    double roi() {
        return 9.5;
    }
}


public class MethodOverridingDemo {
    public static void main(String[] args) {
        AxisBank ax=new AxisBank();
        System.out.println(ax.roi());

        UnionBank ub=new UnionBank();
        System.out.println(ub.roi());
    }
}
