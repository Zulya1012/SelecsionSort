public class selectionsort2{
	public static void main(String[] arg){
		int array []={12, 20, 11, 24, 30, 12, 11};
			
			for(int y=0; y<array.length; y++){
				int min=array[y];
				int pos=y;
				for (int x=y+1; x<array.length; x++){
					if (array[x]<min){
					pos=x;
					min=array[x];
					}
				}
			array[pos]=array[y];
			array[y]=min;
			}
			for (int k:array)
				System.out.println(k);
	}
}