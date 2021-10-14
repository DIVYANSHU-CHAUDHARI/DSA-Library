//Update the path and sum while going from root to leaf path.
//Whichever path gives sum in range,that path is printed and returned

public static void pathToLeafFromRoot(Node node, String psf, int sumSoFar, int lo, int hi){
    if(node==null)return;
    psf+=node.data+" ";
    sumSoFar+=node.data;
    if(node.left==null && node.right==null){
        if(sumSoFar>=lo && sumSoFar<=hi)System.out.println(psf);
        return;
    }
    pathToLeafFromRoot(node.left,psf,sumSoFar,lo,hi);
    pathToLeafFromRoot(node.right,psf,sumSoFar,lo,hi);
  }
