package Monsters; /**
 * Name: Michael Cervantes
 * Date: 29 November 2022
 * Explanation: Strategy HW00, working with Hashmaps and abstract class.
 */
import Abilities.Attack;

import java.util.HashMap;
import java.util.Random;

public abstract class Monster {
    private Integer hp;
    private Integer xp = 10;
    private Integer maxHP;
    private HashMap<String, Integer> items;

    //new fields
    Integer agi = 10;
    Integer def = 10;
    Integer str = 10;
    Attack attack;

    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    public Integer getMaxHP() {
        return maxHP;
    }

    public Integer getAgi() {
        return agi;
    }

    public Integer getDef() {
        return def;
    }

    public Integer getStr() {
        return str;
    }

    Integer getAttribute(Integer min, Integer max){
        Random rand = new Random();
        if(min > max){
            Integer temp = min;
            min = max;
            max = temp;
        }

        return rand.nextInt(max-min) + min;
    }

    boolean takeDamge(Integer damage){

        if(damage > 0){
            this.hp -= damage;
            System.out.println("The creature was hit for " + damage + " damage");
        }

        if(this.hp <= 0){
            System.out.println("Oh no! The creature has perished");
            System.out.println(this.toString());
            return false;
        }else {
            System.out.println(this.toString());
            return true;
        }
    }

    public Integer attackTarget(Monster target){
        Integer dmg;

        dmg = this.attack.attack(target);

        if(this.hp > 0){
            target.takeDamge(dmg);
        }else {
            System.out.println(target.toString());
        }


        return dmg;
    }

    @Override
    public String toString() {
        return "hp=" + hp + "/" + maxHP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Monster monster = (Monster) o;

        if (getHp() != null ? !getHp().equals(monster.getHp()) : monster.getHp() != null) return false;
        if (getXp() != null ? !getXp().equals(monster.getXp()) : monster.getXp() != null) return false;
        if (getMaxHP() != null ? !getMaxHP().equals(monster.getMaxHP()) : monster.getMaxHP() != null) return false;
        return getItems() != null ? getItems().equals(monster.getItems()) : monster.getItems() == null;
    }

    @Override
    public int hashCode() {
        int result = getHp() != null ? getHp().hashCode() : 0;
        result = 31 * result + (getXp() != null ? getXp().hashCode() : 0);
        result = 31 * result + (getMaxHP() != null ? getMaxHP().hashCode() : 0);
        result = 31 * result + (getItems() != null ? getItems().hashCode() : 0);
        return result;
    }
}
