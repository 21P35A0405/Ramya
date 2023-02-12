


public class FindingMissingNumbers {
    public static void main(String[] args) {
        int[] arrNum = {1, 2, 4, 5, 6};
        int n = arrNum.length;

        int expectedSum = (n + 1) * (arrNum[0] + arrNum[n - 1]) / 2;
        int realSum = 0;
        for (int num : arrNum) {
            realSum += num;
        }

        int missingNum =expectedSum - realSum;
        System.out.println("Missing number: " + missingNum);
    }
}



