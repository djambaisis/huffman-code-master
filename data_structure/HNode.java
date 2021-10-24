package data_structure;

public class HNode
{
    char x;
    long occ;
    HNode leftChild,rightChild;
	public HNode()
	{
		leftChild=null;
		rightChild=null;
	}
	HNode(char x,long occr)
    {
        this.x=x;
        this.occ=occ;
    }
	public HNode getLeftChild()
    {
    	return leftChild;
    }
    public HNode getRightChild()
    {
    	return rightChild;
    }
    public void setLeftChild(HNode left)
    {
    	leftChild=left;
    }
    public void setRightChild(HNode right)
    {
    	rightChild=right;
    }
    
    public char getChar()
    {
    	return x;
    }
    public long getOcc()
    {
    	return occ;
    }
   
    public HNode makeParentWith(HNode node)
    {
    	HNode newNode=new HNode(' ',this.occ+node.getOcc());
    	newNode.setLeftChild(this);
    	newNode.setRightChild(node);
    	return newNode;
    }
    public Boolean hasLeftChild()
    {
    	return leftChild!=null;
    } 
    public Boolean hasRightChild()
    {
    	return rightChild!=null;
    }

    boolean isLeaf() {
        return !(hasRightChild() && hasLeftChild());
    }


}
