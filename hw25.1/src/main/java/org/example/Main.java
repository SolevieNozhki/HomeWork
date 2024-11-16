package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String url = "https://lenta.ru/";
        try {
            Document doc = Jsoup.connect(url).get();
            Elements elements = doc.select("div .card-mini");
           elements.forEach(element -> System.out.println(element.select(".card-mini__title").text() + " " + element.absUrl("href")));
           /* Elements elements1 = doc.select("div .topnews__column a");
            elements.forEach(element -> System.out.println(element.select("h3").text() + " " +  element.absUrl("href")));*/



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}