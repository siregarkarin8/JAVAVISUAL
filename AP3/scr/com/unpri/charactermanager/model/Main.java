package scr.com.unpri.charactermanager.model;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        CharacterManager manager = new CharacterManager();

        Character c1 = new Character("Vecna", CharacterType.KNIGHT);
        Character c2 = new Character("Eleven", CharacterType.ASSASSIN, 4);
        Character c3 = new Character("Mike", CharacterType.NECROMANCER, 7);
        Character c4 = new Character("Dustin", CharacterType.KNIGHT, 3);

        // ===== Bagian A =====
        System.out.println("=== A: Tambah karakter ===");
        manager.addCharacter(c1);
        manager.addCharacter(c2);
        manager.addCharacter(c3);
        manager.addCharacter(c4);
        System.out.println("Total di list: " + manager.getTotalCharacters());

        System.out.println("\n=== A3: Tes duplikat ===");
        manager.addCharacter(new Character("eleven", CharacterType.KNIGHT)); // harus ditolak
        System.out.println("Total di list: " + manager.getTotalCharacters());

        System.out.println("\n=== A: findByName & removeCharacter ===");
        System.out.println("Cari 'mike': " + manager.findByName("mike"));
        manager.removeCharacter("Dustin");
        System.out.println("Setelah hapus Dustin: " + manager.getTotalCharacters());

        System.out.println("\n=== A4: getAllCharacters() = salinan ===");
        ArrayList<Character> copy = manager.getAllCharacters();
        System.out.println("Sama dengan list asli (==)? " + (copy == manager.getAllCharacters()));
        copy.clear(); // hapus isi salinan
        System.out.println("Salinan setelah clear: " + copy.size());
        System.out.println("List asli tetap: " + manager.getTotalCharacters());

        // ===== Bagian B =====
        System.out.println("\n=== B: getAverageLevel ===");
        System.out.println("Rata-rata level: " + manager.getAverageLevel());
        System.out.println("Rata-rata list kosong: " + new CharacterManager().getAverageLevel());

        System.out.println("\n=== B: findByType(KNIGHT) ===");
        for (Character c : manager.findByType(CharacterType.KNIGHT)) {
            System.out.println(c);
        }

        // ===== Bagian C =====
        System.out.println("\n=== C: countByType ===");
        System.out.println("Jumlah KNIGHT: " + manager.countByType(CharacterType.KNIGHT));
        System.out.println("Jumlah ASSASSIN: " + manager.countByType(CharacterType.ASSASSIN));
        
        // ===== Bahan Bagian D =====
        System.out.println("\n=== D: Reference ===");
        Character a = new Character("Hopper", CharacterType.KNIGHT, 1);
        Character b = a;
        b.setLevel(8);
        System.out.println("a.getLevel() = " + a.getLevel());
        System.out.println("a == b = " + (a == b));
        System.out.println("Total karakter pernah dibuat: " + Character.getTotalCharacterCreated());
    }
}


        
