public class Binarytree<K extends Comparable<K>> {
    private Mybinarynode<K> root;

    public void add(K key){
        this.root = this.addRecursive(root,key);
    }

    private Mybinarynode<K> addRecursive(Mybinarynode<K> current,K key){
        if(current == null)
            return new Mybinarynode<>(key);
        int compareResult = key.compareTo(current.key);
        if(compareResult == 0) return current;
        if(compareResult < 0) {
            current.left = addRecursive(current.left, key);
        }else {
            current.right = addRecursive(current.right,key);
        }
        return current;
    }
    //created a public method to get size of the tree
    public int getSize(){
        return this.getSizeRecursive(root);
    }
    //method to get the size continuously
    public int getSizeRecursive(Mybinarynode<K> current){///recursion
        return current == null ? 0 : 1 + this.getSizeRecursive(current.left)
                + this.getSizeRecursive(current.right);
    }
    //boolean to return true if key is at current
    public Boolean search(K key) {
        Mybinarynode current =  searchRecursive(root,key);
        if(key.equals(current.key))
            return true;
        else
            return false;
    }
    //search specific key in tree

    private Mybinarynode<K> searchRecursive(Mybinarynode current, K key) {
        while (current.key != key) {
            int compareResult = key.compareTo((K) current.key);//comparator used to check if key is equal to current key
            if (compareResult == 0)
                return current;
            else if (compareResult < 0)
                current = current.left;
            else
                current = current.right;
        }
        return current;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to binary search tree program");
    }
}
