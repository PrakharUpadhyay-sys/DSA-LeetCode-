class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++)
        {
            image[i]=negation(image[i]);
        }
        return image;
    }
    static int[] negation(int[] arr)
    {
       int[] num = new int[arr.length];
       for(int i =0;i<arr.length;i++)
       {
        num[arr.length-1-i]=(arr[i]^1);
       }
       return num;
    }
}