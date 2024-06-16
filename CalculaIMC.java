package ado3_calculadora_imc;

public class CalculaIMC {
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String categorizarIMC(double imc) {
        if (imc < 18.5) {
            return "Baixo peso";
        } else if (imc < 24.9) {
            return "Peso adequado";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}