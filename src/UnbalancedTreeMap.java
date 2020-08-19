import java.util.Stack;

public class UnbalancedTreeMap {

	BinaryNode root;
	
	public UnbalancedTreeMap()
	{
		this.root = null;
	}
	
	public int get(String key)
	{		
	
		if(root == null) return 0;
		return search(root, key).keyValue.getKey() == key ? 
				search(root, key).keyValue.getValue() : 0;
	}
	
	private BinaryNode search(BinaryNode node, String key)
	{
		if(node.keyValue.compareTo(key) < 0 && node.leftChild != null) 
			return search(node.leftChild, key);
		
		if(node.keyValue.compareTo(key) > 0 && node.rightChild != null) 
			return search(node.rightChild, key);

		return node;
	}
	
	public int put(String key, int value)
	{
		OrderedKeyValue keyVal = new OrderedKeyValue(key, value);
		
		if(root == null) 
			root = new BinaryNode(keyVal);
		
		return insert(root, key, value).keyValue.getValue();

	}
	
	private BinaryNode insert(BinaryNode node, String key, int value)
	{
		BinaryNode cur = node;
        if(node == null) {
            node = new BinaryNode(new OrderedKeyValue(key, value));
            return node;
        }
        while(true) {
            if(node.keyValue.compareTo(key) > 0 && 
            		cur.rightChild != null) cur = cur.rightChild;
            else if(node.keyValue.compareTo(key) < 0 && 
            		cur.leftChild != null) cur = cur.leftChild;
            else{
                if(node.keyValue.compareTo(key) > 0) cur.rightChild = 
                		new BinaryNode(new OrderedKeyValue(key, value));
                else cur.leftChild = new BinaryNode(new OrderedKeyValue(key, value));
                return node;
            }
        }
		
	}
	
//	private int height(BinaryNode root) 
//	    { 
//	        if (root == null) 
//	           return 0; 
//	        else
//	        { 
//	            /* compute  height of each subtree */
//	            int lheight = height(root.leftChild); 
//	            int rheight = height(root.rightChild); 
//	              
//	            /* use the larger one */
//	            if (lheight > rheight) 
//	                return(lheight+1); 
//	            else return(rheight+1);  
//	        } 
//	    }
//	void printLevelOrder() 
//    { 
//        int h = height(root); 
//        int i; 
//        for (i=1; i<=h; i++) 
//            printGivenLevel(root, i); 
//    } 
//	
//	void printGivenLevel (BinaryNode root ,int level) 
//    { 
//        if (root == null) 
//            return ; 
//        if (level == 1) 
//            System.out.println("print: " + root.getKeyValue().getKey() + " "); 
//        else if (level > 1) 
//        { 
//        	printGivenLevel(root.leftChild, level-1); 
//        	printGivenLevel(root.rightChild, level-1); 
//        } 
//        
//    }
//	
	public String[] keySet()
	{

//		List < Integer > res = new ArrayList < > ();
		int i = 0;
		String[] res = new String[72];
        Stack < BinaryNode > stack = new Stack < > ();
        BinaryNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.leftChild;
            }
            curr = stack.pop();
//            res.add(curr.keyValue);
            res[i] = curr.keyValue.getKey();
            i++;
            curr = curr.rightChild;
        }
        return res;
        
	}
}
