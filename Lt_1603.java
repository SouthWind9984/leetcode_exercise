package LeetCode_ADailyTopic;

public class Lt_1603 {
    public static void main(String[] args) {

    }

    class ParkingSystem {
        private int [] parkArr;
        public ParkingSystem(int big, int medium, int small) {
            parkArr = new int[3];
            parkArr[0]=big;
            parkArr[1]=medium;
            parkArr[2]=small;
        }

        public boolean addCar(int carType) {
            switch (carType){
                case 1:
                    return parkArr[0]-->0?true:false;
                case 2:
                    return parkArr[1]-->0?true:false;
                default:
                   return parkArr[2]-->0?true:false;
            }
        }
    }
}
