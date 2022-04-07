/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avalon.Avalon.Service;

import com.avalon.Avalon.Model.Producto;
import com.avalon.Avalon.Model.VolumetricoSAT;
import com.avalon.Avalon.Util.JSONUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author frank
 */
@Slf4j
@Service
public class UploadService {

    @Autowired
    private VolumetricoSATService volumetricoSATService;

    public void save(MultipartFile file) {
        if (!file.isEmpty()) {
            VolumetricoSAT volumetricoSAT = JSONUtil.convertJsonToJava(file, VolumetricoSAT.class);
            volumetricoSAT.getProductoSet().forEach(producto1 -> producto1.setVolumetricoSAT(volumetricoSAT)); // mover a su service
            volumetricoSATService.saveVolumetricoSAT(volumetricoSAT);
        } else {
            throw new FileStorageException("Archivo vacio!");
        }
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
