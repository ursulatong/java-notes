# About Array in Sorting and Removing
##1. Sorting an array in descending order

Use the reverseOrder() method from the Collections class. The reverseOrder() method does not parse the array. Instead, it will merely reverse the natural ordering of the array. It means that you will first use the sort array in Java to sort it in ascending order and then reverse it with the reverseOrder() method. One more thing worth noting is that the Collections.reverseOrder() does not support primitive type. Hence, you must use “Integer” instead of “int” to define the integer data type array.

##2. Removing an element from Array

When we create an array in Java, we specify its data type and size. This is used by JVM to allocates the necessary memory for array elements. There are no specific methods to remove elements from the array.

###What we can do?
   
####2.1. Removing an element from Array using for loop
   

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int[] arr_new = new int[arr.length-1];
        int j=3;
        for(int i=0, k=0;i<arr.length;i++){
            if(i!=j){
                arr_new[k]=arr[i];
                k++;
            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" + Arrays.toString(arr_new));

    }   
    

![Alt text](https://journaldev.nyc3.digitaloceanspaces.com/2020/07/arr-delete.png)
The code removes the element at index 3. This method simply copies all the elements except the one at index 3 to a new array.


####2.2. Deleting an array element by its value

Unlike the previous case, this code will delete the element based on its value. This will not work with duplicates since the size of the array after deletion has to be known.


    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int[] arr_new = new int[arr.length-1];
        int j=3;
        for(int i=0, k=0;i<arr.length;i++){
            if(arr[i]!=j){
                arr_new[k]=arr[i];
                k++;
            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" + Arrays.toString(arr_new));

    }

![Alt text](https://journaldev.nyc3.digitaloceanspaces.com/2020/07/arr-delete-1.png)

####2.3. Deleting element by its value when the array contains duplicates


    public static void main(String[] args) {
        int[] arr = new int[]{1,3,3,4,5};
        ArrayList<Integer> arr_new = new ArrayList<>();
        int j=3;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=j){
                arr_new.add(arr[i]);

            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" +arr_new);

    }

    
![Alt text](https://journaldev.nyc3.digitaloceanspaces.com/2020/07/arr-del-dup.png)

####2.4. Shifting elements in the same array

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,3,4,5};
        int j=3;
        System.out.println("Before deletion :" + Arrays.toString(arr));
        int count =0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == j){
                count++;

                // shifting elements
                for(int k = i; k < arr.length - 1; k++){
                    arr[k] = arr[k+1];
                }
                i--;
               // break;
            }
        }

        System.out.print("After Deletion :" );
        for(int i = 0; i < arr.length-count; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        System.out.println("Whole array :" + Arrays.toString(arr));

    }

Count variable indicates the number of elements deleted. This variable is essential to keep a track of index till which the array should be printed. This method takes care of duplicates as well.

![Alt text](https://journaldev.nyc3.digitaloceanspaces.com/2020/07/shifting-elements-in-array.png)

####2.5 Deleting elements by transforming to ArrayList

 The deletion of an element in the ArrayList is straight forward. It requires one simple call to an inbuilt function.


    public static void main(String[] args) {
        int[] arr = new int[]{1,3,3,4,5};
        ArrayList<Integer> arr_new = new ArrayList<Integer>();
        for (int i : arr)
        {
            arr_new.add(i);
        }
        arr_new.remove(3);
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After Deletion:" + arr_new);
    }


![Alt text](https://journaldev.nyc3.digitaloceanspaces.com/2020/07/array-deletion.png)



