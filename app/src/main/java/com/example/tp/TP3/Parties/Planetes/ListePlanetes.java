/*
 * Beatryx Beugnet Copyright (c) 2021. Plagiarism is absolutely Forbidden
 */

package com.example.tp.TP3.Parties.Planetes;

import java.util.ArrayList;

public class ListePlanetes {

        ArrayList<Planetes> ListePlanetes;

        public ArrayList<Planetes> getListePlanetes(){
        return ListePlanetes;
    }

        public void setNewPlanetes(String Name){
        Planetes p = new Planetes(Name);
        ListePlanetes.add(p);
    }

    public ListePlanetes() {
        ListePlanetes = new ArrayList<>();
    }

}
