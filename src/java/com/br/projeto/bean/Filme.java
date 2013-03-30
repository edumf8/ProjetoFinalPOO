package com.br.projeto.bean;

/**
 * Tipo especial de Video que representa um filme.
 * A única característica que o diferencia é ter um trailer.
 * @author Neusa
 */
public class Filme extends Video {

    private String urlTrailer;

    public String getUrlTrailer() {
        return urlTrailer;
    }

    public void setUrlTrailer(String urlTrailer) {
        this.urlTrailer = urlTrailer;
    }
}