// A utility function swap left- node & right node of tree
// of every k'th level

static void swapEveryKLevel(Node root, int k)
{
    // call swapEveryKLevelUtil function with
    // initial level as 1.
    swapEveryKLevelUtil(root, 1, k);
}

static void swapEveryKLevelUtil( Node root, int level, int k)
{
    // base case
    if (root== null ||
            (root.left==null && root.right==null) )
        return ;
 
    //if current level + 1 is present in swap vector
    //then we swap left & right node
    if ( (level + 1) % k == 0)
        {
            Node temp=root.left;
            root.left=root.right;
            root.right=temp;
        }
 
    // Recur for left and right subtrees
    swapEveryKLevelUtil(root.left, level+1, k);
    swapEveryKLevelUtil(root.right, level+1, k);
}
