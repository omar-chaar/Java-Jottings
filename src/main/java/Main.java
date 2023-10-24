public class Main {
    public static void main(String[] args) throws Exception {
        Runner runner = new Runner(OvenFactory.createOven());
        runner.run();
    }
}
