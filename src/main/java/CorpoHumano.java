package main.java;

public class CorpoHumano {
    private float massa; // Aqui não alterou nada mas esse tipo de public é errado usar
    private float densidade;
    private float volume;
    private double altura;
    private double peso;
    private double IMC;

    public CorpoHumano(float massa, float volume, double peso, double altura) {
        this.massa = massa;
        this.volume = volume;
        this.peso = peso;
        this.altura = altura;
        IMC = peso / (altura * altura);

        densidade = massa / volume;
    }

    public float GetMassa() {
        return massa;
    }

    public float GetVolume() {
        return volume;
    }

    public float GetDensidade() {
        return densidade;
    }

    public double GetAltura() {
        return altura;
    }

    public double GetPeso(){
        return peso;
    }

    public double GetImc() {
        return IMC;
    }

    public void SetMassa(float massa) {
        this.massa = massa;
        densidade = massa/volume;
    }

    public void SetVolume( float volume) { // O Metodo volume do Corpo Humano nunca foi usado localmente 
        this.volume = volume;
        densidade = massa / volume;
    }

    public void SetAltura(double altura) {
        this.altura = altura;
        IMC = peso / (altura * altura);
    }

    public void SetPeso(double peso) {
        this.peso = peso;
        IMC = peso / (altura * altura);
    }
}
