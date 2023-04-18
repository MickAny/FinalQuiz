public class Task
{
    public static void main(String[] args)
    {

    }
    static void SecondArrayWithIF( String[] arr1, String[]  arr2)
    {
        int count = 0;
        for (int i = 0; i < arr1.length; i++)
        {
            if(arr1[i].length() <= 3)
            {
                arr2[count] = arr1[i];
                count++;
            }
        }
    }

    static void PrintArray(String[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] != null) System.out.println(array[i]);
        }
    }

}