
class A extends Thread{


    public void run(){
        System.out.println("Thread is Created Successfully");

    }

}




class learnThreading{
    public static void main(String[] args) {
        
        A obj = new A();
        obj.start();



    }
}