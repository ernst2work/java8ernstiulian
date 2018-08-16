/*
 * 
 */
package concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ernst
 */
public class CyclicBarrierAddSub {

// here it is the basic structure of the simulation: two threads instantiated, both started
//plus a "counting-object" that each of the two threads access 
//[decrease/increase it by one unit, for the same, given number of time]  
// it is a method that creates the counting object, plus the two threads 
//    and starts the two threads.
    public void runSimulation() {

        Kontor c = new Kontor(0);

        Thread add = new Thread(new ThreadAdd(c));
        Thread sub = new Thread(new ThreadSub(c));
        add.start();
        sub.start();

    }

// here it is the main method of the class: it creates an instance of the 
// simulation designed above. And runs it.
    public static void main(String[] args) {
        CyclicBarrierAddSub demo = new CyclicBarrierAddSub();
        demo.runSimulation();
    }

// let us create a cyclicBarrier that would serve two threads:
    CyclicBarrier bariera = new CyclicBarrier(2);



// let us create a "counting object": it has one private field,
// one constructor and
// two methods: add/sub, which the two threads will use    
    class Kontor {

        private int contor = 0;

        Kontor(int i) {
            i = contor;
        }

        public void add() throws InterruptedException {
//            System.out.println(contor + " before add");            
            contor++;
            System.out.println(contor + " after add");
        }

        public void sub() throws InterruptedException {
//            System.out.println(contor + " before sub");
            contor--;
            System.out.println(contor + " after sub");
        }

/*       public int getContor() {
            return contor;
        }
        
        public void setContor(int contor) {
            this.contor = contor;
        } */
        
    }

// let us create the blueprint [class] for first thread:
// it has own counting object, a constructor and
// the run method inherited from Runnable interface, overridden    
    class ThreadAdd implements Runnable {

        Kontor contorLocalAdunare;

        public ThreadAdd(Kontor c) {
            contorLocalAdunare = c;
        }

        @Override
        public void run() {
            for (int i = 0; i < 50000; i++) {
                try {
                    contorLocalAdunare.add();
//                    System.out.println(i);
//                    System.out.println("Cycle " + i + " add operated");
                } catch (InterruptedException ex) {
                    Logger.getLogger(CyclicBarrierAddSub.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    bariera.await();
//                    System.out.println("Cycle " + i + " add operated, waiting");
                } catch (InterruptedException | BrokenBarrierException ex) {
                    Logger.getLogger(CyclicBarrierAddSub.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

// let us create the blueprint [class] for second thread:
// it has own counting object, a constructor and
// the run method inherited from Runnable interface, overridden        
    class ThreadSub implements Runnable {

        Kontor contorLocalScadere;

        public ThreadSub(Kontor c) {
            contorLocalScadere = c;
        }

        @Override
        public void run() {
            for (int i = 0; i < 50000; i++) {
                try {
                    contorLocalScadere.sub();
//                    System.out.println(i);
//                    System.out.println("Cycle " + i + " sub operated");
                } catch (InterruptedException ex) {
                    Logger.getLogger(CyclicBarrierAddSub.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    bariera.await();
//                    System.out.println("Cycle " + i + " sub operated, waiting");
                } catch (InterruptedException | BrokenBarrierException ex) {
                    Logger.getLogger(CyclicBarrierAddSub.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

}
