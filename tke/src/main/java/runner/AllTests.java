package runner;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import tests.CartPageTest;
import tests.LoginTest;
import tests.RegisterTest;
import utils.Browsers;

@RunWith(Suite.class)
@Suite.SuiteClasses({RegisterTest.class, LoginTest.class, CartPageTest.class})
public class AllTests {

   @BeforeClass
    public static void onSetUp() {
        System.out.println("Inicializando o driver...");
        Browsers.initializeDriver();
    }

   @AfterClass
    public static void onTearDown() {
        System.out.println("Eliminando o driver...");
        Browsers.finishDriver();
    }
}
