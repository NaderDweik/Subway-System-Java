class jj {
    public static void main(String[] args) {
        int array[] = {4, 5, 7, 3, 9, 7 , 66, 76, 87, 22, 44,11,34, 55};
        int size = array.length;
      int number = 55;

      for (int j=1 ;j< size+1; j++){
         if(array[j]==number){
            System.out.println("number found ");
            break;
         }if(array[j]!=number && number!=number){
            System.out.println("number not found");
            break;
         }
      }
   }
}
