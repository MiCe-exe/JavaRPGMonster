package Abilities;

import Abilities.Attack;
import Monsters.Monster;

/**
 * Name: Michael Cervantes
 * Date: 13 December 2022
 * Explanation: Strategy HW01, working with Interfaces.
 */
public class RangedAttack implements Attack {
    Monster attacker;

    public RangedAttack(Monster attacker) {
        this.attacker = attacker;
    }

    public Integer attack(Monster target){
        String message = attacker + " Uses a ranged attack on " + target;
        System.out.println(message);

        return attacker.getAgi() - target.getAgi();
    }
}
