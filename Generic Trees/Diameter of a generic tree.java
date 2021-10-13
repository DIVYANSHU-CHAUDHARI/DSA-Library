//Nothing but a height function and updating the diameter value everytime I get the max and secondmax height of a node.

    static int diameter = 0; 
    public static int height(Node node){
        int maxh = -1;
        int smaxh = -1;
        
        for(Node child:node.children){
            int hofc = height(child);
            if(hofc>maxh){
                smaxh = maxh;
                maxh = hofc;
            }else if(hofc>smaxh){
                smaxh = hofc;
            }
        }
        diameter = Math.max(diameter,maxh+smaxh+2);
        return maxh+1;
    }
