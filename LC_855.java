package LeetCode_ADailyTopic;

/**
 * 2022/12/30 16:36
 * SouthWind
 * github.com/SouthWind9984
 * 编程千万条，规范第一条
 */
public class LC_855 {

    class ExamRoom {
        int [] seat;
        int left;
        int right;
        public ExamRoom(int n) {
            seat = new int[n];
            left = 0;
            right = n - 1 ;
        }
/*
    0 1 2 3 4 5 6 7 8 9

 */
        public int seat() {
            if (seat[left]==0){
                return left;
            } else if (seat[right] == 0) {
                return right;
            }
            return 0;
        }

        public void leave(int p) {

        }
    }
}
