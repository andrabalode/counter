public class Counter {
    //Recursion: process of a function/method calling itself

    //create a method that counts up from start number to finish number
    void countUp(int start, int stop) {
        if (start > stop) {
            System.out.println("Start value must be less than stop");
            return;
        }
        //Print the value of start to console
        System.out.println(start); // 1

        //add one to value of start on the console
        start++; //start 2

        if(start <= stop) {
            countUp(start, stop);
        }
        return;
    }

    //create a method that counts down from start number to finish number
    void countDown (int start, int stop) {
        if (start < stop) {
            System.out.println("Start value must be bigger than stop");
            return;
        }
        System.out.println(start);
        start--;

        if (start >= stop) {
            countDown(start, stop);
        }
        return;


    }
}
