package com.Filme;

public class Filme {

    private String titulo;
    private String diretor;
    private int ano;

    // Construtor com parâmetros
    public Filme(String titulo, String diretor, int ano) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.ano = ano;
    }

    // Construtor padrão
    public Filme() {
        this.titulo = "Teste";
        this.diretor = "Teste";
        this.ano = 2009;
    }

    // Método específico
    public void resultado() {
        System.out.println("Filme: " + titulo + "  Diretor: " + diretor + "  Ano: " + ano);
    }

    // ===== GETTERS =====

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getAno() {
        return ano;
    }

    // ===== SETTERS =====

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // ===== toString =====

    @Override
    public String toString() {
        return "Filme{" + "titulo='" + titulo + '\'' + ", diretor='" + diretor + '\'' + ", ano=" + ano + '}';
    }
}