package com.company;
public class Instruction {

    char instruction = ' ';
    char processor = ' ';
    int address = 0;
    int order = 0;


    public Instruction(char processor, char instruction, int address, int order) {
        this.instruction = instruction;
        this.processor = processor;
        this.address = address;
        this.order = order;
    }

    public Instruction() {
    }


    @Override
    public String toString() {
        String r = instructionString();
        r += " " + address;
        return r;
    }

    public String instructionString(){
        if (instruction == 'r') return "read";
        else return "write";
    }
}
