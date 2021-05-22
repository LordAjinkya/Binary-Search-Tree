public class Mybinarynode <K extends Comparable<K>>{
    K key;
    Mybinarynode<K> left;
    Mybinarynode<K> right;

    public Mybinarynode(K key) {
        this.key=key;
        this.left=null;
        this.right=null;
    }
}
