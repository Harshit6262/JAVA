class hello extends Thread{
    public void run(){
        System.out.println("Thread is running,......");
    }
    
    public static void main(String[] args){
        hello t1 = new hello();
        t1.start();
    }
}