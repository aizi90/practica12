public class Magazine extends News   implements Readable {


    public Magazine(){

    }


    public Magazine(String name,int pages){
        super(name,pages);
    }



    @Override
    public void read() {
        System.out.println("Reading magazine:");

    }
}
