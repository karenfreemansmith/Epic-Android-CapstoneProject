package com.karenfreemansmith.flashcards.models;

import java.util.Random;

/**
 * Created by Guest on 12/19/16.
 */
public class Person {
    private String country;
    private String flag;
    private String history;
    private String map;
    private String name;
    private String office;
    private String photo;
    private String title;

    public Person(String name, String photo, String title, String country) {
        this.name = name;
        this.photo = photo;
        this.title = title;
        this.country = country;
    }

    public static Person getRandomPerson() {
        Person randomPerson= new Person("Barrak Obama", "https://upload.wikimedia.org/wikipedia/commons/e/e9/Official_portrait_of_Barack_Obama.jpg", "President of the United States", "United States of America");
        Random randomGenerator = new Random();
        int rand = randomGenerator.nextInt(13);
        switch(rand) {
            case 0 :
                randomPerson = new Person("Shinzo Abe", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/Shinz%C5%8D_Abe_April_2015.jpg/450px-Shinz%C5%8D_Abe_April_2015.jpg", "Prime Minister of Japan", "Japan");
                break;
            case 1 :
                randomPerson = new Person("Xi Jinping", "https://upload.wikimedia.org/wikipedia/commons/3/3f/Xi_Jinping_October_2015.jpg", "President of the People's Republic of China", "China");
                break;
            case 2 :
                randomPerson = new Person("Park Geun-hye", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/40/Park_Geun-hye_%288724400493%29_%28cropped%29.jpg/368px-Park_Geun-hye_%288724400493%29_%28cropped%29.jpg", "President of South Korea", "South Korea");
                break;
            case 3 :
                randomPerson = new Person("Narendra Modi", "https://upload.wikimedia.org/wikipedia/commons/9/90/PM_Modi_2015.jpg", "Prime Minister of India", "India");
                break;
            case 4 :
                randomPerson = new Person("Vladimir Putin", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2b/Vladimir_Putin_June_2016.jpg/452px-Vladimir_Putin_June_2016.jpg", "President of Russia", "Russia");
                break;
            case 5 :
                randomPerson = new Person("Angela Merkel", "https://upload.wikimedia.org/wikipedia/commons/2/21/Angela_Merkel_-_Juli_2010_-_3zu4_cropped.jpg", "Chancellor of Germany", "Germany");
                break;
            case 6 :
                randomPerson = new Person("Pope Francis", "https://upload.wikimedia.org/wikipedia/commons/4/4d/Franciscus_in_2015.jpg", "The Pope", "Vatican City");
                break;
            case 7 :
                randomPerson = new Person("David Cameron", "https://upload.wikimedia.org/wikipedia/commons/2/21/David_Cameron_official.jpg", "Prime Minister of the United Kingdom", "United Kingdom");
                break;
            case 8 :
                randomPerson = new Person("Francois Hollande", "https://upload.wikimedia.org/wikipedia/commons/0/07/Fran%C3%A7ois_Hollande_%28Journ%C3%A9es_de_Nantes_2012%29.jpg", "President of France", "France");
                break;
            case 9 :
                randomPerson = new Person("Dilma Rousseff", "https://upload.wikimedia.org/wikipedia/commons/8/81/Dilma_Rousseff_-_foto_oficial_2011-01-09.jpg", "President of Brazil", "Brazil");
                break;
            case 10 :
                randomPerson = new Person("King Salman bin Abdulaziz al Saud", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7f/Prince_Salman_bin_Abd_al-Aziz_Al_Saud_at_the_Pentagon_April_2012.jpg/479px-Prince_Salman_bin_Abd_al-Aziz_Al_Saud_at_the_Pentagon_April_2012.jpg", "King of Saudi Arabia", "Saudi Arabia");
                break;
            case 11 :
                randomPerson = new Person("Ali Khamenei", "https://upload.wikimedia.org/wikipedia/commons/e/ee/Portrait_of_Ali_Khamenei_2016.jpg", "Supreme Leader of Iran", "Iran");
                break;
            case 12 :
                randomPerson = new Person("Benjamin Netanyahu", "https://upload.wikimedia.org/wikipedia/commons/1/1e/Benjamin_Netanyahu_portrait.jpg", "Prime Minister of Israel", "Israel");
                break;
            case 13 :
                randomPerson = new Person("Barrak Obama", "https://upload.wikimedia.org/wikipedia/commons/e/e9/Official_portrait_of_Barack_Obama.jpg", "President of the United States", "United States of America");
                break;
            default :
                randomPerson = new Person("Barrak Obama", "https://upload.wikimedia.org/wikipedia/commons/e/e9/Official_portrait_of_Barack_Obama.jpg", "President of the United States", "United States of America");
        }

        return randomPerson;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }





}
