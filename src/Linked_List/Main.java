package Linked_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    private static ArrayList<Album>albums = new ArrayList<Album>();
    public static void main(String[] args) {
        Album album = new Album("NightChanges","One-Direction");
        album.AddSongs("La La La",10.3);
        album.AddSongs("Waka Waka Waka",5.5);
        album.AddSongs("ba ba ba",6.1);
        album.AddSongs("hey siri",2.4);
        album.AddSongs("uu uu uu",8.1);

        albums.add(album);

        Album modifyalbum = new Album("Punjabi","Punjab Singer");
        modifyalbum.AddSongs("qqqq",10.9);
        modifyalbum.AddSongs("qeeq",1.9);
        modifyalbum.AddSongs("qds",10.9);
        modifyalbum.AddSongs("qwd",10.9);
        albums.add(modifyalbum);

        LinkedList<Song>Playlist = new LinkedList<Song>();
        albums.get(0).AddToPlaylist("La La La",Playlist);
        albums.get(0).AddToPlaylist("hey siri",Playlist);
        albums.get(0).AddToPlaylist("aaaaa",Playlist); //Doesn't exist
        albums.get(0).AddToPlaylist(1,Playlist);
        albums.get(0).AddToPlaylist(3,Playlist);
        albums.get(0).AddToPlaylist(22,Playlist); //Doesn't exist
        play(Playlist);
    }
    private static void play(LinkedList<Song>playlist){
        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0){
            System.out.println("No Song in Playlist");
            return;
        }else{
            System.out.println("Now Playing"+listIterator.next().toString());

        }

    }
}
