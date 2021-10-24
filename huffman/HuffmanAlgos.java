package huffman;
import data_structure.*;


public abstract class HuffmanAlgo
{
	String urlFile='',fileContent='';
	HPriorityQueue priorityQueue=new HPriorityQueue();
	HDictionnary dictionnary=new HDictionnary();

	HNode huffmanTree=null;
	public readFile()
	{

	}
	public makeOccurence(String fcontent)
	{
		int[] occTab=new int[256];
		for(int i=0;i<256;i++) occTab[i]=0;
		for (int i=0; i<fcontent; ) {
			occTab[(int)fcontent[i]]++;
		}
		for (int i=0;i<256;i++ ) {
			if(occTab[i]>0) priorityQueue.push(new HNode((char)i,occTab[i]));
		}

	}
	public void buildTree()
	{
		while(priorityQueue.size()>1)
		{
			priorityQueue.push(priorityQueue.pop().makeParentWith(priorityQueue.pop()));
		}
		huffmanTree=priorityQueue.pop();

	}
	public void buidDictionnary()
	{
		dictionnary.hydrate(huffmanTree);
	}
}