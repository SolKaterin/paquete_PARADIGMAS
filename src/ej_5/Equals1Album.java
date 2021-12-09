package ej_5;
//Ejercicio 5//
import java.util.Objects;
public class Equals1Album {
    private String artista;
    private String titulo;

    public Equals1Album(String artista, String titulo) {
        this.artista = artista;
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public static Equals1Album registrarAlbum(String artista, String titulo) {
        return new Equals1Album(artista, titulo);
    }

    @Override
    public boolean equals(Object obj1) {
        if (this == obj1) return true;
        if (obj1== null || getClass() != obj1.getClass()) return false;
        Equals1Album album = (Equals1Album) obj1;
        return Objects.equals(titulo, album.titulo) && artista == album.artista;
    }

    public static void main(String [] args) {
        Equals1Album un_album = new Equals1Album("un_artista", "un_titulo");
        Equals1Album un_album2 = new Equals1Album("un_artista", "un_titulo");
        //equals: true && ==:false//
        boolean igualIgual = un_album == un_album2;
        boolean equals = un_album.equals(un_album2);
        System.out.println(" ==: " + igualIgual +  " equals: " + equals );
        Equals1Album otro_titulo = new Equals1Album("un_artista", "otro_titulo");
        Equals1Album otro_titulo2 = new Equals1Album("un_artista", "otro_titulo");
        igualIgual = un_album == un_album2;
        equals = un_album.equals(un_album2);
        System.out.println(" ==: " + igualIgual +  " equals: " + equals );
    }

}
