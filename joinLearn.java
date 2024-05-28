
class Threadss extends Thread{
    
    public void run(){
        String name = Thread.currentThread().getName();
        for(int i=1;i<=5;i++)
        {
            System.out.println(name);
        }
    }
}

class joinLearn{
    public static void main(String[] args) {
        
        Threadss obj1 = new Threadss();
        Threadss obj2 = new Threadss();
        Threadss obj3 = new Threadss();

        obj1.setName("Thread 1");
        obj2.setName("Thread 2");
        obj3.setName("Thread 3");

        obj2.start();
        try{
            obj2.join();
        }
        catch(InterruptedException e){
            // System.out.println();
        }

        obj1.start();
        obj3.start();



    }
}

/* #output
 S C:\Users\CASTAR\Desktop\Java Programing> cd "c:\Users\CASTAR\Desktop\Java Programing\" ; if ($?) { javac joinLearn.java } ; if ($?) { java joinLearn }
Thread 2
Thread 2
Thread 2
Thread 2
Thread 2
Thread 1
Thread 1
Thread 1
Thread 3
Thread 3
Thread 3
Thread 3
Thread 3
Thread 1
Thread 1
PS C:\Users\CASTAR\Desktop\Java Programing> cd "c:\Users\CASTAR\Desktop\Java Programing\" ; if ($?) { javac joinLearn.java } ; if ($?) { java joinLearn }
Thread 2
Thread 2
Thread 2
Thread 2
Thread 2
Thread 1
Thread 1
Thread 3
Thread 3
Thread 3
Thread 3
Thread 3
Thread 1
Thread 1
Thread 1
PS C:\Users\CASTAR\Desktop\Java Programing> cd "c:\Users\CASTAR\Desktop\Java Programing\" ; if ($?) { javac joinLearn.java } ; if ($?) { java joinLearn }
Thread 2
Thread 2
Thread 2
Thread 2
Thread 2
Thread 1
Thread 1
Thread 1
Thread 1
Thread 1
Thread 3
Thread 3
Thread 3
Thread 3
Thread 3
PS C:\Users\CASTAR\Desktop\Java Programing> cd "c:\Users\CASTAR\Desktop\Java Programing\" ; if ($?) { javac joinLearn.java } ; if ($?) { java joinLearn }
Thread 2
Thread 2
Thread 2
Thread 2
Thread 2
Thread 1
Thread 1
Thread 1
Thread 1
Thread 1
Thread 3
Thread 3
Thread 3
Thread 3
Thread 3
PS C:\Users\CASTAR\Desktop\Java Programing> 
 */