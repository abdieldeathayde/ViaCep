package com.alura.buscacep;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {

    public void salvaJson(Endereco endereco) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        FileWriter escrita = new FileWriter(new StringBuilder().append(endereco.cep()).append(".json").toString());
        escrita.write(gson.toJson(endereco));
        escrita.close();

//        gson.toJson(endereco, escrita);
//        System.out.println("Arquivo " + endereco.cep() + ".json criado com sucesso!");

    }
}
