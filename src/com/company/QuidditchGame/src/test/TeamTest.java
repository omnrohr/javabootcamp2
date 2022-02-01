package com.company.QuidditchGame.src.test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.company.QuidditchGame.src.main.models.Team;
import org.junit.Test;

public class TeamTest {
    @Test
    public void hasNullTest() {
        String[] chasers = new String[] {null, "Ginny", "Katie"};
        assertTrue(Team.hasNull(chasers));
    }

    @Test
    public void hasBlankTest() {
        String[] chasers = new String[] {"    ", "Ginny", "Katie"};
        assertTrue(Team.hasBlank(chasers));
    }

}
