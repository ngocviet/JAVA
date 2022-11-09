
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Test {
    public static void main(String[] args) {
        AlbumManagenment test = new AlbumManagenment();
        List<Album> listAlbum = test.initiateAlbumList();
        System.out.print("Bai hat nhieu luot xem nhat la: ");
        System.out.println(test.getMaxViewCount(listAlbum));
        System.out.println("-");
        System.out.print("Bai hat it luot xem nhat la: ");
        System.out.println(test.getMinViewCount(listAlbum));
        System.out.println("-");
        System.out.print("So luong bai hat trong danh sach cac album la: ");
        System.out.println(test.countTracks(listAlbum));
    }
}
