package uaslp.ingenieria.exams;

import java.io.File;
import java.util.Iterator;
import java.util.List;

public class Song {
    private List<Nota> notas;

    public Song(File file) {
        readSong(file);
    }

    private void readSong(File file){
        // Este método lee del archivo la canción y guarda la secuencia de notas en la lista notas

        // No es necesario que se implemente.

    }

    public Iterator<Nota> getSongIterator(){
        return notas.listIterator();
    }
}
