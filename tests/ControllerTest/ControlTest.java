package ControllerTest;
import Model.Hero;
import org.junit.jupiter.api.Test;
import Controller.Driver;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;
public class ControlTest {
    @Test
    void heroToScreenTest() throws SQLException {
        Hero myHero = new Hero("Warrior");
        StringBuilder stats = new StringBuilder();
        stats.append("hit points: ").append(myHero.getHIT_POINTS()).append("\n");
        stats.append("attack speed: ").append(myHero.getATTACK_SPEED()).append("\n");
        stats.append("chance to hit: ").append(myHero.getCHANCE_TO_HIT()).append("\n");
        stats.append("minimum damage: ").append(myHero.getMINIMUM_DAMAGE()).append("\n");
        stats.append("maximum damage: ").append(myHero.getMAXIMUM_DAMAGE()).append("\n");
        stats.append("chance to block: ").append(myHero.getCHANCE_TO_BLOCK_OR_HEAL()).append("\n");
        Driver.heroToScreen("Warrior");
        assertEquals(stats.toString(), Driver.heroToScreen("Warrior").toString());

    }
}
