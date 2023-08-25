package aed;

class Funciones {
    int cuadrado(int x) {
        int res = x*x;
        return res;
    }

    double distancia(double x, double y) {
        double res = Math.sqrt(x*x+y*y);
        return res;
    }

    boolean esPar(int n) {
        boolean res = false;
        if(n % 2 == 0){
            res = true;
        }
        return res;
    }

    boolean esBisiesto(int n) {
        boolean res = false;
        if (n % 4 == 0){
            res = true;
        } if (n % 100 == 0){
            res = false;
        } if (n % 400 == 0){
            res = true;
        }
        return res;
    }

    int factorialIterativo(int n) {
        int res;
        if (n == 0){
            res = 1;
        } else {
            res = 1;
            for(int i = 1; i <= n ;i++){
            res = res*i;
        }
        }
        return res;
    }

    int factorialRecursivo(int n) {
        int res;
        if (n == 0 || n == 1){
            res = 1;
        } else {
            res = n * factorialIterativo(n-1);
        }
        return res;
    }

    boolean esPrimo(int n) {
        boolean res = true;
        if (n == 0 || n == 1){
            res = false;
        }
        for(int i = 2; i < n; i++){
            if (n % i == 0){
                res = false;
            }
        }
        return res;
    }

    int sumatoria(int[] numeros) {
        int res = 0;
        for(int i = 0;i < numeros.length; i++){
            res = res + numeros[i];
        }
        return res;
    }

    int busqueda(int[] numeros, int buscado) {
        int res = 0;
        for(int i = 0; i < numeros.length; i++){
            if (numeros[i] == buscado){
                res = i;
            }
        }
        return res;
    }

    boolean tienePrimo(int[] numeros) {
        boolean res = false;
        for(int i = 0; i < numeros.length; i++){
            if (esPrimo(numeros[i])){
                res = true;
            }
        }
        return res;
    }

    boolean todosPares(int[] numeros) {
        // COMPLETAR
        return false;
    }

    boolean esPrefijo(String s1, String s2) {
        // COMPLETAR
        return false;
    }

    boolean esSufijo(String s1, String s2) {
        // COMPLETAR
        return false;
    }
}
