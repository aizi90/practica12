public class Gadjet extends News  implements Readable {


    public Gadjet(){

    }
    public Gadjet(String name,int pages){
        super(name,pages);
    }

    @Override
    public void read() {
        System.out.println("Gadjet can readable: ");

    }
}
