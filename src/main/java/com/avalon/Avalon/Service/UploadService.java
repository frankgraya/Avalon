/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avalon.Avalon.Service;

import com.avalon.Avalon.Repository.VolumetricoSATRepository;
import lombok.extern.slf4j.Slf4j;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

/**
 *
 * @author frank
 */
@Slf4j
@Service
public class UploadService {

    private String folder = "cargas//";

    @Autowired
    private VolumetricoSATRepository volumetricoSATRepository;

    public String save(MultipartFile file) throws IOException, ParseException {

        if (!file.isEmpty()) {

            byte[] bytes = file.getBytes();
            Path path = Paths.get(folder + file.getOriginalFilename());
            Files.write(path, bytes);
            log.info("Archivo guardado");

            System.out.println("ESTAS apunto de convertir el json");
            JSONParser parser = new JSONParser();

            log.info("ESTAS OBTENIENDO EL OBJETO");
//
            //leer la ruta del archivo
            Object obj = parser.parse(new FileReader("test2.json"));
            log.info("EL OBJETO ES " + obj);
            JSONObject jsonObject = (JSONObject) obj;

            String Version = (String) jsonObject.get("Version");
            System.out.println(Version);

            long RfcContribuyente = (Long) jsonObject.get("RfcContribuyente");
            System.out.println(RfcContribuyente);
            // loop array
            JSONArray msg = (JSONArray) jsonObject.get("MENSAJE");

            //leer completo el mensaje
            Iterator<String> iterator = msg.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

//            File folder = new File("cargas//");
//            findAllFilesInFolder(folder);
        } else {
            return "Archivo vacio!";
        }
        return "Archivo guardado correctamente";
    }

//    public void JsonConversor() throws ParseException {
//        System.out.println("ESTAS EN EL METODO JSON CONVERSOR");
//        JSONParser parser = new JSONParser();
//        try {
//
//            //leer la ruta del archivo
//            Object obj = parser.parse(new FileReader("test2.json"));
//            log.info("EL OBJETO ES " + obj);
////            Object obj = parser.parse(new FileReader("f:\\test2.json"));
//
//            JSONObject jsonObject = (JSONObject) obj;
//            System.out.println(jsonObject);
//            // volumetricoSATRepository.save(jsonObject);
//
//            String Version = (String) jsonObject.get("Version");
//            System.out.println(Version);
//
//            long RfcContribuyente = (Long) jsonObject.get("RfcContribuyente");
//            System.out.println(RfcContribuyente);
//            // loop array
//            JSONArray msg = (JSONArray) jsonObject.get("MENSAJE");
//
//            //leer completo el mensaje
//            Iterator<String> iterator = msg.iterator();
//            while (iterator.hasNext()) {
//                System.out.println(iterator.next());
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//    public static void findAllFilesInFolder(File folder) {
//        for (File file : folder.listFiles()) {
//            if (!file.isDirectory()) { 
//                System.out.println(file.getName());
//            } else {
//                findAllFilesInFolder(file);
//            }
//        }
//    }
    public String hola() {
        System.out.println("ESTAS EN EL METODO HOLA");
        return "hola";
    }

    //    public hola(int) {
//        return null;
//    }
}
