public int[] sortedSquaredArray(int[] array) {
    int[] arr = new int[array.length];
    
    for (int i = 0; i < array.length; i++) {
        int squaredNum = (int) Math.pow(array[i], 2);
        arr[i] = squaredNum;
    }

    Arrays.sort(arr);
    return arr;
  }
}