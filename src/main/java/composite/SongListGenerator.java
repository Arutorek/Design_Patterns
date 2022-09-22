package composite;

public class SongListGenerator {
    public static void main(String[] args) {
        SongComponent industrialMusic = new SongGroup("Industrial", "1");
        SongComponent rockMusic = new SongGroup("Rock", "2");
        SongComponent dubstepMusic = new SongGroup("Dubstep", "3");

        SongComponent everySong  = new SongGroup("Song List", "Every Song Available");

        everySong.add(industrialMusic);

        industrialMusic.add(new Song("Head Like a Hole", "NIN", 1990));
        industrialMusic.add(new Song("Headhunter", "Front 242", 1988));

        industrialMusic.add(dubstepMusic);

        dubstepMusic.add(new Song("Centipede", "Knife Party", 2021));
        dubstepMusic.add(new Song("Tetris", "Doctor P", 2011));

        everySong.add(rockMusic);

        DiscJockey crazyLarry = new DiscJockey(everySong);

        crazyLarry.getSongList();

    }
}
