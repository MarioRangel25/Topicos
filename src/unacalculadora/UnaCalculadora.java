package unacalculadora;

/**
 *
 * @author Mario
 */
public class UnaCalculadora {

    private int ans;

    public UnaCalculadora() {
        ans = 0;
    }

    public int suma(int a, int b) {
        ans = a + b;
        return ans;
    }

    public int resta(int a, int b) {
        ans = a - b;
        return ans;
    }

    public int agregar(int add) {
        ans = ans + add;
        return ans;
    }

    public int quitar(int del) {
        ans = ans - del;
        return ans;
    }

    public int producto(int a, int b) {
        ans = a * b;
        return ans;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("¡Imposible dividir entre cero!");
        } else {
            ans = a / b;
        }
        return ans;
    }

    public void limpiar() {
        ans = 0;
    }

    public void optimo() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }
}
