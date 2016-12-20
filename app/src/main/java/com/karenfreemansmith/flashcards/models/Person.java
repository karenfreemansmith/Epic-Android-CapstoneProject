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
    private boolean correctAnswer;

    public Person(String name, String title, String country, String photo, String office, String history, String flag, String map) {
        this.name = name;
        this.photo = photo;
        this.title = title;
        this.country = country;
        this.office = office;
        this.history = history;
        this.flag = flag;
        this.map = map;
        this.correctAnswer = false;
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

    public boolean isCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public static Person getRandomPerson() {

        // Can/should I pull the collection from the database and do a random on the length of the ArrayList?

        Person randomPerson = new Person("Not Found", "Minister","Something is Wrong", "http://allsoulschurch.org/media/1811/avatar_blank_male_300-390x390.jpg", "", "", "","");
        Random randomGenerator = new Random();
        int rand = randomGenerator.nextInt(25)+1;
        switch(rand) {
            case 1 :
                randomPerson = new Person("Barrak Obama",
                    "President",
                    "the United States of America",
                    "https://upload.wikimedia.org/wikipedia/commons/e/e9/Official_portrait_of_Barack_Obama.jpg",
                    "https://en.wikipedia.org/wiki/President_of_the_United_States",
                    "https://en.wikipedia.org/wiki/Barack_Obama",
                    "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
                break;
            case 2 :
                randomPerson = new Person("Xi Jinping",
                    "President",
                    "the People's Republic of China",
                    "https://upload.wikimedia.org/wikipedia/commons/3/3f/Xi_Jinping_October_2015.jpg",
                    "https://en.wikipedia.org/wiki/President_of_the_People%27s_Republic_of_China",
                    "https://en.wikipedia.org/wiki/Xi_Jinping",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Flag_of_the_People%27s_Republic_of_China.svg/125px-Flag_of_the_People%27s_Republic_of_China.svg.png",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/People%27s_Republic_of_China_%28orthographic_projection%29.svg/220px-People%27s_Republic_of_China_%28orthographic_projection%29.svg.png");
                break;
            case 3 :
                randomPerson = new Person("Xi Jinping",
                    "General Secretary of the Communist Party",
                    "the People's Republic of China",
                    "https://upload.wikimedia.org/wikipedia/commons/3/3f/Xi_Jinping_October_2015.jpg",
                    "https://en.wikipedia.org/wiki/General_Secretary_of_the_Communist_Party_of_China",
                    "https://en.wikipedia.org/wiki/Xi_Jinping",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Flag_of_the_People%27s_Republic_of_China.svg/125px-Flag_of_the_People%27s_Republic_of_China.svg.png",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/People%27s_Republic_of_China_%28orthographic_projection%29.svg/220px-People%27s_Republic_of_China_%28orthographic_projection%29.svg.png");
                break;
            case 4 :
                randomPerson = new Person("Li Keqiang",
                    "Premier of the State Council",
                    "the People's Republic of China",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0b/Li_Keqiang_%28cropped%29.jpg/220px-Li_Keqiang_%28cropped%29.jpg",
                    "https://en.wikipedia.org/wiki/Premier_of_the_People%27s_Republic_of_China",
                    "https://en.wikipedia.org/wiki/Li_Keqiang",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Flag_of_the_People%27s_Republic_of_China.svg/125px-Flag_of_the_People%27s_Republic_of_China.svg.png",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/People%27s_Republic_of_China_%28orthographic_projection%29.svg/220px-People%27s_Republic_of_China_%28orthographic_projection%29.svg.png");
                break;
            case 5 :
                randomPerson = new Person("Vladimir Putin",
                    "President",
                    "Russia",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2b/Vladimir_Putin_June_2016.jpg/452px-Vladimir_Putin_June_2016.jpg",
                    "https://en.wikipedia.org/wiki/President_of_Russia",
                    "https://en.wikipedia.org/wiki/Vladimir_Putin",
                    "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/125px-Flag_of_Russia.svg.png",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Russian_Federation_%28orthographic_projection%29_-_Crimea_disputed.svg/220px-Russian_Federation_%28orthographic_projection%29_-_Crimea_disputed.svg.png");
                break;
            case 6 :
                randomPerson = new Person("Dmitry Medvedev",
                    "Prime Minister",
                    "Russia",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/Dmitry_Medvedev%2C_September_2016.jpeg/220px-Dmitry_Medvedev%2C_September_2016.jpeg",
                    "https://en.wikipedia.org/wiki/Prime_Minister_of_Russia",
                    "https://en.wikipedia.org/wiki/Dmitry_Medvedev",
                    "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/125px-Flag_of_Russia.svg.png",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Russian_Federation_%28orthographic_projection%29_-_Crimea_disputed.svg/220px-Russian_Federation_%28orthographic_projection%29_-_Crimea_disputed.svg.png");
                break;
            case 7 :
                randomPerson = new Person("Angela Merkel",
                    "Chancellor",
                    "Germany",
                    "https://upload.wikimedia.org/wikipedia/commons/2/21/Angela_Merkel_-_Juli_2010_-_3zu4_cropped.jpg",
                    "https://en.wikipedia.org/wiki/Chancellor_of_Germany_(1949%E2%80%93)",
                    "https://en.wikipedia.org/wiki/Angela_Merkel",
                    "https://en.wikipedia.org/wiki/File:Flag_of_Germany.svg",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/2/26/EU-Germany.svg/250px-EU-Germany.svg.png");
                break;
            case 8 :
                randomPerson = new Person("Joachim Gauck",
                    "President",
                    "Germany",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/2012-06-05_Bundespraesident_Joachim_Gauck_Berlin.jpg/220px-2012-06-05_Bundespraesident_Joachim_Gauck_Berlin.jpg",
                    "https://en.wikipedia.org/wiki/President_of_Germany",
                    "https://en.wikipedia.org/wiki/Joachim_Gauck",
                    "https://en.wikipedia.org/wiki/File:Flag_of_Germany.svg",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/2/26/EU-Germany.svg/250px-EU-Germany.svg.png");
                break;
            case 9 :
                randomPerson = new Person("Narendra Modi",
                    "Prime Minister",
                    "India",
                    "https://upload.wikimedia.org/wikipedia/commons/9/90/PM_Modi_2015.jpg",
                    "https://en.wikipedia.org/wiki/Prime_Minister_of_India",
                    "https://en.wikipedia.org/wiki/Narendra_Modi",
                    "https://upload.wikimedia.org/wikipedia/en/thumb/4/41/Flag_of_India.svg/125px-Flag_of_India.svg.png",
                    "https://en.wikipedia.org/wiki/File:India_(orthographic_projection).svg");
                break;
            case 10 :
                randomPerson = new Person("Pranab Mukherjee",
                    "President",
                    "India",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c0/Secretary_Tim_Geithner_and_Finance_Minister_Pranab_Mukherjee_2010_crop.jpg/220px-Secretary_Tim_Geithner_and_Finance_Minister_Pranab_Mukherjee_2010_crop.jpg",
                    "https://en.wikipedia.org/wiki/President_of_India",
                    "https://en.wikipedia.org/wiki/Pranab_Mukherjee",
                    "https://upload.wikimedia.org/wikipedia/en/thumb/4/41/Flag_of_India.svg/125px-Flag_of_India.svg.png",
                    "https://en.wikipedia.org/wiki/File:India_(orthographic_projection).svg");
                break;
            case 11 :
                randomPerson = new Person("Pope Francis",
                    "Sovereign",
                    "Vatican City",
                    "https://upload.wikimedia.org/wikipedia/commons/4/4d/Franciscus_in_2015.jpg",
                    "https://en.wikipedia.org/wiki/List_of_sovereigns_of_Vatican_City_State",
                    "https://en.wikipedia.org/wiki/Pope_Francis",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/Flag_of_the_Vatican_City.svg/125px-Flag_of_the_Vatican_City.svg.png",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/8/89/Location_of_the_Vatican_City_in_Europe.svg/250px-Location_of_the_Vatican_City_in_Europe.svg.png");
                break;
            case 12 :
                randomPerson = new Person("Theresa May",
                    "Prime Minister",
                    "The United Kingdom",
                    "https://upload.wikimedia.org/wikipedia/en/thumb/a/ae/Theresa_May_UK_Home_Office_%28cropped%29.jpg/220px-Theresa_May_UK_Home_Office_%28cropped%29.jpg",
                    "https://en.wikipedia.org/wiki/Prime_Minister_of_the_United_Kingdom",
                    "https://en.wikipedia.org/wiki/Theresa_May",
                    "https://en.wikipedia.org/wiki/File:Flag_of_the_United_Kingdom.svg",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/EU-United_Kingdom.svg/250px-EU-United_Kingdom.svg.png");
                break;
            case 13 :
                randomPerson = new Person("Elizabeth II",
                    "Queen",
                    "The United Kingdom",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Queen_Elizabeth_II_March_2015.jpg/220px-Queen_Elizabeth_II_March_2015.jpg",
                    "https://en.wikipedia.org/wiki/Monarchy_of_the_United_Kingdom",
                    "https://en.wikipedia.org/wiki/Elizabeth_II",
                    "https://en.wikipedia.org/wiki/File:Flag_of_the_United_Kingdom.svg",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/EU-United_Kingdom.svg/250px-EU-United_Kingdom.svg.png");
                break;
            case 14 :
                randomPerson = new Person("Francois Hollande",
                    "President",
                    "France",
                    "https://upload.wikimedia.org/wikipedia/commons/0/07/Fran%C3%A7ois_Hollande_%28Journ%C3%A9es_de_Nantes_2012%29.jpg",
                    "https://en.wikipedia.org/wiki/President_of_France",
                    "https://en.wikipedia.org/wiki/Fran%C3%A7ois_Hollande",
                    "https://en.wikipedia.org/wiki/File:Flag_of_France.svg",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a3/EU-France.svg/250px-EU-France.svg.png");
                break;
            case 15 :
                randomPerson = new Person("Bernard Cazeneuve",
                    "Prime Minister",
                    "France",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/Ministru_prezidents_Valdis_Dombrovskis_tiekas_ar_Francijas_Eiropas_lietu_ministru_Bern%C4%81ru_Kazen%C4%93vu_%28Bernard_Cazeneuve%29_%287985359635%29_%28cropped%29.jpg/538px-Ministru_prezidents_Valdis_Dombrovskis_tiekas_ar_Francijas_Eiropas_lietu_ministru_Bern%C4%81ru_Kazen%C4%93vu_%28Bernard_Cazeneuve%29_%287985359635%29_%28cropped%29.jpg",
                    "https://en.wikipedia.org/wiki/Prime_Minister_of_France",
                    "https://en.wikipedia.org/wiki/Bernard_Cazeneuve",
                    "https://en.wikipedia.org/wiki/File:Flag_of_France.svg",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a3/EU-France.svg/250px-EU-France.svg.png");
                break;
            case 16 :
                randomPerson = new Person("Shinzo Abe",
                    "Prime Minister",
                    "Japan",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/Shinz%C5%8D_Abe_April_2015.jpg/450px-Shinz%C5%8D_Abe_April_2015.jpg",
                    "https://en.wikipedia.org/wiki/Prime_Minister_of_Japan",
                    "https://en.wikipedia.org/wiki/Shinz%C5%8D_Abe",
                    "https://upload.wikimedia.org/wikipedia/en/thumb/9/9e/Flag_of_Japan.svg/125px-Flag_of_Japan.svg.png",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/6/62/Japan_%28orthographic_projection%29.svg/220px-Japan_%28orthographic_projection%29.svg.png");
                break;
            case 17 :
                randomPerson = new Person("Akihito",
                    "Emperor",
                    "Japan",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/Emperor_Akihito_cropped_2_Barack_Obama_Emperor_Akihito_and_Empress_Michiko_20140424_1.jpg/427px-Emperor_Akihito_cropped_2_Barack_Obama_Emperor_Akihito_and_Empress_Michiko_20140424_1.jpg",
                    "https://en.wikipedia.org/wiki/Emperor_of_Japan",
                    "https://en.wikipedia.org/wiki/Akihito",
                    "https://upload.wikimedia.org/wikipedia/en/thumb/9/9e/Flag_of_Japan.svg/125px-Flag_of_Japan.svg.png",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/6/62/Japan_%28orthographic_projection%29.svg/220px-Japan_%28orthographic_projection%29.svg.png");
                break;
            case 18 :
                randomPerson = new Person("Michel Temer",
                    "President",
                    "Brazil",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/8/86/Michel_Temer_planalto_3_%28cropped%29.jpg/454px-Michel_Temer_planalto_3_%28cropped%29.jpg",
                    "https://en.wikipedia.org/wiki/President_of_Brazil",
                    "https://en.wikipedia.org/wiki/Michel_Temer",
                    "https://upload.wikimedia.org/wikipedia/en/thumb/0/05/Flag_of_Brazil.svg/125px-Flag_of_Brazil.svg.png",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3b/Brazil_%28orthographic_projection%29.svg/250px-Brazil_%28orthographic_projection%29.svg.png");
                break;
            case 19 :
                randomPerson = new Person("Salman bin Abdulaziz al Saud",
                    "King",
                    "Saudi Arabia",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7f/Prince_Salman_bin_Abd_al-Aziz_Al_Saud_at_the_Pentagon_April_2012.jpg/479px-Prince_Salman_bin_Abd_al-Aziz_Al_Saud_at_the_Pentagon_April_2012.jpg",
                    "https://en.wikipedia.org/wiki/King_of_Saudi_Arabia",
                    "https://en.wikipedia.org/wiki/Salman_of_Saudi_Arabia",
                    "https://en.wikipedia.org/wiki/File:Flag_of_Saudi_Arabia.svg",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/Saudi_Arabia_%28orthographic_projection%29.svg/250px-Saudi_Arabia_%28orthographic_projection%29.svg.png");
                break;
            case 20 :
                randomPerson = new Person("Hassan Rouhani",
                    "President",
                    "Iran",
                    "https://upload.wikimedia.org/wikipedia/commons/1/14/Hassan_Rouhani.jpg",
                    "https://en.wikipedia.org/wiki/President_of_Iran",
                    "https://en.wikipedia.org/wiki/Hassan_Rouhani",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Flag_of_Iran.svg/125px-Flag_of_Iran.svg.png",
                    "https://en.wikipedia.org/wiki/File:Iran_(orthographic_projection).svg");
                break;
            case 21 :
                randomPerson = new Person("Ali Khamenei",
                    "Supreme Leader",
                    "Iran",
                    "https://upload.wikimedia.org/wikipedia/commons/e/ee/Portrait_of_Ali_Khamenei_2016.jpg",
                    "https://en.wikipedia.org/wiki/Supreme_Leader_of_Iran",
                    "https://en.wikipedia.org/wiki/Ali_Khamenei",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Flag_of_Iran.svg/125px-Flag_of_Iran.svg.png",
                    "https://en.wikipedia.org/wiki/File:Iran_(orthographic_projection).svg");
                break;
            case 22 :
                randomPerson = new Person("Park Geun-hye",
                    "President",
                    "South Korea",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/4/40/Park_Geun-hye_%288724400493%29_%28cropped%29.jpg/368px-Park_Geun-hye_%288724400493%29_%28cropped%29.jpg",
                    "https://en.wikipedia.org/wiki/President_of_South_Korea",
                    "https://en.wikipedia.org/wiki/Park_Geun-hye",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/Flag_of_South_Korea.svg/125px-Flag_of_South_Korea.svg.png",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/South_Korea_%28orthographic_projection%29.svg/220px-South_Korea_%28orthographic_projection%29.svg.png");
                break;
            case 23 :
                randomPerson = new Person("Hwang Kyo-ahn",
                    "Prime Minister",
                    "South Korea",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/Hwang_Kyo-ahn_December_2016.jpg/220px-Hwang_Kyo-ahn_December_2016.jpg",
                    "https://en.wikipedia.org/wiki/Prime_Minister_of_South_Korea",
                    "https://en.wikipedia.org/wiki/Hwang_Kyo-ahn",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/Flag_of_South_Korea.svg/125px-Flag_of_South_Korea.svg.png",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/South_Korea_%28orthographic_projection%29.svg/220px-South_Korea_%28orthographic_projection%29.svg.png");
                break;
            case 24 :
                randomPerson = new Person("Benjamin Netanyahu",
                    "Prime Minister",
                    "Israel",
                    "https://upload.wikimedia.org/wikipedia/commons/1/1e/Benjamin_Netanyahu_portrait.jpg",
                    "https://en.wikipedia.org/wiki/Prime_Minister_of_Israel",
                    "https://en.wikipedia.org/wiki/Benjamin_Netanyahu",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/Flag_of_Israel.svg/125px-Flag_of_Israel.svg.png",
                    "https://en.wikipedia.org/wiki/File:ISR_orthographic.svg");
                break;
            case 25 :
                randomPerson = new Person("Reuven Rivlin",
                    "President",
                    "Israel",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7e/Reuven_Rivlin_as_the_president_of_Israel.jpg/220px-Reuven_Rivlin_as_the_president_of_Israel.jpg",
                    "https://en.wikipedia.org/wiki/President_of_Israel",
                    "https://en.wikipedia.org/wiki/Reuven_Rivlin",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/Flag_of_Israel.svg/125px-Flag_of_Israel.svg.png",
                    "https://en.wikipedia.org/wiki/File:ISR_orthographic.svg");
                break;

            default :
                randomPerson = new Person("Not Found", "Minister","Something is Wrong", "http://allsoulschurch.org/media/1811/avatar_blank_male_300-390x390.jpg", "", "", "","");
        }

        return randomPerson;
    }
}
