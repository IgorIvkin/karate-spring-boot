package karate.bankproducts;

import com.intuit.karate.junit5.Karate;

public class BankproductsRunner {

    @Karate.Test
    Karate testAll() {
        return Karate.run().relativeTo(getClass());
    }

}
