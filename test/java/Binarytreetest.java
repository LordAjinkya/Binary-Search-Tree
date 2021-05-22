import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Binarytreetest {

    @Test
    public void when_no_isadded_tree_shouldreturn_size3(){
        Binarytree<Integer> binarytree=new Binarytree<>();
        binarytree.add(56);
        binarytree.add(30);
        binarytree.add(70);
        int size =binarytree.getSize();
        Assertions.assertEquals(3,size);
    }


}
