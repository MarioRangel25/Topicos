package unacalculadora;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Mario
 */
@RunWith(value = Parameterized.class)
public class UnaCalculadoraTest {

    @Parameters
    //Dos formas diferentes de hacer pruebas parametrizadas; creando arrays por separado o por una colección de arrays(Matriz)
    public static Iterable<Object[]> getData() {
        return Arrays.asList(new Object[][]{
            {3, 1, 4}, {4, 5, 9}, {13, 6, 19}
        });
        //        List<Object[]> obj = new ArrayList<>();
        //        obj.add(new Object[]{3, 1, 4});
        //        obj.add(new Object[]{2, 3, 5});
        //        return obj;        
    }

//    public static Collection<Object[]> data() {
//        Object[][] data = new Object[][]{{2, 2, 4}, {2, 3, 5}, {5, 6, 11}};
//        return Arrays.asList(data);
//    }
    UnaCalculadora instance;
    private int a, b, exp;

    public UnaCalculadoraTest(int a, int b, int exp) {
        this.a = a;
        this.b = b;
        this.exp = exp;
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        System.out.println("Before()");
        instance = new UnaCalculadora();
    }

    @After
    public void tearDown() {
        System.out.println("After()");
        instance.limpiar();
    }
    
    /**
     * Test of PRUEBA method, of class UnaTalCalculadora.
     */
//    @Test
//    public void tests() {
//        System.out.println("Probando...TEST");
//        UnaCalculadora instance2 = new UnaCalculadora();
//        //Comparo si los dos objetos son iguales el assertSame es el indicado para comparar objetos.
//        assertSame("¿Son o no iguales los objetos?",instance, instance2);                
//    }

    /**
     * Test of suma method, of class UnaTalCalculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("Suma()");
        int result = instance.suma(a, b);
        assertEquals(exp, result);
        //asserTrue asegura que una condición sea verdadera
        assertTrue("¿Es verdadero?",exp == result);
    }

    /**
     * Test of resta method, of class UnaTalCalculadora.
     */
    @Test
    public void testResta() {
        System.out.println("Resta()");
        int expResult = 5;
        int result = instance.resta(7, 2);
        assertEquals(expResult, result);
        //Todo lo contrario al assertTrue. Este afirma una condición falsa
        assertFalse("¿Es falso?",expResult != result);
        System.out.println("El Resultado es : " + result + ", el esperado es : " + expResult);
    }

    /**
     * Test of agregar method, of class UnaTalCalculadora.
     */
    @Test
    public void testAgregar() {
        System.out.println("Agregar()");
        int add = 4;
        int expResult = 4;
        int result = instance.agregar(add);
        assertEquals("¿Son iguales?",expResult, result);
        System.out.println("El Resultado es : " + result + ", el esperado es : " + expResult);
    }

    /**
     * Test of quitar method, of class UnaTalCalculadora.
     */
    @Test
    public void testQuitar() {
        System.out.println("Quitar()");
        int del = 3;
        int expResult = -3;
        int result = instance.quitar(del);
        assertEquals("¿Son iguales?",expResult, result);
        System.out.println("El Resultado es : " + result + ", el esperado es : " + expResult);
    }

    /**
     * Test of producto method, of class UnaTalCalculadora.
     */
    @Test
    public void testProducto() {
        System.out.println("Producto()");
        int result = instance.producto(4, 3);
        int expResult = 12;
        assertEquals("¿Son iguales?",expResult, result);
        System.out.println("El Resultado es : " + result + ", el esperado es : " + expResult);
    }

    /**
     * Test of dividirEntreCero method, of class UnaTalCalculadora.
     */
    @Test(expected = ArithmeticException.class)
    public void testDividirEntreCero() {
        System.out.println("DividirEntreCero()");
        int result = instance.dividir(4, 0);                
        assertNotNull("¿No es nulo?",result);
    }

    /**
     * Test of dividir method, of class UnaTalCalculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("Dividir()");
        int result = instance.dividir(4, 2);
        int expResult = 2;
        //El assertNotNull indica que el objeto o valor no debe ser nulo.
        assertNotNull("¿No es nulo?",result);
        assertEquals("¿Son iguales?",result, expResult);
        System.out.println("El Resultado es : " + result + ", el esperado es : " + expResult);
    }

    /**
     * Test of limpiar method, of class UnaTalCalculadora.
     */
    @Test
    public void testLimpiar() {
        System.out.println("Limpiar()");
        instance.limpiar();
    }

    /**
     * Test of optimo method, of class UnaTalCalculadora.
     */
    @Test(timeout = 3000)
    public void testOptimo() {
        System.out.println("Optimo()");
        instance.optimo();
    }
}
