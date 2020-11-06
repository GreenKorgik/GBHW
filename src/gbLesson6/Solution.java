package gbLesson6;

import java.io.*;
import java.sql.SQLOutput;

/*
1. Создать 2 текстовых файла, примерно по 50-100 символов в каждом (особого значения не имеет);
2. Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
3. * Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.
4.  ** Написать метод, проверяющий, есть ли указанное слово в папке, внутри есть файлы, в которых может
содержатся это слово (данная тема преднамеренно не рассказывалась, поэтому надо погуглить (Гуглить - тоже надо уметь правильно).
При чем не просто найти решение и списать, а именно сформулировать проблему. Пока вы будете формулировать проблему - вы найдете 50% решения)
 */
public class Solution {
    public static String word ="вино";

    public static void main(String[] args) throws IOException {
        MergerTwoFile(args[0],args[1]);//task2
        SearchWordInFile(word,inizialiseFile());//task3
        SearchWordInFolder();//task4
    }
    public static String inizialiseFile() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a file");
        String file = reader.readLine();
        reader.close();
        return file;
    }
    public static void MergerTwoFile(String nameFileOne,String nameFileTwo) throws IOException{
        BufferedReader fileReader = new BufferedReader( new FileReader(nameFileTwo));
        FileWriter fileWriter = new FileWriter(nameFileOne,true);
        StringBuilder line = new StringBuilder();
        while(fileReader.ready()){
            line.append("\n"+fileReader.readLine());
        }
        fileWriter.write(line.toString());
        fileReader.close();
        fileWriter.close();

    }
    public static boolean SearchWordInFile(String word, String file)throws IOException{//не уверен, что решение оптимальное по затратам ресурсов, особенно использование matches и возможное частое обращение к файлу
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while(reader.ready()){
            String textLine = reader.readLine();
            if(textLine.matches(".*"+word+".*")){ //
               reader.close();
                return true;
            }
        }
        reader.close();
        return false;
    }
    public static boolean SearchWordInFolder()throws IOException{
        System.out.println("Enter a path");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        reader.close();
        File fileFolder = new File(path);
        File[] files = fileFolder.listFiles();
        for(int i =0;i<files.length;i++){
            if(SearchWordInFile(word,files[i].toString())){
                System.out.println("word is "+files[i].toString());
                return true;
            }
        }
        return false;
    }
}
