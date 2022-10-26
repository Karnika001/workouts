package Abstractclass;

abstract class absrtct{
    abstract void run();
}
class Honda4 extends absrtct{
    void run(){System.out.println("running safely");}
    public static void main(String args[]){
        absrtct obj = new Honda4();
        obj.run();
    }
}
