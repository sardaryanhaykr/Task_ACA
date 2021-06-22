import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hayk on 21.06.2021.
 */
public class TestVideo {
    public static void main(String[] args) {
        Movie movie1=new Movie("Movie1",(int)(Math.random() * 10));
        Movie movie2=new Movie("Movie2",(int)(Math.random() * 10));
        Movie movie3=new Movie("Movie3",(int)(Math.random() * 10));
        Movie movie4=new Movie("Movie4",(int)(Math.random() * 10));
        Movie movie5=new Movie("Movie5",(int)(Math.random() * 10));
        Cartoon cartoon1=new Cartoon("Cartoon1",(int)(Math.random() * 10));
        Cartoon cartoon2=new Cartoon("Cartoon2",(int)(Math.random() * 10));
        Cartoon cartoon3=new Cartoon("Cartoon3",(int)(Math.random() * 10));
        Cartoon cartoon4=new Cartoon("Cartoon4",(int)(Math.random() * 10));
        Cartoon cartoon5=new Cartoon("Cartoon5",(int)(Math.random() * 10));
        Cartoon cartoon6=new Cartoon("Cartoon6",(int)(Math.random() * 10));
        List<Video> videoList=new ArrayList<>();
        videoList.add(movie1);
        videoList.add(movie2);
        videoList.add(movie3);
        videoList.add(movie4);
        videoList.add(movie5);
        videoList.add(cartoon1);
        videoList.add(cartoon2);
        videoList.add(cartoon3);
        videoList.add(cartoon4);
        videoList.add(cartoon5);
        videoList.add(cartoon6);
        int maxRating=0;
        for (Video video:videoList) {
            if(video instanceof Movie && video.getRating()>maxRating){
                maxRating=video.getRating();
            }
        }
        for (Video video:videoList) {
            if(video instanceof Movie && video.getRating()==maxRating){
                System.out.println(video.getTitle());
            }
        }
    }
}
