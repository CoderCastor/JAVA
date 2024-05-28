
interface Home{

    void wall();

}

interface Room extends Home{
    void bed();
}

class myhouse implements Room{


    public void wall(){
        System.out.println();
    }

    public void bed(){
        System.out.println();
    }
}

class extendInterfaces{
    public static void main(String[] args) {
        System.out.println("Running Smoothly");
    }
}
