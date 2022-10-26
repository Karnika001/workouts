package InnerClass;


class My_class{
    private int data=30;
    class Inner{
        void msg(){System.out.println("data is "+data);}
    }
    public static void main(String args[]){
        My_class obj=new My_class();
        My_class.Inner in=obj.new Inner();
        in.msg();
    }
}
