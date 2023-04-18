public class Task
{
    public static void main(String[] args)
    {
        //String[] arr1 = new String[]{"Russia", "Denmark", "Kazan"};
        //String[] arr1 = new String[]{"1234", "1567", "-2", "computer science"};
        //String[] arr1 = new String[]{"Hello", "2", "world", ":-)"};

        String[] arr1 = new String[]{"=)", "Nevermind", "hey", "world", "BrB", "False", "-3"};
        String[] arr2 = new String[arr1.length];

        SecondArrayWithIF(arr1, arr2);
        System.out.println("Only elements less than four");
        PrintArray(arr2);
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