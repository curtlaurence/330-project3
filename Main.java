package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws Exception{

        File file = new File("C:\\Users\\Colin\\IdeaProjects\\3300_project_3\\src\\edu\\clemson\\cspsc2150\\project4\\input.txt");

        Scanner in = new Scanner(file);

        String line =  "";

        int cache = 0;
        Processor processor0 = new Processor();
        Processor processor1 = new Processor();
        String[] splits = new String[2];
        int i = 0;
        ArrayList<Instruction> instructions = new ArrayList<Instruction>();

        while(in.hasNext()){

            line = in.nextLine();
            splits = line.split("\\D");
            Instruction I = new Instruction(line.charAt(0), line.charAt(1), Integer.parseInt(splits[1], 16), i + 1);
            instructions.add(I);

            i++;
        }


        in.close();




        for (int j = 0; j < instructions.size(); j++) {
            if(instructions.get(j).processor == '0' ){
                System.out.print(instructions.get(j));
                processor0.instructions.add(instructions.get(j));
                // System.out.println(" " +processor0.isCacheHit());
            }
        }

    }



}

