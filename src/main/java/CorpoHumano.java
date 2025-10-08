package main.java;



public class CorpoHumano {
    // parte dos atributos privados encapsulamento
    private float massa;
    private float volume;
    private float densidade;
    private float altura;

    // parte do construtor
    public CorpoHumano(float massa, float volume, float densidade, float altura) {
        this.massa = massa;
        this.volume = volume;
        this.densidade = densidade;
        this.altura = altura;
    }

    // parte dos getters
    public float getMassa() {
        return massa;
    }

    public float getVolume() {
        return volume;
    }

    public float getDensidade() {
        return densidade;
    }

    public float getAltura() {
        return altura;
    }

    // parte dos setters
    public void setMassa(float massa) {
        this.massa = massa;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public void setDensidade(float densidade) {
        this.densidade = densidade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    // partes do método para calcular o IMC
    public float calcularIMC() {
        return massa / (altura * altura);
    }
}
