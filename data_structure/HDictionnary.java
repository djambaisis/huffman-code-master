package data_structure;

import javafx.util.Pair;
import java.util.HashMap;

public class HDictionnary
{
	Map<char,String> dict=new HashMap<>();
	public void push(char key,String value)
	{
		dict.put(key,value);
	}
	public String getCode(char)
	{
		dic.get(char);
	}
	public void hydrate(HNode currNode)
    {
    	infixed("",currNode);
    }

	private void infixed()
	{
		if(currNode.isLeaf()) dic.put(currNode.getChar(),code);
    	if(currNode.hasLeftChild()) infixed(code+"0",currNode.getLeftChild());
    	if(currNode.hasRightChild()) infixed(code+"1",)    	
	}
}