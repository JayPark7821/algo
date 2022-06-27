class bj4673{

    static int d(int number){
        int sum = number;

        while (number != 0) {
            sum = sum + (number % 10);
            number = number / 10;
        }
        return sum;
    };
    
    public static void main(String[]args){
        int flag = 1;
        int[] selfNumArray = new int[10001];
        while(flag <=10000){
            int selfNum = d(flag);
            if( selfNum <= 10000) {
                selfNumArray[selfNum] = 1;
            }
            flag++;
        }
        for (int i = 1 ; i < selfNumArray.length ; i++) {
            if(selfNumArray[i] == 0){
                System.out.println(i);
            }

        }
   }  
}
