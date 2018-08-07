import com.kokoloko.coffee.beans.Bean;
import com.kokoloko.coffee.beans.Yirgacheffe;
import com.kokoloko.machine.Roaster.RoastMachine;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoastMachineTest {
    @Test
    public void testRoastMachine_lightRoast() {
        Bean yirgacheffe = new Yirgacheffe();
        RoastMachine rm = new RoastMachine(yirgacheffe);
        for(int i = 0; i < 24; i++) {
            rm.roast();
        }
        assertEquals("Light Roast", rm.getBean().getRoastType());

        for(int i = 0; i < 5; i++) {
            rm.roast();
        }
        assertEquals("Medium Roast", rm.getBean().getRoastType());

        for(int i = 0; i < 5; i++) {
            rm.roast();
        }
        assertEquals("Medium Roast", rm.getBean().getRoastType());

        for(int i = 0; i < 24; i++) {
            rm.roast();
        }
        assertEquals("Medium Dark Roast", rm.getBean().getRoastType());

        for(int i = 0; i < 20; i++) {
            rm.roast();
        }
        assertEquals("Dark Roast", rm.getBean().getRoastType());
    }
}
