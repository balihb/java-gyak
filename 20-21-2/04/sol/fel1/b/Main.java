

class Main
{
    public static void main(String[] args)
    {
        System.out.print("Enter N: ");
        int N = Integer.parseInt(System.console().readLine());

        double[] array = new double[N];
        for (int i = 0; i < N; ++i)
        {
            System.out.print("Enter " + i + "th item: ");
            array[i] = Double.parseDouble(System.console().readLine());
        }

        double sum = 0;
        for (int i = 0; i < array.length; ++i)
        {
            sum += array[i];
        }
        double avg = sum / array.length;

        double[] diff_from_avg = new double[N];
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
