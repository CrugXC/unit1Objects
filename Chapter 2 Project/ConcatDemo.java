public class ConcatDemo
{
    public static void main(String[] args)
    {
        String animal1 = "quick brown fox ";
        String animal2 = "lazy dog";
        String article = "the ";
        String action = "jumps over ";
        String start = article.concat(animal1);
        String middle = start.concat(action);
        String middle2 = middle.concat(article);
        String done = middle2.concat(animal2);
        System.out.println(done);
    }
}
        