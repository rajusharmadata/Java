public class lenearscarch {

    public static int lenearscarch(int number[],int key){
        for(int i = 0;i<number.length;i++){
           if(number[i] == key){
           
                return i;
            }
         }   
            return -1;
    }
    public static void main(String[] args) {
        int number[] ={2,4,6,8,10,12,14,18,20};
        int key = 10;
       
        int index =  lenearscarch(number,key);
        if(index == -1){
            System.out.print("Not  found :)");
        }else{
            System.out.println("index is " + index);
        }
    }
}
