package com.example.CapProjetFreyr;

import com.google.gson.Gson;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Database {

    private static Object Sensor;
    private static Object SensorValue;
    private static Object Station;
    private static Object Type;

    public static ArrayList<Station> getStations(){
        String url = "jdbc:sqlite:C:/sqlite/db/chinook.db";
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
        } catch (SQLException e){
            e.printStackTrace();
        }
        return stationList;
    }
    public static ArrayList<Sensor> getSensors(){
        String url = "jdbc:sqlite:C:/sqlite/db/chinook.db";
        ArrayList sensorList = new ArrayList<>();

        try{
            Connection conn = DriverManager.getConnection(url);
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery("Select * from Sensor");

            while (result.next()){

                Gson gson = new Gson();
                Sensor test = new Sensor(
                        result.getInt("id"),
                        result.getDate("addedDate"),
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
        String url = "jdbc:sqlite:C:/sqlite/db/chinook.db";
        ArrayList typeList = new ArrayList<>();
        try{
            Connection conn = DriverManager.getConnection(url);
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
    public static ArrayList<Data> getData(){
        String url = "jdbc:sqlite:C:/sqlite/db/chinook.db";
        ArrayList dataList = new ArrayList<>();

        try{
            Connection conn = DriverManager.getConnection(url);
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery("Select * from SensorValue");

            while (result.next()){

                Gson gson = new Gson();
                Data test = new Data(
                        result.getString("name"),
                        new Date(result.getTimestamp("captureDate").getTime()),
                        result.getInt("sensorsId"),
                        result.getInt("stationId"),
                        result.getInt("type"),
                        result.getInt("value")
                );

                dataList.add(test);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return dataList;
    }
}

