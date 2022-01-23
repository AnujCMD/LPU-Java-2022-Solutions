public class Array2D {
    public static void main(String[] args){
        // 2D array is array of array
        int[][] worldcovid = {
            {1000, 200, 4000, 500},
            {2000, 100, 8000},
            {600, 100, 8000},
            {300, 200},
            {200}
        };
        System.out.println("worldCovidCases is: "+worldcovid);
        System.out.println("worldCovidCases is: "+worldcovid.length);

        for(int i=0; i<worldcovid.length; i++){
            System.out.println("World Covid cases["+i+"] is: "+worldcovid[i]+"and length is" +worldcovid[i].length);

        }
        // printing all the elements of the 2d array
        for(int i=0; i<worldcovid.length; i++){
            for(int j=0;j<worldcovid[i].length; j++){
                System.out.print(+worldcovid[i][j]+ " ");
            }
        }
        System.out.println(" ");
         //to get the specific data
         System.out.println("The data for 2,3 array is"+worldcovid[2][2]);


         // Enhanced for loop for 2d array
         for(int[] array: worldcovid){
             for(int element : array){
                 System.out.println(element+" ");
             }
         }
         //3D arrays
         //array of array of array;

         int[][][] worldPopulation = {
				
            // india-population
            {
                {35144, 643663, 8374438}, // state1 (population district wise)
                {35144, 643663, 8374438}, // state2
                {35144, 643663, 8374438}, // state3
            },
            // usa-population
            {
                {35144, 643663, 8374438}, // state1 (population district wise)
                {35144, 643663, 8374438}, // state2
                {35144, 643663, 8374438}, // state3
            }
    };

    
    int[][] array = new int[5][];//There are 5 1D arrays
    //and the size of 1D arrays is not decided


    // all values are by default 0
    array[0]= new int[4];
    array[1]= new int[4];
    array[2]= new int[3];
    array[3]= new int[2];
    array[4]= new int[3];
    
    array[1][1]= 5;

    for(int[] arr: array){
        for(int element: arr){
            System.out.println(element+ " ");

        }
        System.out.println(" ");
    }



    }
    

 
    
}
