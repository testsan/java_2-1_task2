public class Main {
    public static void main(String[] args) {
        int currentAccount = 100;
        int refill = 1100;
        int bonus = refill < 1000 ? 0 : refill / 100;
        int totalBalance = currentAccount + refill + bonus;
        System.out.println(totalBalance);
    }
}
