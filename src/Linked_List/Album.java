package Linked_List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean AddSongs(String title,double duration){
        if (findSong(title)==null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    public Song findSong(String title){
        for (Song checkedSong: this.songs){
            if (checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }

    public boolean AddToPlaylist(int trackNumber,LinkedList<Song>Playlist){
        //track will be entered as 1,2,3.........
        int index = trackNumber - 1;
        if((index>=0) && (index <=this.songs.size())){
            Playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album doesn't have "+trackNumber+" tracks");
        return false;
    }

    public boolean AddToPlaylist(String title,LinkedList<Song>Playlist){
        Song checkedSong = findSong(title);
        if(checkedSong!=null){
            System.out.println("Song is being added ..........");
            Playlist.add(checkedSong);
            return true;
        }

        System.out.println("Song: "+title+"not found");
        return false;
    }

}
