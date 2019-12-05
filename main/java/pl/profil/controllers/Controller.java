package pl.profil.controllers;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.profil.GruntyGeNs;
import pl.profil.GruntyGeS;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    private List<GruntyGeNs> gruntyNs;
   private List<GruntyGeS> gruntyS;

    public Controller() {
        gruntyNs = tworzListeNs();
        gruntyS = tworzListeSp();
    }

    @GetMapping("iteracja")
    public String iteracjaGr(Model model) {
        model.addAttribute("listaGrNs", gruntyNs);
        model.addAttribute("listaGrS", gruntyS);
        return "iteracjaGrTemplate";
    }

    private List<GruntyGeNs> tworzListeNs() {
        List<GruntyGeNs> listaNs = new ArrayList<>();
        GruntyGeNs grunt1 = new GruntyGeNs("il", 18.0, 18.5, 19.0);
        listaNs.add(grunt1);
        GruntyGeNs grunt2 = new GruntyGeNs("pyl", 17.0, 17.5, 18.0);
        listaNs.add(grunt2);
        GruntyGeNs grunt3 = new GruntyGeNs("piasek", 16.3, 16.8, 17.0);
        listaNs.add(grunt3);
        GruntyGeNs grunt4 = new GruntyGeNs("piasek_pylasty", 16.6, 16.1, 17.4);
        listaNs.add(grunt4);
        return listaNs;
    }

    private List<GruntyGeS> tworzListeSp(){
        List<GruntyGeS> listaS = new ArrayList<>();
        GruntyGeS grunt1 = new GruntyGeS("glina", 10,11,12,13);
        listaS.add(grunt1);
        GruntyGeS grunt2 = new GruntyGeS("glina_pylasta", 13,14,15,16);
        listaS.add(grunt2);
        return listaS;
    }
}



