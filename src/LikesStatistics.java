public class LikesStatistics {
    public static void main(String[] args) {
        long likesCount = 102;
        int registrationYear = 2015;
        int currentYear = java.time.Year.now().getValue()+1;

        double likesPerYear =(double) likesCount / (currentYear - registrationYear);
        System.out.println(likesPerYear + "likes/year");


    }
}
