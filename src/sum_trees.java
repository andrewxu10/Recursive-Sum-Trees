import org.w3c.dom.Node;

public class sum_trees {
	
	public static int count(int numNodes) {
		if(numNodes <= 2) {
			return numNodes;
		} else {
			int sum = 0;
			for(int i = numNodes; i >= 0; i--) {
				int trip = numNodes - 1 - i; //stop when trip > i
				while(trip < i) {
					sum += count(i);
					sum += count(numNodes - i - 1);
				}
			}
			return sum;
		}
	}
	
	public static void main(String[] args){
		
		//count stuff
//		int output = count(4);
//		System.out.println(output);
	}
	
			//my try
//	public static int depthFirstRecursive (Node root) {
//		if(!root.hasLeft()){
//			System.out.println(root);
//			if(root.hasRight()){
//				depthFirstRecursive(root.getRight);
//			}
//		}
//		if(root.hasLeft()) {
//			depthFirstRecursive(root.getLeft);
//		}
//	}
	
	void dftRecursive(node *root) {
		if(!root)
			return;
		print root->val;
		dftRecursive(root->left);
		dftRecursive(root->right);
	}
	
	void depthFirstIterative(node *root) {
		while (node.hasChild) {
			int a = node.pop();
			System.out.println(a);
		}
		if (node.left != null) {
			int b = node.left.pop
		}
	}

}
