public class multi_thread_extension extends Thread {
    private final int thread_number;

    public multi_thread_extension(int thread_number){
        this.thread_number=thread_number;
    }
    @Override
    public void run(){
        for (int i = 0; i <= 50; i++){
            System.out.println(i + "thread #" + thread_number);
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
