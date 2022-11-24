public class Counter {
    int start;
    int end;

   // public Counter(int start, int end) {
      //  this.start = start;
       // this.end = end;
   // }

    public int countTo(int end) {
        int countResult = 0;
        if(end > 0) {
            for (int i = 0; i <= end; i++) {
                countResult = i;
            }
        }
        else if(end < 0) {
            for (int i = end; i <= 0; i++) {
                countResult = i + -end;
            }
        }
        return countResult;
    }

    public int countFromTo(int start, int end) {
        int countResult = 0;
        if(end > start) {
            for (int i = start; i <= end; i++) {
                countResult = i - start;
            }
        }
        else if (start > end) {
            for (int i = end; i <= start; i++) {
                countResult = i - end;
            }
        }

        return countResult;
    }
}
