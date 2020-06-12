import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

// Code by Rinse Willet at https://github.com/RinseWillet/Stringfuncties

public class Sound {

    void fietsen() {
        File fiets = new File("res/bell.wav");
        PlaySound(fiets);
    }

    void eten() {
        File mars = new File("res/eat.wav");
        PlaySound(mars);
    }

    void bandPlakker() {
        File pomp = new File("res/pump.wav");
        PlaySound(pomp);
    }

    void crash() {
        File crashen = new File("res/crash.wav");
        PlaySound(crashen);
    }

    static void PlaySound(File Sound) {
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();

            Thread.sleep(clip.getMicrosecondLength()/1000);

        } catch (Exception ignored) {
        }
    }
}