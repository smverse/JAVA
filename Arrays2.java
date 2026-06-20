// Multi Dimension Array

public class Arrays2 {
    public static void main(String [] args)
    {
        int nums[][] = new int[3][4];


// here we are using this loop and Math.random for generating random values
         for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                nums[i][j] = (int)(Math.random()*100);  // Math.random generally gives double values like (0.23 , 0.45) so we are multiplying it by 100 and after that converting it into integer by type casting if you want single digi tmultiply by 10.
            }

        }
//


        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(nums[i][j] + " ");
            }

            System.out.println();
        }

        // we can do this also by enhanced for loop

        for(int n[] : nums)
        {
            for(int m: n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
