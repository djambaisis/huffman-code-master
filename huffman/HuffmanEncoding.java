package huffman;

public class HuffmanEncoding extends HuffmanAlgos
{
	public HuffmanEncoding()
	{
		
	}
	public encodingFromFile(String urlFile)
	{
		this.urlFile=urlFile;
		this.readFile();
	}
	public encodingFromString(String str)
	{
		this.fileContent=str;
	}
	public decodingFromFile()
	{

	}
}