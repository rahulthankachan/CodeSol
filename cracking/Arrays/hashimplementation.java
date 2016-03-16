
public class TestPad {

    public static void main(String[] args) {


        HashMap myH = new HashMap();

        myH.put(2, 4);
        myH.put(5, 95);

        System.out.println("The value for the Hash map is " + myH.get(2));
        System.out.println("The value for the Hash map is " + myH.get(5));



    }
}


class HashMap {


    private HashEntry[] map;
    public static final int MAX = 3;

    public HashMap() {
        map = new HashEntry[MAX];

    }

    public void put(int key, int value) {
        HashEntry temp = new HashEntry(key, value);
        int hash = key % MAX;
        System.out.println("The hashed value is " + hash);
        int counter = 0;
        while (map[hash] != null && counter != MAX) {
            hash += 1;
            counter += 1;
        if (hash == MAX) {
                hash = 0;
            }
        }



        if (hash <= MAX) {
            map[hash] = temp;
        }


    }

    public int get(int key) {
        int value = -1;
        int hash = key % MAX;
        int counter = 0;
        System.out.println("The hashed value is " + hash);
        while (map[hash] != null && counter != MAX) {
            HashEntry temp = map[hash];
            if (temp.key == key) {
                return temp.value;
            }
            hash += 1;
            if (hash == MAX) {
                hash = 0;
            }
            counter += 1;
        }

        return -1;

    }



}


class HashEntry {
    int key;
    int value;

    public HashEntry(int key, int value) {
        this.key = key;
        this.value = value;
    }


}



/*


1. Create a Hash entry
2. In tje Hash map - > put function
3. - have a get Function


*/

