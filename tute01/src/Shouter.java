public class Shouter {
    private String msg;

    public Shouter(String msg) {
        this.msg = msg;
    }

    public void setMessage(String msg) {
        this.msg = msg;
    }

    public String getMessage() {
        return msg;
    }

    public void printMsg() {
        System.out.println(msg.toUpperCase());
    }

    public String toString() {
        return msg.toUpperCase();
    }

    public static void main(String[] args) {
        Shouter s = new Shouter("what's up");
        s.printMsg();
        System.out.println(s);
    } 
}
