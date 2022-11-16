package org.example;

import java.lang.reflect.Array;

public class Dekker {
    boolean[] wantCS = {false,false};
    int turn = 1;
    void requestCS(int i){
        int j = 1- i;
        wantCS[i] = true;
        while (wantCS[j]){
            if(turn == j){
                wantCS[i] = false;
                while (turn == j){
                    wantCS[i] = true;
                }
            }
        }
    }
    void releaseCS(int i){
        turn = 1 - i;
        wantCS[i] = false;
    }

    Lock lock;
    int tid;
    void CS(){

    }
    void nonCS(){

    }
    void run(){
        while (true){
            lock.requestCS(tid);
            CS();
            lock.releaseCS(tid);
            nonCS();
        }
    }
}
