package InnerClass;

class Outer {
    void outerMethod() {
        final int x=98;
        System.out.println("inside outerMethod");
        class Inner {
            void innerMethod() {
                System.out.println("x = "+x);
            }
        }
        Inner y = new Inner();
        y.innerMethod();
    }
}
class methodlocal {
    public static void main(String[] args){
        Outer x = new Outer();
        x.outerMethod();
    }
}
