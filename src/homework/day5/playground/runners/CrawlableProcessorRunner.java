package homework.day5.playground.runners;

import homework.day5.playground.essence.creatures.*;
import homework.day5.playground.processors.CrawlableProcessor;

public class CrawlableProcessorRunner {

    public static void main(String[] args) {

        CrawlableProcessor crawlableProcessor = new CrawlableProcessor();
        Crawlable crawlableCrocodile = new Crocodile(1723, "Neel Crawlable");
        Crawlable crawlableBeetle = new Beetle(43, "Christmas Crawlable");
        Vertebrata vertebrataCrocodile = new Crocodile(1723, "Neel Vertebrata");
        Insect insectBeetle = new Beetle(43, "Christmas Insect");
        Crocodile aCrocodile = new Crocodile(1723, "Neel Crocodile");
        Beetle aBeetle = new Beetle(43, "Christmas Beetle");
        Crawlable anonymousCrawlable = new Crawlable() {
            String name = "Anonymous";
            @Override
            public void crawl(String direction, int distance) {
                System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units%n",
                        this.getClass().getSimpleName(), name, direction, distance);
            }
        };

        crawlableProcessor.runCrawlable(crawlableCrocodile);
        crawlableProcessor.runCrawlable(crawlableBeetle);

        //crawlableProcessor.runCrawlable(vertebrataCrocodile);
        //Vertebrata class doesn't implement Crawlable interface and thus doesn't have crawl method which is called in method runCrawlable

        //crawlableProcessor.runCrawlable(insectBeetle);
        //Insect class doesn't implement Crawlable interface and thus doesn't have crawl method which is called in method runCrawlable

        crawlableProcessor.runCrawlable(aCrocodile);
        crawlableProcessor.runCrawlable(aBeetle);
        crawlableProcessor.runCrawlable(anonymousCrawlable);

        crawlableProcessor.runCrawlable(crawlableBeetle, "nowhere");
        crawlableProcessor.runCrawlable(crawlableCrocodile, "to the left");
        crawlableProcessor.runCrawlable(aCrocodile, "back", 37);
        crawlableProcessor.runCrawlable(new Crawlable() {
            String name = "Sun";
            @Override
            public void crawl(String direction, int distance) {
                System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units%n",
                        this.getClass().getSimpleName(), name, direction, distance);
            }
        }, "down", 37);
    }
}
