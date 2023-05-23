public class Main {
    public static void main(String[] args) {


        News[] newsArray = new News[3];
        newsArray[0] = new Newspaper("Super info", 20);
        newsArray[1] = new Magazine("Voque", 23);
        newsArray[2] = new Gadjet("Honor X", 1);

        System.out.println(newsArray.toString());
    }
}
