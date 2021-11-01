package test1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class test03 {
}


class Sample {
    public static void main(String[] args) {
        try {
            String s = "";
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                s = s + line + "\n";
            }

            String[] words = s.split("\\s|\\(|\\)|\\.|\\[|\\]|,|\\+|;|\\\\|\"|!|\\||/|=|\\*|@|<|>");
            List<String> uniqueWords = new ArrayList<>();
            for (int i = 0; i < words.length; i++){
                String testedWord = words[i];
                int count = 0;
                for (int j = 0; j < words.length; j++){
                    if (testedWord.equals(words[j]))
                        count++;
                }
                if (count == 1 && !uniqueWords.contains(testedWord)) uniqueWords.add(testedWord);
            }
            Collections.sort(uniqueWords);
            for (int i = 0; i < uniqueWords.size(); i++){
                System.out.println(uniqueWords.get(i));
            }
            br.close();
        } catch (Throwable ex) {
            Logger.getLogger(Sample.class.getName()).log(Level.SEVERE, null, ex);
            //невозможно
        }
    }
}