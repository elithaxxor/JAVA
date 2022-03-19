public class multithreading {
    public static void main (String[] args){
        System.out.println("MultiThreading");
        multi_thread_extension new_thread = new multi_thread_extension(1);
        multi_thread_extension new_thread02 = new multi_thread_extension(2);
        new_thread.start();
        new_thread02.start();

        // TO SET MULTIPLE THREADS AT ONCE

        for (int i = 0; i <= 4; i++){
            System.out.println("[STARTING MULTI-THREAD]");
            multi_thread_extension new_thread000 = new multi_thread_extension(i);
            new_thread000.start();

        }
    }

}
