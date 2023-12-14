package org.example;

public class Hanoi {
    public int calcularMovimentos(int discos) {
        // Lógica para calcular o número mínimo de movimentos
        // Implemente o algoritmo de resolução da Torre de Hanói aqui
        return (int) (Math.pow(2, discos) - 1);
    }
}
