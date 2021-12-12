package ej_5.equals_1;

import java.util.Objects;

public class Album {

    private String artista;
    private String titulo;

    public Album(String artista, String titulo) {

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

    public static Album registrarAlbum(String artista, String titulo) {

        return new Album(artista, titulo);

    }

    @Override
    public boolean equals(Object obj1) {
        if (this == obj1) return true;
        if (obj1== null || getClass() != obj1.getClass()) return false;
        Album album = (Album) obj1;
        return Objects.equals(titulo, album.titulo) && artista == album.artista;
    }

    public static void main(String [] args) {

        Album un_album = new Album("un_artista", "un_titulo");
        Album un_album2 = new Album("un_artista", "un_titulo");
        //equals: true && ==:false//
        boolean igualIgual = un_album == un_album2;
        boolean equals = un_album.equals(un_album2);
        System.out.println(" ==: " + igualIgual +  " equals: " + equals );
        Album otro_titulo = new Album("un_artista", "otro_titulo");
        Album otro_titulo2 = new Album("un_artista", "otro_titulo");
        igualIgual = un_album == un_album2;
        equals = un_album.equals(un_album2);
        System.out.println(" ==: " + igualIgual +  " equals: " + equals );

    }

}
