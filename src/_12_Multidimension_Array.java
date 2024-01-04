public class _12_Multidimension_Array {
    public static void main(String[] args) {
//        2 rows 3 columns
//       int arr[][]={{3,4,6},{4,6,7}};
//       int r=2,c=3;
//       for(int i=0;i<r;i++)
//       {
//           for(int j=0;j<c;j++)
//           {
//               System.out.print(arr[i][j]+"\t");
//           }
//           System.out.println("\n");
//       }


        /*3 DIMENSION ARRAY*/

        /*in 3d array we define how many 2d array we want then we define row and column all 2d array will have */
                       //first 2d array    2nd 2d array
        int arr[][][]={{{2,4,5},{4,5,6},{3,5,7}},{{3,6,7},{2,5,6},{1,3,2}}};

        /*here first [2] is represent we want 2 2d array [3][3] represent row and column values , representation------------*/
        /*1st 2d array        2nd 2d array
           3 4 5                5 6 7
           5 6 7                4 2 7
           4 6 7                1 9 5
        as this declaration of array will actually store*/

        /*if we want to access first 2d array element so we will do 0 if we want to access first 2d array 1 for 2nd 2d array
        if we have more so we will do 3,4 so on and then we will define row and column
        example--- arr[0][0][0]   first 0 is representing first 2d array second 0 value of row it 3rd 0 representing column
        mean we want to access first 2d array's first row's first column which is 3 */

        /*accessing through code*/

        for(int i=0;i<2;i++)
        {
            System.out.println((i+1) +" 2D array \n");
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                    System.out.print(arr[i][j][k]+"\t");
                }
                System.out.print("\n");
            }
            System.out.println("\t");
        }

    }
}
