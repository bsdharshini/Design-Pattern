class Logger {
    private static Logger instance = null;
    public static Logger getInstance (){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        if(instance == null){
            synchronized(Logger.class){
        
        if(instance == null){
            instance = new Logger(); 
        }}}
        return instance;
    }
    private Logger(){
        
    }
   
}

class Main {
     public static void main(String[] args) {
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();
        Logger l3 = Logger.getInstance();
        System.out.println(l1.equals(l2));
        System.out.println(l1.equals(l3));
    }
}
