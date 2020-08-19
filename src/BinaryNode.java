
public class BinaryNode extends UnbalancedTreeMap{
	
	protected OrderedKeyValue keyValue;
	protected BinaryNode leftChild;
	protected BinaryNode rightChild;
	
	public BinaryNode(OrderedKeyValue keyValue) {
		this.keyValue = keyValue;
	}

	public OrderedKeyValue getKeyValue() {
		return keyValue;
	}
	public BinaryNode getLeftChild() {
		return leftChild;
	}
	public BinaryNode getRightChild() {
		return rightChild;
	}

	public void setKeyValue(OrderedKeyValue keyValue) {
		this.keyValue = keyValue;
	}

	public void setLeftChild(BinaryNode leftChild) {
		this.leftChild = leftChild;
	}

	public void setRightChild(BinaryNode rightChild) {
		this.rightChild = rightChild;
	}
	
	
	
	
	
}
