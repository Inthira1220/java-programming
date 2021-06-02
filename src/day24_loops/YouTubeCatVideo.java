package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {

//        "starting: World's smallest cat 🐈- BBC"
//        int seconds = 0
//        video is 1 min 57 seconds
//        while we did not reach to last second
//        print " Watching YouTube video: second: 1"
//        print "Finished watching Cat video, lets start another one"

        System.out.println("starting: World's smallest cat \uD83D\uDC08- BBC");
        int seconds = 0;

        while (seconds <= 117) {
            System.out.println("Watching YouTube video: second: "+ seconds);
            seconds++;
            Thread.sleep(1000);
        }
        System.out.println("Finished watching the \uD83D\uDC08 video");
        System.out.println("Lets start another one!");

//        int minutes = seconds / 60;
//        int remainingSec = seconds % 60;
//        System.out.println("we saw video about cat for " + minutes + ":" + remainingSec);

    }
}
