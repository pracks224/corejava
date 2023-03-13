package Tree;

/*Tree DS is a collection of entities called nodes linked together
using edges to represnt hiererachies */
//Terminologies -> Root Node( Node with out any parent)
//Sibling -> shares the same common parent
//Ancestors -> parent and grand parent
//Successor -> Descendents/childerns etc
//What is a Binary tree -> Every node has 0,1 or 2 children (maximum 2 children)
// N node then N-1 edges
//Depth of any node is the number of edges from root to the current node. If depth of a node =d
//then depth of children is d+1
//Height of a node -> Number edges from the farthest leaves; Height of leave nodes is 0

//K-ARY TREE ->  Every node has at max K Tree,Hence Binary tree is 2-ARY tree
/*
1>Proper Binary Tree / Full Binary Tree  -> Every node has 0 0r 2 children
2>Complete Binary Tree : Every level is compltely filled except the last level .
                         If the last level is not complete and then all the nodes possible as left as possible.
3>Perfect Binary Tree  : All the levels has to be completly filled
                          Every node except the leaf node has 2 childs
Height of Tree = log base 2 (n+1) -1
Tree with 15 nodes ,then height is log base 2 2 pow 4 -1 = log22pow4 -1 = 4-1 =3

Traversal of Tree -> why there are differnt type of traversal? Differnet has differnt purpose
---------------------
Pre Order -> root left right
In Order  -> left root right
Post Order-> left right root
//Count the number of nodes of tree ->
        Solutions 1 ->Have a global counter,then traversala and increase it.
        Solutions 2 ->

----- **** ----- **** ---------
BST
IN ORDER TRAVERSAL ALWAYS SORTED

Number of leave nodes in a complete binaray tree -->  (N+1)/2i
 */


import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

public class TreeBasics {
    public static void main(String[] args) {
      int[] nums = {4,3,2};
     // Arrays.sort(nums, Comparator.reverseOrder());
    }
}
