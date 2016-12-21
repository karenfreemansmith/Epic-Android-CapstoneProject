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
case 26 :
randomPerson = new Person("Joe Biden",
      "Vice President",
      "the United States of America",
      ".jpg",
      "https://en.wikipedia.org/wiki/Vice_President_of_the_United_States",
      "https://en.wikipedia.org/wiki/Joe_Biden",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 27 :
randomPerson = new Person("Paul Ryan",
      "Speaker of the House of Representatives",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 28 :
randomPerson = new Person("John Roberts",
      "Chief Justice of the United States",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 29 :
randomPerson = new Person("Jimmy Carter",
      "Former President",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 30 :
randomPerson = new Person("George H.W. Bush",
      "Former President",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 31 :
randomPerson = new Person("Bill Clinton",
      "Former President",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 32 :
randomPerson = new Person("George W. Bush",
      "Former President",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 33 :
randomPerson = new Person("John Kerry",
      "Secretary of State",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 34 :
randomPerson = new Person("Ban Ki-moon",
      "Secretary-General",
      "the United Nations",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7e/Reuven_Rivlin_as_the_president_of_Israel.jpg/220px-Reuven_Rivlin_as_the_president_of_Israel.jpg",
      "https://en.wikipedia.org/wiki/President_of_Israel",
      "https://en.wikipedia.org/wiki/Reuven_Rivlin",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/Flag_of_Israel.svg/125px-Flag_of_Israel.svg.png",
      "https://en.wikipedia.org/wiki/File:ISR_orthographic.svg");
break;

case 35 :
randomPerson = new Person("Anthony Kennedy",
      "Associate Justice of the Supreme Court",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 36 :
randomPerson = new Person("Clarence Thomas",
      "Associate Justice of the Supreme Court",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 37 :
randomPerson = new Person("Ruth Bader Ginsburg",
      "Associate Justice of the Supreme Court",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 38 :
randomPerson = new Person("Stephen Breyer",
      "Associate Justice of the Supreme Court",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 39 :
randomPerson = new Person("Samuel Alito",
      "Associate Justice of the Supreme Court",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 40 :
randomPerson = new Person("Sonia Sotomayor",
      "Associate Justice of the Supreme Court",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 41 :
randomPerson = new Person("Elena Kagan",
      "Associate Justice of the Supreme Court",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 42 :
randomPerson = new Person("(vacant seat)",
      "Associate Justice of the Supreme Court",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 43 :
randomPerson = new Person("John Paul Stevens",
      "Retired Associate Justice of the Supreme Court",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 44 :
randomPerson = new Person("Sandra Day O'Connor",
      "Retired Associate Justice of the Supreme Court",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 45 :
randomPerson = new Person("David Souter",
      "Retired Associate Justice of the Supreme Court",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 46 :
randomPerson = new Person("Jack Lew",
      "Secretary of the Treasury",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 47 :
randomPerson = new Person("Ash Carter",
      "Secretary of Defense",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 48 :
randomPerson = new Person("Loretta Lynch",
      "Attorney General",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 49 :
randomPerson = new Person("Sally Jewell",
      "Secretary of the Interior",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 50 :
randomPerson = new Person("Tom Vilsack",
      "Secretary of Agriculture",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 51 :
randomPerson = new Person("Penny Pritzker",
      "Secretary of Commerce",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 52 :
randomPerson = new Person("Tom Perez",
      "Secretary of Labor",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 53 :
randomPerson = new Person("Sylvia Burwell",
      "Secretary of Health and Human Services",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 54 :
randomPerson = new Person("Julián Castro",
      "Secretary of Housing and Urban Development",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 55 :
randomPerson = new Person("Anthony Foxx",
      "Secretary of Transportation",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 56 :
randomPerson = new Person("Ernest Moniz",
      "Secretary of Energy",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 57 :
randomPerson = new Person("John King",
      "Secretary of Education",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 58 :
randomPerson = new Person("Bob McDonald",
      "Secretary of Veterans Affairs",
      "the United States of America",
      ".jpg",
      "officeurl",
      "https://en.wikipedia.org/wiki/Dick_Cheney",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 59 :
randomPerson = new Person("Jeh Johnson",
      "Secretary of Homeland Security",
      "the United States of America",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3b/Jeh_Johnson_official_DHS_portrait.jpg/220px-Jeh_Johnson_official_DHS_portrait.jpg",
      "https://en.wikipedia.org/wiki/United_States_Secretary_of_Homeland_Security",
      "https://en.wikipedia.org/wiki/Jeh_Johnson",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 60 :
randomPerson = new Person("Denis McDonough",
      "White House Chief of Staff",
      "the United States of America",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/Denis_McDonough_2011.jpg/220px-Denis_McDonough_2011.jpg",
      "https://en.wikipedia.org/wiki/White_House_Chief_of_Staff",
      "https://en.wikipedia.org/wiki/Denis_McDonough",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 61 :
randomPerson = new Person("Shaun Donovan",
      "Director of the Office of Management and Budget",
      "the United States of America",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f8/DonovanShaunLS.jpg/220px-DonovanShaunLS.jpg",
      "https://en.wikipedia.org/wiki/Office_of_Management_and_Budget",
      "https://en.wikipedia.org/wiki/Shaun_Donovan",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 62 :
randomPerson = new Person("Michael Botticelli",
      "Director of National Drug Control Policy",
      "the United States of America",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/b/be/Michael_Botticelli.jpg/220px-Michael_Botticelli.jpg",
      "https://en.wikipedia.org/wiki/Office_of_National_Drug_Control_Policy",
      "https://en.wikipedia.org/wiki/Michael_Botticelli_(civil_servant)",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 63 :
randomPerson = new Person("Michael Froman",
      "Trade Representative",
      "the United States of America",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Michael_Froman_official_portrait.jpg/220px-Michael_Froman_official_portrait.jpg",
      "https://en.wikipedia.org/wiki/Office_of_the_United_States_Trade_Representative",
      "https://en.wikipedia.org/wiki/Michael_Froman",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 64 :
randomPerson = new Person("Jim Clapper",
      "Director of National Intelligence",
      "the United States of America",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ae/James_R._Clapper_official_portrait.jpg/220px-James_R._Clapper_official_portrait.jpg",
      "https://en.wikipedia.org/wiki/Director_of_National_Intelligence",
      "https://en.wikipedia.org/wiki/James_R._Clapper",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 65 :
randomPerson = new Person("Samantha Power",
      "Ambassador to the United Nations",
      "the United States of America",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7b/Samantha_Power.jpg/220px-Samantha_Power.jpg",
      "https://en.wikipedia.org/wiki/United_States_Ambassador_to_the_United_Nations",
      "https://en.wikipedia.org/wiki/Samantha_Power",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 66 :
randomPerson = new Person("Orrin Hatch",
      "President pro tempore of the Senate",
      "the United States of America",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Orrin_Hatch%2C_Official_Photograph.jpg/220px-Orrin_Hatch%2C_Official_Photograph.jpg",
      "https://en.wikipedia.org/wiki/President_pro_tempore_of_the_United_States_Senate",
      "https://en.wikipedia.org/wiki/Orrin_Hatch",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 67 :
randomPerson = new Person("Patrick Leahy",
      "President pro tempore emeritus of the Senate",
      "the United States of America",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1c/Leahy2009.jpg/220px-Leahy2009.jpg",
      "https://en.wikipedia.org/wiki/President_pro_tempore_of_the_United_States_Senate#President_pro_tempore_emeritus",
      "https://en.wikipedia.org/wiki/Patrick_Leahy",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 68 :
randomPerson = new Person("Thad Cochran",
      "Senator",
      "Mississippi",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/CochranThad%28R-MS%29.jpg/220px-CochranThad%28R-MS%29.jpg",
      "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Mississippi",
      "https://en.wikipedia.org/wiki/Thad_Cochran",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 69 :
randomPerson = new Person("Chuck Grassley",
      "Senator",
      "Iowa",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4a/Sen_Chuck_Grassley_official.jpg/220px-Sen_Chuck_Grassley_official.jpg",
      "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Iowa",
      "https://en.wikipedia.org/wiki/Chuck_Grassley",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 70 :
randomPerson = new Person("Mitch McConnell",
      "Senator",
      "Kentucky",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/Sen_Mitch_McConnell_official.jpg/473px-Sen_Mitch_McConnell_official.jpg",
      "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Kentucky",
      "https://en.wikipedia.org/wiki/Mitch_McConnell",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 71 :
randomPerson = new Person("Barbara Mikulski",
      "Senator",
      "Maryland",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Barbara_Mikulski_official_portrait_c._2011.jpg/220px-Barbara_Mikulski_official_portrait_c._2011.jpg",
      "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Maryland",
      "https://en.wikipedia.org/wiki/Barbara_Mikulski",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 72 :
randomPerson = new Person("Richard Shelby",
      "Senator",
      "Alabama",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/Richard_Shelby%2C_official_portrait%2C_112th_Congress.jpg/220px-Richard_Shelby%2C_official_portrait%2C_112th_Congress.jpg",
      "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Alabama",
      "https://en.wikipedia.org/wiki/Richard_Shelby",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 73 :
randomPerson = new Person("John McCain",
      "Senator",
      "Arizona",
      "https://upload.wikimedia.org/wikipedia/commons/e/e1/John_McCain_official_portrait_2009.jpg",
      "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Arizona",
      "https://en.wikipedia.org/wiki/John_McCain",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 74 :
randomPerson = new Person("Harry Reid",
      "Senator",
      "Nevada",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Harry_Reid_official_portrait_2009.jpg/220px-Harry_Reid_official_portrait_2009.jpg",
      "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Nevada",
      "https://en.wikipedia.org/wiki/Harry_Reid",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;

case 75 :
randomPerson = new Person("Dianne Feinstein",
      "Senator",
      "California",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Dianne_Feinstein%2C_official_Senate_photo_2.jpg/220px-Dianne_Feinstein%2C_official_Senate_photo_2.jpg",
      "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_California",
      "https://en.wikipedia.org/wiki/Dianne_Feinstein",
      "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
      "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
break;
            default :
                randomPerson = new Person("Not Found", "Minister","Something is Wrong", "http://allsoulschurch.org/media/1811/avatar_blank_male_300-390x390.jpg", "", "", "","");
        }

        return randomPerson;
    }
}
