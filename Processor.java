package com.company;
import java.util.ArrayList;

/**
 * Created by Colin on 4/29/2017.
 */
public class Processor {

    int name;
    int cachAddr = 0;
    int wrd0 = -1;
    int wrd1 = -1;
    char state = '-';
    boolean cacheHit = false;
    int readHits = 0;
    int readMisses = 0;
    int writehits = 0;
    int writeMisses = 0;

    ArrayList<Instruction> instructions = new ArrayList();

    public Processor() {
    }

    public boolean isCacheHit(){
        Instruction check = instructions.get(instructions.size() - 1);



        if(instructions.get(instructions.size() - 2).address == check.address)
            return true;

        else return false;
    }
}
