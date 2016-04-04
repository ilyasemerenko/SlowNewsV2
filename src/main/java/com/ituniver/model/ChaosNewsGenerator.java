package com.ituniver.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ChaosNewsGenerator {

    private static List<String> nouns;
    private static List<String> verbs;
    private static List<String> adjectives;
    private static List<String> sources;
    private static List<String> dates;

    static {
        initWordsLists();
    }

    private static void initWordsLists() {
        nouns = new ArrayList<String>();
        fillList("nouns.txt", nouns);
        verbs = new ArrayList<String>();
        fillList("verbs.txt", verbs);
        adjectives = new ArrayList<String>();
        fillList("adjectives.txt", adjectives);
        sources = Arrays.asList("BBC", "CNN", "Times", "Chaotic");
        dates = Arrays.asList("23.13.2016", "16.01.2016", "22.11.2015", "01.01.1970");

    }

    private static void fillList (String fileName, List list){
        try {
            File file  =  new File("D:\\isemerenko\\JavaProjects\\SlowNewsV2\\src\\main\\webapp\\content\\" + fileName);
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                list.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public NewsBean getNews(){
        NewsBean news = new NewsBean();
        news.setHeader(generateHeader());
        news.setText(generateBody());
        news.setImage(generateImage());
        news.setSource(generateSource());
        news.setDate(generateDate());
        return news;
    }

    private String generateHeader(){
        return buildSentence();
    }

    private String generateBody(){
        StringBuilder body = new StringBuilder();
        for (int i = 0; i < 30; i++){
            body.append(buildSentence());
        }
        return body.toString();
    }

    private String generateImage(){
        String imagesDir = "D:\\isemerenko\\JavaProjects\\SlowNewsV2\\src\\main\\webapp\\content\\images\\";
        File dir = new File(imagesDir);

        String[] children = dir.list();

        return "./content/images/" +  children[getRandom(children.length)];
    }

    private String generateSource(){
        return sources.get(getRandom(sources.size()));
    }

    private String generateDate(){
        return dates.get(getRandom(dates.size()));
    }

    private String capitalizeFirst(String word){
        char[] wordChars = word.toCharArray();
        wordChars[0] = Character.toUpperCase(wordChars[0]);
        return new String(wordChars);
    }

    private int getRandom(int max){
        Random rand = new Random();
        return rand.nextInt(max);
    }

    private String buildSentence (){

        return capitalizeFirst(nouns.get(getRandom(nouns.size())))
                + " " + verbs.get(getRandom(verbs.size()))
                + " " + adjectives.get(getRandom(adjectives.size()))
                + " " + nouns.get(getRandom(nouns.size()))
                + ". ";

    }

}
