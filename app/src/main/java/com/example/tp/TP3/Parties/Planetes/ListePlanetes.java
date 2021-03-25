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
        private  String[] taillePlanetes = {"4900", "12000", "12800", "6800", "144000", "120000", "52000", "50000", "2300"};

    public String[] getTaillePlanetes() {
        return taillePlanetes;
    }

    public void setNewPlanetes(String Name, int Size){
        Planetes p = new Planetes(Name, Size);
        ListePlanetes.add(p);
    }

    public void init(){
        setNewPlanetes("Mercure", 4900);
        setNewPlanetes("Venus", 12000);
        setNewPlanetes("Terre", 12800);
        setNewPlanetes("Mars", 6800);
        setNewPlanetes("Jupiter",144000 );
        setNewPlanetes("Saturne", 120000);
        setNewPlanetes("Uranus", 52000);
        setNewPlanetes("Neptune", 50000);
    }

    public ListePlanetes() {
        ListePlanetes = new ArrayList<>();
    }

}
