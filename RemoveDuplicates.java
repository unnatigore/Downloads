import java.util.HashMap;

public class RemoveDuplicates
{

	
	public static void main(String[] args) 
	{

		int a[]={10,20,15,30,25,10,10,15,20,40,45,22,22};
		HashMap<Integer,Integer> hmap=new HashMap<>();
		
		for(int i=0;i<a.length;i++)
		{
			if(hmap.containsKey(a[i]))
			{
				hmap.put(a[i], hmap.get(a[i]));
			}
			else
			{
				hmap.put(a[i], 1);
			}
			
		}
		System.out.println(hmap.keySet());
		
		
	}

	
}