public class MyTimer {
    int minutes;
    int seconds;

    public MyTimer(int minutes, int seconds) {
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void start() {
        printTime();
        while (minutes != 0 || seconds != 0) {
            if (seconds == 0) {
                minutes--;
                seconds = 59;
            } else {
                seconds--;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            printTime();
        }

    }
    public void printTime(){
        String mm = minutes < 10 ? "0" + minutes : minutes + " ";
        String ss = seconds < 10 ? "0" + seconds : seconds + " ";
        System.out.println(mm + ":" + ss);
    }
}
