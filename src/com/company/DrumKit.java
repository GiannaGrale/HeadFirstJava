package com.company;

public class DrumKit {
    boolean topHat = true;
    boolean snare = true;

    void playSnare() {
        System.out.println("bach bach ba-bach");
    }

    void playTopHat() {
        System.out.println("din-din -di-din'");
    }

    static class DrumKitTestDrive {
        public static void main(String[] args) {
            DrumKit d = new DrumKit();
            d.snare = false;
            d.playSnare();
            d.playTopHat();

            if (d.snare == true) {
                d.playSnare();
            }
        }
    }
}
