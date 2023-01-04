package Abilities;

import Abilities.Ability;
import Monsters.Monster;

/**
 * Name: Michael Cervantes
 * Date: 13 December 2022
 * Explanation: Strategy HW01, working with Interfaces.
 */
public interface Attack extends Ability {

    public Integer attack(Monster target);
}

//public interface Attack extends Ability{
//
//    public abstract Integer attack(Monster target);
//}