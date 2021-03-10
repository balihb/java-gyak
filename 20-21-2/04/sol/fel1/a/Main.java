

class Main
{
    public static void main(String[] args)
    {
        double[] array = {1.3, 5.2, 7.7, -2.3, 23.45};

        double sum = 0;
        for (int i = 0; i < array.length; ++i)
        {
            sum += array[i];
        }
        double avg = sum / array.length;

        double[] diff_from_avg = {0, 0, 0, 0, 0};
        for (int i = 0; i < array.length; ++i)
        {
            diff_from_avg[i] = Math.abs(avg - array[i]);
        }

        int min_idx = 0;
        for (int i = 1; i < array.length; ++i)
        {
            if (diff_from_avg[i] < diff_from_avg[min_idx])
            {
                min_idx = i;
            }
        }

        System.out.println("The average is " + avg + "the closest item to the average is " + array[min_idx]);
    }
}
