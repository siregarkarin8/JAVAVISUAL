package scr.com.unpri.charactermanager.model;
import java.util.ArrayList;
public class CharacterManager {
     private ArrayList<Character> characters = new ArrayList<>();

    // Bagian A — Core method
    public void addCharacter(Character c) {
        if (!characters.contains(c)) {
            characters.add(c);
        } else {
            System.out.println("Duplikat nama ditolak: " + c.getName());
        }
    }

    public Character findByName(String name) {
        for (Character c : characters) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }

    public void removeCharacter(String name) {
        Character target = findByName(name);
        if (target != null) {
            characters.remove(target);
        }
    }

    public int getTotalCharacters() {
        return characters.size();
    }

    public ArrayList<Character> getAllCharacters() {
        return new ArrayList<>(characters);
    }

    // Bagian B — Mini-Challenge
    public double getAverageLevel() {
        if (characters.isEmpty()) {
            return 0;
        }
        int total = 0;
        for (Character c : characters) {
            total += c.getLevel();
        }
        return (double) total / characters.size();
    }

    public ArrayList<Character> findByType(CharacterType type) {
        ArrayList<Character> result = new ArrayList<>();
        for (Character c : characters) {
            if (c.getType() == type) {
                result.add(c);
            }
        }
        return result;
    }

    // Bagian C — Fitur Analitik Rancangan Sendiri
/**
 * Menghitung jumlah karakter dengan tipe tertentu.
 * @param type tipe karakter yang dicari
 * @return jumlah karakter dengan tipe tersebut
 */
public int countByType(CharacterType type) {
    int count = 0;
    for (Character c : characters) {
        if (c.getType() == type) {
            count++;
        }
    }
    return count;
}

}

    

