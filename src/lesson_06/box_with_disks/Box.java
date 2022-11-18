package lesson_06.box_with_disks;

public class Box {
    public static void main(String[] args) {

        DiskAudio disk1 = new DiskAudio("Zelenoglazoe taxi", 1994, "Bayarskiy", 3 );
        DiskAudio disk2 = new DiskAudio("2004", 2019, "Skriptonit", 16);

        DiskVideo disk3 = new DiskVideo("Avengers", 2009, "Marvel", "Tarantino", 110);
        DiskVideo disk4 = new DiskVideo("Titanic", 1994, "Mosfilm", "Cameron", 120);

        Disk [] box = new Disk[4];
        box [0] = disk1;
        box [1] = disk2;
        box [2] = disk3;
        box [3] = disk4;

        for (int i = 0; i < box.length; i++) {
            box[i].printAllInfo();
        }
    }
}
