 //task 3
public class EvenOdd {
    public static void main(String[] args) {
// generating a random number between 1 and 100
        int randomNumber = (int) (Math.random() * (100-1));
// checking if it is Even or Odd
        if (randomNumber%2 == 0)
        {
            System.out.println(randomNumber + "is an even number");
        } else
        {
            System.out.println(randomNumber + " is an Odd number");
        }
    }
}
