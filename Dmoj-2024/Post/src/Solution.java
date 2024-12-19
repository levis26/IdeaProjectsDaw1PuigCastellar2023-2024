//Implementa el constructor de la classe Post.
class Post {
    String user;
    String content;
    int favs;
    int retweets;

    public Post(String user, String content, int favs, int retweets) {
        this.user = user;
        this.content = content;
        this.favs = favs;
        this.retweets = retweets;
    }
}

public class Solution {

    public static void main(String[] args) {
        Post post1 = new Post("@realdonaltrump", "Make America Great Again #MAGA", 10000000, 2000000);
        Post post2 = new Post("@realdonaltrump", "You are fake news", 325646, 5986587);
        Post post3 = new Post("@realdonaltrump", "Global warming is a HOAX", 1000, 200);

        String format = "------------------------------------\n| %-32s |\n| %-32s |\n| <3 %-12d   & %-12d |\n------------------------------------\n";
        System.out.format(format, post1.user, post1.content, post1.retweets, post1.favs);
        System.out.format(format, post2.user, post2.content, post2.retweets, post2.favs);
        System.out.format(format, post3.user, post3.content, post3.retweets, post3.favs);
    }
}