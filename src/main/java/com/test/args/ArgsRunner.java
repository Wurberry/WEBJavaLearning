package com.test.args;

import com.Serialization.SaveGame;

import java.io.*;

public class ArgsRunner {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

/*
        double sqrt = Math.sqrt(-4);
        System.out.println(sqrt + 1);
        if (Double.isNaN(sqrt)) {
            System.out.println("So sad");
        }
        System.out.println(sqrt);
*/

        SaveGame saveGame = new SaveGame(new String[]{"First Size 1", "Second Size 5"}, new String[]{"Trump", "Putin"}, new String[]{"Bad country", "Best Country"});

        // Serialization
        try {
            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\danye\\Desktop\\save.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            // сохраняем игру в файл
            objectOutputStream.writeObject(saveGame);

            //закрываем поток и освобождаем ресурсы
            objectOutputStream.close();

        } catch (Exception e){
            System.out.println(e);
        }

        // De-Serialization
        try {

            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Username\\Desktop\\save.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            SaveGame savedGame = (SaveGame) objectInputStream.readObject();

            System.out.println(savedGame);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
