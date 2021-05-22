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

    //To check size of a tree with 13 numbers
    @Test
    public void return_size_when_numbers_are_added_tothe_tree(){
        Binarytree<Integer> myBinaryTree=new Binarytree<Integer>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(11);
        myBinaryTree.add(60);
        myBinaryTree.add(63);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(67);
        myBinaryTree.add(95);
        myBinaryTree.add(65);
        int size=myBinaryTree.getSize();
        Assertions.assertEquals(13,size);
    }
    //search particular element in the tree
    @Test
    public void returntrue_when_searched_element_retruns_element_from_the_addedelements(){
        Binarytree<Integer> myBinaryTree=new Binarytree<Integer>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(11);
        myBinaryTree.add(60);
        myBinaryTree.add(63);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(67);
        myBinaryTree.add(95);
        myBinaryTree.add(65);
        boolean result = myBinaryTree.search(3);
        Assertions.assertTrue(result);
    }


}
