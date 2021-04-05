#Recursive approach

#TC:O(n)
#SC:O(n)

    def height(self, root):
        if root == None:return 0
        return 1+max(self.height(root.left),self.height(root.right))
 
#Iterative approach
#TC:O(n)
#SC:O(n)
    def maxDepth(self, root):
        if  root == None:
            return 0
        queue = [root]
        height =0
        while queue!=[]:

            size = len(queue)
            height+=1
            for i in range(size):
                node = queue.pop(0)

                if node.left :
                    queue.append(node.left)
                if node.right :
                    queue.append(node.right)
        return height

        
