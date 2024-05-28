class animal{
    int height,weight;

    void eat(){
        System.out.println("\nAnimal is eating");
    }

    void display(){
        System.out.println("\nHeight : "+height+" | "+"Weight : "+weight+"\n");
    }

    //Default Constructuor
    animal(){
        this.height = 0;
        this.weight=0;
    }

    //Parametarised Constructor
    animal(int height,int weight)
    {
        this.height = height;
        this.weight = weight;
    }

    //Copy Constructor
    animal(animal reference){

        height = reference.height+1;
        weight = reference.weight+1;

    }


}




class classes
{   
    public static void main(String[] args) {

        animal a1=new animal();
        a1.display();

        animal a2 = new animal(23,43);
        a2.display();

        animal a3 = new animal(a2);
        a3.display();

    }
}