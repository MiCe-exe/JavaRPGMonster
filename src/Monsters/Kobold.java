package Monsters; /**
 * Name: Michael Cervantes
 * Date: 29 November 2022
 * Explanation: Strategy HW00, working with Hashmaps and abstract class.
 */
import Abilities.MeleeAttack;
import Abilities.RangedAttack;
import Monsters.Monster;

import java.util.HashMap;

public class Kobold extends Monster {

    public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items){
        super(maxHP, xp, items);

        Integer maxStr = 15;
        Integer maxDef = 6;
        Integer maxAgi = 3;

        attack = new RangedAttack(this);
        str = super.getAttribute(str, maxStr);
        def = super.getAttribute(def, maxDef);
        agi = super.getAttribute(agi, maxAgi);
    }

    @Override
    public String toString(){
        return "Monsters.Kobold has : " + super.toString();
    }
}
