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

    public int getSize(){
        return this.getSizeRecursive(root);
    }

    public int getSizeRecursive(Mybinarynode<K> current){
        return current == null ? 0 : 1 + this.getSizeRecursive(current.left)
                + this.getSizeRecursive(current.right);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to binary search tree program");
    }
}
