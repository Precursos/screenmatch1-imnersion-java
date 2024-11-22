package modelo;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporadas;
    private int duracionMinutosEpisodio;

    @Override
    public int getTiempoDuracionMinutos() {
        return duracionMinutosEpisodio * episodiosPorTemporadas * temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }

    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }


    public int getDuracionMinutosEpisodio() {
        return duracionMinutosEpisodio;
    }

    public void setDuracionMinutosEpisodio(int duracionMinutosEpisodio) {
        this.duracionMinutosEpisodio = duracionMinutosEpisodio;
    }
}
