package com.campusdual.classroom;

import org.junit.jupiter.params.aggregator.ArgumentsAccessor;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {

    Map<String,Contact> mapa;


    public Phonebook() {
        this.mapa = new HashMap<>();
    }

    public Map<String, Contact> getData() {
        return mapa;
    }
    public void addContact (Contact contacto){
        mapa.put(contacto.codigo,contacto);
    }
    public void deleteContact (String cod){
        mapa.remove(cod);
    }

    public void showPhonebook(){
        for(Contact contact: mapa.values()){
            System.out.println("Name: "+contact.nombre);
            System.out.println("Surnames: "+contact.apellidos);
            System.out.println("Phone: "+contact.numero);
            System.out.println("Code: "+contact.codigo);
            System.out.println();
        }
    }


}
