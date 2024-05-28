
class T1 extends Thread{
    public void run()
    {
        System.out.println("Thread T1 is created");
        for(int i=1;i<=4;i++)
        {
            System.out.println("T1 : "+i);
        }
    }
}

class T2 extends Thread{
    public void run()
    {
        try{
                System.out.println("Thread T2 is created");
                for(int i=1;i<=4;i++)
                {
                    System.out.println("T2 : "+i);
                    sleep(1000);

                }
                
        }
        catch(InterruptedException e){
            System.out.println("Interrupt Get Handled");
        }
        
    }
}


class prioritylearn{
    public static void main(String[] args) {
        
        T1 obj1 = new T1();
        System.out.println("Priority : "+obj1.getPriority());
        obj1.start();
        
        

        T2 obj2 = new T2();
        obj2.setPriority(10);
        obj2.start();






    }
}