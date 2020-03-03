package oop.MusicApp;

public class MusicAppRunner {
    public static void main(String[] args) {
        User user1 = new User("Kira");
        Playlist PL1 = user1.createPlaylist("PL1");
        Playlist PL2 = user1.createPlaylist("PL2");

        byte[] content = new byte[10];
        Song song1 = new Song("title1", "author1", "genre1", 12, new AudioContent(content));
        Song song2 = new Song("title2", "author1", "genre2", 13, new AudioContent(content));
        Song song3 = new Song("title3", "author3", "genre3", 12, new AudioContent(content));

        user1.addSongToPlaylist("PL1", song1);
        user1.addSongToPlaylist("PL1", song2);
        user1.addSongToPlaylist("PL2", song3);


        System.out.println(user1.findByTitle("PL1"));  //result PL1
        System.out.println("Author search " + PL1.findByAuthor("author1"));    //result song1 song2
        System.out.println("Total length serach " + PL1.getTotalLength());  //result 25
        System.out.println(PL1.findByTitlePart("TITLE1")); // result song1

    }
}
