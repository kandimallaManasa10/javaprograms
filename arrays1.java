//63. Sorting int elements from an arrays? (use selection sort).
class selectionssort
{
public static void selectionSort(int[] arr)
{
 for (int i = 0; i < arr.length - 1; i++) 
{
 int minIndex = i;
 for (int j = i + 1; j < arr.length; j++)
	{
if (arr[j] < arr[minIndex])
{
 minIndex = j;
 }
 }
 int temp = arr[i];
 arr[i] = arr[minIndex];
 arr[minIndex] = temp;
 }
 }
}
class arrays1
{

 public static void main(String[] args)
{
 int[] arr = { 5, 3, 7, 2, 8, 4 };
 selectionSort(arr);
 for (int i = 0; i < arr.length; i++) 
{
 System.out.print(arr[i] + " ");

 }
}
}


