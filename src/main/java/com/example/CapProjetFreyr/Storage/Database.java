package com.example.CapProjetFreyr.Storage;

import com.example.CapProjetFreyr.Entity.Data;
import com.example.CapProjetFreyr.Entity.Sensor;
import com.example.CapProjetFreyr.Entity.Station;
import com.example.CapProjetFreyr.Entity.Type;
import com.google.gson.Gson;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Database {

    private static Object Sensor;
    private static Object SensorValue;
    private static Object Station;
    private static Object Type;

    public static ArrayList<Station> getStations(String url){
        ArrayList stationList = new ArrayList<>();
        try{
            Connection conn = DriverManager.getConnection(url);
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery("Select * from Station");

            while (result.next()){

                Gson gson = new Gson();
                Station test = new Station(
                        result.getInt("id"),
                        result.getString("name")
                );

                stationList.add(test);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return stationList;
    }
    public static ArrayList<Sensor> getSensors(String url){
        ArrayList sensorList = new ArrayList<>();

        try{
            Connection conn = DriverManager.getConnection(url);
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery("Select * from Sensor");

            while (result.next()){

                Gson gson = new Gson();
                Sensor test = new Sensor(
                        result.getInt("id"),
                        new Date(result.getTimestamp("addedDate").getTime()),
                        result.getString("name"),
                        result.getInt("stationId"),
                        result.getInt("type")
                );

                sensorList.add(test);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return sensorList;
    }

    public static ArrayList<Type> getTypes(){
        ArrayList typeList = new ArrayList<>();
        try{
            Connection conn = DriverManager.getConnection(getUrl());
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery("Select * from Type");

            while (result.next()){

                Gson gson = new Gson();
                Type test = new Type(
                        result.getInt("id"),
                        result.getString("name")
                );

                typeList.add(test);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return typeList;
    }
    public static ArrayList<Data> getData(String url) throws ParseException {
        ArrayList dataList = new ArrayList<>();

        try{
            Connection conn = DriverManager.getConnection(url);
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery("Select * from SensorValue");
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

            while (result.next()){
                String val = result.getObject("captureDate").toString();
                Data test = new Data(
                        result.getString("name"),
                        sdf.parse(val),
                        result.getInt("sensorsId"),
                        result.getInt("stationId"),
                        result.getInt("type"),
                        result.getInt("value")
                );
                System.out.println(test);
                dataList.add(test);
            }
        } catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return dataList;
    }
    private static String getUrl() {
        return "jdbc:sqlite:src/main/resources/sqlite/db/chinook.db";
    }
}

