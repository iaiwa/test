public class Problema6 {
    public static void main(String[] args) {

        int[] randomNumbers = new int[6];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 49) + 1;
            System.out.println(randomNumbers[i]);
        }
    }
}