package com.karenfreemansmith.flashcards.models;

import java.util.Random;

/**
 * Created by Guest on 12/19/16.
 */
public class Person {
    public static final int LEVEL_1 = 67;
    public static final int LEVEL_2 = 119;  // needs to be updated as list is expanded!!!
    public static final int LEVEL_3 = 119;  // will change as more peope are added
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

    public static Person getRandomPerson(int level) {
        int dataSize=0;
        // Can/should I pull the collection from the database and do a random on the length of the ArrayList?
        switch (level) {
            case 1:
                dataSize = LEVEL_1;
                break;
            case 2:
                dataSize = LEVEL_2;
                break;
            default:
                dataSize = LEVEL_3;
        }
        Person randomPerson = new Person("Not Found", "Minister","Something is Wrong", "http://allsoulschurch.org/media/1811/avatar_blank_male_300-390x390.jpg", "", "", "","");
        Person[] people = new Person[172];

        //Add people to array...
        people[0] = new Person("Barrak Obama",
            "President", "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/e/e9/Official_portrait_of_Barack_Obama.jpg",
            "https://en.wikipedia.org/wiki/President_of_the_United_States","https://en.wikipedia.org/wiki/Barack_Obama",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[1] = new Person("Xi Jinping",
            "President",
            "the People's Republic of China",
            "https://upload.wikimedia.org/wikipedia/commons/3/3f/Xi_Jinping_October_2015.jpg",
            "https://en.wikipedia.org/wiki/President_of_the_People%27s_Republic_of_China",
            "https://en.wikipedia.org/wiki/Xi_Jinping",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Flag_of_the_People%27s_Republic_of_China.svg/125px-Flag_of_the_People%27s_Republic_of_China.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/People%27s_Republic_of_China_%28orthographic_projection%29.svg/220px-People%27s_Republic_of_China_%28orthographic_projection%29.svg.png");
        people[2] = new Person("Xi Jinping",
            "General Secretary of the Communist Party",
            "the People's Republic of China",
            "https://upload.wikimedia.org/wikipedia/commons/3/3f/Xi_Jinping_October_2015.jpg",
            "https://en.wikipedia.org/wiki/General_Secretary_of_the_Communist_Party_of_China",
            "https://en.wikipedia.org/wiki/Xi_Jinping",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Flag_of_the_People%27s_Republic_of_China.svg/125px-Flag_of_the_People%27s_Republic_of_China.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/People%27s_Republic_of_China_%28orthographic_projection%29.svg/220px-People%27s_Republic_of_China_%28orthographic_projection%29.svg.png");
        people[3] = new Person("Li Keqiang",
            "Premier of the State Council",
            "the People's Republic of China",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0b/Li_Keqiang_%28cropped%29.jpg/220px-Li_Keqiang_%28cropped%29.jpg",
            "https://en.wikipedia.org/wiki/Premier_of_the_People%27s_Republic_of_China",
            "https://en.wikipedia.org/wiki/Li_Keqiang",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Flag_of_the_People%27s_Republic_of_China.svg/125px-Flag_of_the_People%27s_Republic_of_China.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/People%27s_Republic_of_China_%28orthographic_projection%29.svg/220px-People%27s_Republic_of_China_%28orthographic_projection%29.svg.png");
        people[4] = new Person("Vladimir Putin",
            "President",
            "Russia",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2b/Vladimir_Putin_June_2016.jpg/452px-Vladimir_Putin_June_2016.jpg",
            "https://en.wikipedia.org/wiki/President_of_Russia",
            "https://en.wikipedia.org/wiki/Vladimir_Putin",
            "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/125px-Flag_of_Russia.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Russian_Federation_%28orthographic_projection%29_-_Crimea_disputed.svg/220px-Russian_Federation_%28orthographic_projection%29_-_Crimea_disputed.svg.png");
        people[5] = new Person("Dmitry Medvedev",
            "Prime Minister",
            "Russia",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/Dmitry_Medvedev%2C_September_2016.jpeg/220px-Dmitry_Medvedev%2C_September_2016.jpeg",
            "https://en.wikipedia.org/wiki/Prime_Minister_of_Russia",
            "https://en.wikipedia.org/wiki/Dmitry_Medvedev",
            "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/125px-Flag_of_Russia.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Russian_Federation_%28orthographic_projection%29_-_Crimea_disputed.svg/220px-Russian_Federation_%28orthographic_projection%29_-_Crimea_disputed.svg.png");
        people[6] = new Person("Angela Merkel",
            "Chancellor",
            "Germany",
            "https://upload.wikimedia.org/wikipedia/commons/2/21/Angela_Merkel_-_Juli_2010_-_3zu4_cropped.jpg",
            "https://en.wikipedia.org/wiki/Chancellor_of_Germany_(1949%E2%80%93)",
            "https://en.wikipedia.org/wiki/Angela_Merkel",
            "https://en.wikipedia.org/wiki/File:Flag_of_Germany.svg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/2/26/EU-Germany.svg/250px-EU-Germany.svg.png");
        people[7] = new Person("Joachim Gauck",
            "President",
            "Germany",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/2012-06-05_Bundespraesident_Joachim_Gauck_Berlin.jpg/220px-2012-06-05_Bundespraesident_Joachim_Gauck_Berlin.jpg",
            "https://en.wikipedia.org/wiki/President_of_Germany",
            "https://en.wikipedia.org/wiki/Joachim_Gauck",
            "https://en.wikipedia.org/wiki/File:Flag_of_Germany.svg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/2/26/EU-Germany.svg/250px-EU-Germany.svg.png");
        people[8] = new Person("Narendra Modi",
            "Prime Minister",
            "India",
            "https://upload.wikimedia.org/wikipedia/commons/9/90/PM_Modi_2015.jpg",
            "https://en.wikipedia.org/wiki/Prime_Minister_of_India",
            "https://en.wikipedia.org/wiki/Narendra_Modi",
            "https://upload.wikimedia.org/wikipedia/en/thumb/4/41/Flag_of_India.svg/125px-Flag_of_India.svg.png",
            "https://en.wikipedia.org/wiki/File:India_(orthographic_projection).svg");
        people[9] = new Person("Pranab Mukherjee",
            "President",
            "India",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c0/Secretary_Tim_Geithner_and_Finance_Minister_Pranab_Mukherjee_2010_crop.jpg/220px-Secretary_Tim_Geithner_and_Finance_Minister_Pranab_Mukherjee_2010_crop.jpg",
            "https://en.wikipedia.org/wiki/President_of_India",
            "https://en.wikipedia.org/wiki/Pranab_Mukherjee",
            "https://upload.wikimedia.org/wikipedia/en/thumb/4/41/Flag_of_India.svg/125px-Flag_of_India.svg.png",
            "https://en.wikipedia.org/wiki/File:India_(orthographic_projection).svg");
        people[10] = new Person("Pope Francis",
            "Sovereign",
            "Vatican City",
            "https://upload.wikimedia.org/wikipedia/commons/4/4d/Franciscus_in_2015.jpg",
            "https://en.wikipedia.org/wiki/List_of_sovereigns_of_Vatican_City_State",
            "https://en.wikipedia.org/wiki/Pope_Francis",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/Flag_of_the_Vatican_City.svg/125px-Flag_of_the_Vatican_City.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/8/89/Location_of_the_Vatican_City_in_Europe.svg/250px-Location_of_the_Vatican_City_in_Europe.svg.png");
        people[11] = new Person("Theresa May",
            "Prime Minister",
            "The United Kingdom",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/ae/Theresa_May_UK_Home_Office_%28cropped%29.jpg/220px-Theresa_May_UK_Home_Office_%28cropped%29.jpg",
            "https://en.wikipedia.org/wiki/Prime_Minister_of_the_United_Kingdom",
            "https://en.wikipedia.org/wiki/Theresa_May",
            "https://en.wikipedia.org/wiki/File:Flag_of_the_United_Kingdom.svg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/EU-United_Kingdom.svg/250px-EU-United_Kingdom.svg.png");
        people[12] = new Person("Elizabeth II",
            "Queen",
            "The United Kingdom",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Queen_Elizabeth_II_March_2015.jpg/220px-Queen_Elizabeth_II_March_2015.jpg",
            "https://en.wikipedia.org/wiki/Monarchy_of_the_United_Kingdom",
            "https://en.wikipedia.org/wiki/Elizabeth_II",
            "https://en.wikipedia.org/wiki/File:Flag_of_the_United_Kingdom.svg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/EU-United_Kingdom.svg/250px-EU-United_Kingdom.svg.png");
        people[13] = new Person("Francois Hollande",
            "President",
            "France",
            "https://upload.wikimedia.org/wikipedia/commons/0/07/Fran%C3%A7ois_Hollande_%28Journ%C3%A9es_de_Nantes_2012%29.jpg",
            "https://en.wikipedia.org/wiki/President_of_France",
            "https://en.wikipedia.org/wiki/Fran%C3%A7ois_Hollande",
            "https://en.wikipedia.org/wiki/File:Flag_of_France.svg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a3/EU-France.svg/250px-EU-France.svg.png");
        people[14] = new Person("Bernard Cazeneuve",
            "Prime Minister",
            "France",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/Ministru_prezidents_Valdis_Dombrovskis_tiekas_ar_Francijas_Eiropas_lietu_ministru_Bern%C4%81ru_Kazen%C4%93vu_%28Bernard_Cazeneuve%29_%287985359635%29_%28cropped%29.jpg/538px-Ministru_prezidents_Valdis_Dombrovskis_tiekas_ar_Francijas_Eiropas_lietu_ministru_Bern%C4%81ru_Kazen%C4%93vu_%28Bernard_Cazeneuve%29_%287985359635%29_%28cropped%29.jpg",
            "https://en.wikipedia.org/wiki/Prime_Minister_of_France",
            "https://en.wikipedia.org/wiki/Bernard_Cazeneuve",
            "https://en.wikipedia.org/wiki/File:Flag_of_France.svg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a3/EU-France.svg/250px-EU-France.svg.png");
        people[15] = new Person("Shinzo Abe",
            "Prime Minister",
            "Japan",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/Shinz%C5%8D_Abe_April_2015.jpg/450px-Shinz%C5%8D_Abe_April_2015.jpg",
            "https://en.wikipedia.org/wiki/Prime_Minister_of_Japan",
            "https://en.wikipedia.org/wiki/Shinz%C5%8D_Abe",
            "https://upload.wikimedia.org/wikipedia/en/thumb/9/9e/Flag_of_Japan.svg/125px-Flag_of_Japan.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/6/62/Japan_%28orthographic_projection%29.svg/220px-Japan_%28orthographic_projection%29.svg.png");
        people[16] = new Person("Akihito",
            "Emperor",
            "Japan",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/Emperor_Akihito_cropped_2_Barack_Obama_Emperor_Akihito_and_Empress_Michiko_20140424_1.jpg/427px-Emperor_Akihito_cropped_2_Barack_Obama_Emperor_Akihito_and_Empress_Michiko_20140424_1.jpg",
            "https://en.wikipedia.org/wiki/Emperor_of_Japan",
            "https://en.wikipedia.org/wiki/Akihito",
            "https://upload.wikimedia.org/wikipedia/en/thumb/9/9e/Flag_of_Japan.svg/125px-Flag_of_Japan.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/6/62/Japan_%28orthographic_projection%29.svg/220px-Japan_%28orthographic_projection%29.svg.png");
        people[17] = new Person("Michel Temer",
            "President",
            "Brazil",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/8/86/Michel_Temer_planalto_3_%28cropped%29.jpg/454px-Michel_Temer_planalto_3_%28cropped%29.jpg",
            "https://en.wikipedia.org/wiki/President_of_Brazil",
            "https://en.wikipedia.org/wiki/Michel_Temer",
            "https://upload.wikimedia.org/wikipedia/en/thumb/0/05/Flag_of_Brazil.svg/125px-Flag_of_Brazil.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3b/Brazil_%28orthographic_projection%29.svg/250px-Brazil_%28orthographic_projection%29.svg.png");
        people[18] = new Person("Salman bin Abdulaziz al Saud",
            "King",
            "Saudi Arabia",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7f/Prince_Salman_bin_Abd_al-Aziz_Al_Saud_at_the_Pentagon_April_2012.jpg/479px-Prince_Salman_bin_Abd_al-Aziz_Al_Saud_at_the_Pentagon_April_2012.jpg",
            "https://en.wikipedia.org/wiki/King_of_Saudi_Arabia",
            "https://en.wikipedia.org/wiki/Salman_of_Saudi_Arabia",
            "https://en.wikipedia.org/wiki/File:Flag_of_Saudi_Arabia.svg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/Saudi_Arabia_%28orthographic_projection%29.svg/250px-Saudi_Arabia_%28orthographic_projection%29.svg.png");
        people[19] = new Person("Hassan Rouhani",
            "President",
            "Iran",
            "https://upload.wikimedia.org/wikipedia/commons/1/14/Hassan_Rouhani.jpg",
            "https://en.wikipedia.org/wiki/President_of_Iran",
            "https://en.wikipedia.org/wiki/Hassan_Rouhani",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Flag_of_Iran.svg/125px-Flag_of_Iran.svg.png",
            "https://en.wikipedia.org/wiki/File:Iran_(orthographic_projection).svg");
        people[20] = new Person("Ali Khamenei",
            "Supreme Leader",
            "Iran",
            "https://upload.wikimedia.org/wikipedia/commons/e/ee/Portrait_of_Ali_Khamenei_2016.jpg",
            "https://en.wikipedia.org/wiki/Supreme_Leader_of_Iran",
            "https://en.wikipedia.org/wiki/Ali_Khamenei",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Flag_of_Iran.svg/125px-Flag_of_Iran.svg.png",
            "https://en.wikipedia.org/wiki/File:Iran_(orthographic_projection).svg");
        people[21] = new Person("Park Geun-hye",
            "President",
            "South Korea",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/4/40/Park_Geun-hye_%288724400493%29_%28cropped%29.jpg/368px-Park_Geun-hye_%288724400493%29_%28cropped%29.jpg",
            "https://en.wikipedia.org/wiki/President_of_South_Korea",
            "https://en.wikipedia.org/wiki/Park_Geun-hye",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/Flag_of_South_Korea.svg/125px-Flag_of_South_Korea.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/South_Korea_%28orthographic_projection%29.svg/220px-South_Korea_%28orthographic_projection%29.svg.png");
        people[22] = new Person("Hwang Kyo-ahn",
            "Prime Minister",
            "South Korea",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/Hwang_Kyo-ahn_December_2016.jpg/220px-Hwang_Kyo-ahn_December_2016.jpg",
            "https://en.wikipedia.org/wiki/Prime_Minister_of_South_Korea",
            "https://en.wikipedia.org/wiki/Hwang_Kyo-ahn",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/Flag_of_South_Korea.svg/125px-Flag_of_South_Korea.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/South_Korea_%28orthographic_projection%29.svg/220px-South_Korea_%28orthographic_projection%29.svg.png");
        people[23] = new Person("Benjamin Netanyahu",
            "Prime Minister",
            "Israel",
            "https://upload.wikimedia.org/wikipedia/commons/1/1e/Benjamin_Netanyahu_portrait.jpg",
            "https://en.wikipedia.org/wiki/Prime_Minister_of_Israel",
            "https://en.wikipedia.org/wiki/Benjamin_Netanyahu",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/Flag_of_Israel.svg/125px-Flag_of_Israel.svg.png",
            "https://en.wikipedia.org/wiki/File:ISR_orthographic.svg");
        people[24] = new Person("Reuven Rivlin",
            "President",
            "Israel",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7e/Reuven_Rivlin_as_the_president_of_Israel.jpg/220px-Reuven_Rivlin_as_the_president_of_Israel.jpg",
            "https://en.wikipedia.org/wiki/President_of_Israel",
            "https://en.wikipedia.org/wiki/Reuven_Rivlin",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/Flag_of_Israel.svg/125px-Flag_of_Israel.svg.png",
            "https://en.wikipedia.org/wiki/File:ISR_orthographic.svg");
        people[25] = new Person("Joe Biden",
            "Vice President",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ea/Official_portrait_of_Vice_President_Joe_Biden.jpg/220px-Official_portrait_of_Vice_President_Joe_Biden.jpg",
            "https://en.wikipedia.org/wiki/Vice_President_of_the_United_States",
            "https://en.wikipedia.org/wiki/Joe_Biden",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[26] = new Person("Paul Ryan",
            "Speaker of the House of Representatives",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/Paul_Ryan_official_Speaker_portrait.jpg/220px-Paul_Ryan_official_Speaker_portrait.jpg",
            "https://en.wikipedia.org/wiki/Speaker_of_the_United_States_House_of_Representatives",
            "https://en.wikipedia.org/wiki/Paul_Ryan",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[27] = new Person("John Roberts",
            "Chief Justice of the United States",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Official_roberts_CJ.jpg/220px-Official_roberts_CJ.jpg",
            "https://en.wikipedia.org/wiki/Chief_Justice_of_the_United_States",
            "https://en.wikipedia.org/wiki/John_G._Roberts",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[28] = new Person("Jimmy Carter",
            "Former President",
            "the United States of America",
            "https://en.wikipedia.org/wiki/Jimmy_Carter",
            "https://en.wikipedia.org/wiki/President_of_the_United_States",
            "https://en.wikipedia.org/wiki/Jimmy_Carter",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[29] = new Person("George H.W. Bush",
            "Former President",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/George_H._W._Bush%2C_President_of_the_United_States%2C_1989_official_portrait.jpg/220px-George_H._W._Bush%2C_President_of_the_United_States%2C_1989_official_portrait.jpg",
            "https://en.wikipedia.org/wiki/President_of_the_United_States",
            "https://en.wikipedia.org/wiki/George_H._W._Bush",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[30] = new Person("Bill Clinton",
            "Former President",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/44_Bill_Clinton_3x4.jpg/220px-44_Bill_Clinton_3x4.jpg",
            "https://en.wikipedia.org/wiki/President_of_the_United_States",
            "https://en.wikipedia.org/wiki/Bill_Clinton",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[31] = new Person("George W. Bush",
            "Former President",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/George-W-Bush.jpeg/220px-George-W-Bush.jpeg",
            "https://en.wikipedia.org/wiki/President_of_the_United_States",
            "https://en.wikipedia.org/wiki/George_W._Bush",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[32] = new Person("John Kerry",
            "Secretary of State",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/John_Kerry_official_Secretary_of_State_portrait.jpg/220px-John_Kerry_official_Secretary_of_State_portrait.jpg",
            "https://en.wikipedia.org/wiki/United_States_Secretary_of_State",
            "https://en.wikipedia.org/wiki/John_Kerry",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[33] = new Person("Ban Ki-moon",
            "Secretary-General",
            "the United Nations",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/70/Ban_Ki-moon_February_2016.jpg/220px-Ban_Ki-moon_February_2016.jpg",
            "https://en.wikipedia.org/wiki/Secretary-General_of_the_United_Nations",
            "https://en.wikipedia.org/wiki/Ban_Ki-moon",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2f/Flag_of_the_United_Nations.svg/125px-Flag_of_the_United_Nations.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/9/91/United_Nations_Members_%28green%E2%80%93grey_scheme%29.svg/250px-United_Nations_Members_%28green%E2%80%93grey_scheme%29.svg.png");
        people[34] = new Person("Anthony Kennedy",
            "Associate Justice of the Supreme Court",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/Anthony_Kennedy_official_SCOTUS_portrait.jpg/220px-Anthony_Kennedy_official_SCOTUS_portrait.jpg",
            "https://en.wikipedia.org/wiki/Associate_Justice_of_the_Supreme_Court_of_the_United_States",
            "https://en.wikipedia.org/wiki/Anthony_Kennedy",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[35] = new Person("Clarence Thomas",
            "Associate Justice of the Supreme Court",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/5/58/Clarence_Thomas_official_SCOTUS_portrait.jpg/220px-Clarence_Thomas_official_SCOTUS_portrait.jpg",
            "https://en.wikipedia.org/wiki/Associate_Justice_of_the_Supreme_Court_of_the_United_States",
            "https://en.wikipedia.org/wiki/Clarence_Thomas",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[36] = new Person("Ruth Bader Ginsburg",
            "Associate Justice of the Supreme Court",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/1/17/Ruth_Bader_Ginsburg_official_SCOTUS_portrait.jpg",
            "https://en.wikipedia.org/wiki/Associate_Justice_of_the_Supreme_Court_of_the_United_States",
            "https://en.wikipedia.org/wiki/Ruth_Bader_Ginsburg",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[37] = new Person("Stephen Breyer",
            "Associate Justice of the Supreme Court",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/9/9c/Stephen_Breyer%2C_SCOTUS_photo_portrait.jpg",
            "https://en.wikipedia.org/wiki/Associate_Justice_of_the_Supreme_Court_of_the_United_States",
            "https://en.wikipedia.org/wiki/Stephen_Breyer",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[38] = new Person("Samuel Alito",
            "Associate Justice of the Supreme Court",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/010_alito.jpg/220px-010_alito.jpg",
            "https://en.wikipedia.org/wiki/Associate_Justice_of_the_Supreme_Court_of_the_United_States",
            "https://en.wikipedia.org/wiki/Samuel_Alito",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[39] = new Person("Sonia Sotomayor",
            "Associate Justice of the Supreme Court",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/1/15/Sonia_Sotomayor_in_SCOTUS_robe.jpg/220px-Sonia_Sotomayor_in_SCOTUS_robe.jpg",
            "https://en.wikipedia.org/wiki/Associate_Justice_of_the_Supreme_Court_of_the_United_States",
            "https://en.wikipedia.org/wiki/Sonia_Sotomayor",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[40] = new Person("Elena Kagan",
            "Associate Justice of the Supreme Court",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/Elena_Kagan_Official_SCOTUS_Portrait_%282013%29.jpg/220px-Elena_Kagan_Official_SCOTUS_Portrait_%282013%29.jpg",
            "https://en.wikipedia.org/wiki/Associate_Justice_of_the_Supreme_Court_of_the_United_States",
            "https://en.wikipedia.org/wiki/Elena_Kagan",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[41] = new Person("(vacant seat)",
            "Associate Justice of the Supreme Court",
            "the United States of America",
            ".jpg",
            "https://en.wikipedia.org/wiki/Associate_Justice_of_the_Supreme_Court_of_the_United_States",
            "https://en.wikipedia.org/wiki/Dick_Cheney",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[42] = new Person("John Paul Stevens",
            "Retired Associate Justice of the Supreme Court",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3b/John_Paul_Stevens%2C_SCOTUS_photo_portrait.jpg/220px-John_Paul_Stevens%2C_SCOTUS_photo_portrait.jpg",
            "https://en.wikipedia.org/wiki/Associate_Justice_of_the_Supreme_Court_of_the_United_States",
            "https://en.wikipedia.org/wiki/John_Paul_Stevens",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[43] = new Person("Sandra Day O'Connor",
            "Retired Associate Justice of the Supreme Court",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/Sandra_Day_O%27Connor.jpg/220px-Sandra_Day_O%27Connor.jpg",
            "https://en.wikipedia.org/wiki/Associate_Justice_of_the_Supreme_Court_of_the_United_States",
            "https://en.wikipedia.org/wiki/Sandra_Day_O%27Connor",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[44] = new Person("David Souter",
            "Retired Associate Justice of the Supreme Court",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/2/2f/DavidSouter.jpg",
            "https://en.wikipedia.org/wiki/Associate_Justice_of_the_Supreme_Court_of_the_United_States",
            "https://en.wikipedia.org/wiki/David_Souter",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[45] = new Person("Jack Lew",
            "Secretary of the Treasury",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/Jacob_Lew_official_portrait.jpg/220px-Jacob_Lew_official_portrait.jpg",
            "https://en.wikipedia.org/wiki/United_States_Secretary_of_the_Treasury",
            "https://en.wikipedia.org/wiki/Jack_Lew",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[46] = new Person("Ash Carter",
            "Secretary of Defense",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/8/89/Ash_Carter_DOD_Secretary_Portrait.jpg/220px-Ash_Carter_DOD_Secretary_Portrait.jpg",
            "https://en.wikipedia.org/wiki/United_States_Secretary_of_Defense",
            "https://en.wikipedia.org/wiki/Ash_Carter",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[47] = new Person("Loretta Lynch",
            "Attorney General",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/Loretta_Lynch%2C_official_portrait.jpg/220px-Loretta_Lynch%2C_official_portrait.jpg",
            "https://en.wikipedia.org/wiki/United_States_Attorney_General",
            "https://en.wikipedia.org/wiki/Loretta_Lynch",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[48] = new Person("Sally Jewell",
            "Secretary of the Interior",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/75/Sally_Jewell_official_portrait.jpg/220px-Sally_Jewell_official_portrait.jpg",
            "https://en.wikipedia.org/wiki/United_States_Secretary_of_the_Interior",
            "https://en.wikipedia.org/wiki/Sally_Jewell",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[49] = new Person("Tom Vilsack",
            "Secretary of Agriculture",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e6/Tom_Vilsack%2C_official_USDA_photo_portrait.jpg/220px-Tom_Vilsack%2C_official_USDA_photo_portrait.jpg",
            "https://en.wikipedia.org/wiki/United_States_Secretary_of_Agriculture",
            "https://en.wikipedia.org/wiki/Tom_Vilsack",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[50] = new Person("Penny Pritzker",
            "Secretary of Commerce",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/Penny_Pritzker_official_portrait.jpg/220px-Penny_Pritzker_official_portrait.jpg",
            "https://en.wikipedia.org/wiki/United_States_Secretary_of_Commerce",
            "https://en.wikipedia.org/wiki/Penny_Pritzker",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[51] = new Person("Tom Perez",
            "Secretary of Labor",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Official_portrait_of_United_States_Secretary_of_Labor_Tom_Perez.jpg/220px-Official_portrait_of_United_States_Secretary_of_Labor_Tom_Perez.jpg",
            "https://en.wikipedia.org/wiki/United_States_Secretary_of_Labor",
            "https://en.wikipedia.org/wiki/Thomas_Perez",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[52] = new Person("Sylvia Burwell",
            "Secretary of Health and Human Services",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/Sylvia_Mathews_Burwell_official_portrait.jpg/220px-Sylvia_Mathews_Burwell_official_portrait.jpg",
            "https://en.wikipedia.org/wiki/United_States_Secretary_of_Health_and_Human_Services",
            "https://en.wikipedia.org/wiki/Sylvia_Mathews_Burwell",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[53] = new Person("Julián Castro",
            "Secretary of Housing and Urban Development",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c6/Juli%C3%A1n_Castro%27s_Official_HUD_Portrait.jpg/220px-Juli%C3%A1n_Castro%27s_Official_HUD_Portrait.jpg",
            "https://en.wikipedia.org/wiki/United_States_Secretary_of_Housing_and_Urban_Development",
            "https://en.wikipedia.org/wiki/Julian_Castro",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[54] = new Person("Anthony Foxx",
            "Secretary of Transportation",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Anthony_Foxx_official_portrait.jpg/220px-Anthony_Foxx_official_portrait.jpg",
            "https://en.wikipedia.org/wiki/United_States_Secretary_of_Transportation",
            "https://en.wikipedia.org/wiki/Anthony_Foxx",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[55] = new Person("Ernest Moniz",
            "Secretary of Energy",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Moniz_official_portrait_standing.jpg/220px-Moniz_official_portrait_standing.jpg",
            "https://en.wikipedia.org/wiki/United_States_Secretary_of_Energy",
            "https://en.wikipedia.org/wiki/Ernest_Moniz",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[56] = new Person("John King",
            "Secretary of Education",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/John_B._King_official_portrait.jpg/220px-John_B._King_official_portrait.jpg",
            "https://en.wikipedia.org/wiki/United_States_Secretary_of_Education",
            "https://en.wikipedia.org/wiki/John_King_Jr.",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[57] = new Person("Bob McDonald",
            "Secretary of Veterans Affairs",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Robert_A._McDonald_Official_Portrait.jpg/220px-Robert_A._McDonald_Official_Portrait.jpg",
            "https://en.wikipedia.org/wiki/United_States_Secretary_of_Veterans_Affairs",
            "https://en.wikipedia.org/wiki/Robert_A._McDonald",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[58] = new Person("Jeh Johnson",
            "Secretary of Homeland Security",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3b/Jeh_Johnson_official_DHS_portrait.jpg/220px-Jeh_Johnson_official_DHS_portrait.jpg",
            "https://en.wikipedia.org/wiki/United_States_Secretary_of_Homeland_Security",
            "https://en.wikipedia.org/wiki/Jeh_Johnson",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[59] = new Person("Denis McDonough",
            "White House Chief of Staff",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/Denis_McDonough_2011.jpg/220px-Denis_McDonough_2011.jpg",
            "https://en.wikipedia.org/wiki/White_House_Chief_of_Staff",
            "https://en.wikipedia.org/wiki/Denis_McDonough",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[60] = new Person("Shaun Donovan",
            "Director of the Office of Management and Budget",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f8/DonovanShaunLS.jpg/220px-DonovanShaunLS.jpg",
            "https://en.wikipedia.org/wiki/Office_of_Management_and_Budget",
            "https://en.wikipedia.org/wiki/Shaun_Donovan",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[61] = new Person("Michael Botticelli",
            "Director of National Drug Control Policy",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/be/Michael_Botticelli.jpg/220px-Michael_Botticelli.jpg",
            "https://en.wikipedia.org/wiki/Office_of_National_Drug_Control_Policy",
            "https://en.wikipedia.org/wiki/Michael_Botticelli_(civil_servant)",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[62] = new Person("Michael Froman",
            "Trade Representative",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Michael_Froman_official_portrait.jpg/220px-Michael_Froman_official_portrait.jpg",
            "https://en.wikipedia.org/wiki/Office_of_the_United_States_Trade_Representative",
            "https://en.wikipedia.org/wiki/Michael_Froman",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[63] = new Person("Jim Clapper",
            "Director of National Intelligence",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ae/James_R._Clapper_official_portrait.jpg/220px-James_R._Clapper_official_portrait.jpg",
            "https://en.wikipedia.org/wiki/Director_of_National_Intelligence",
            "https://en.wikipedia.org/wiki/James_R._Clapper",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[64] = new Person("Samantha Power",
            "Ambassador to the United Nations",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7b/Samantha_Power.jpg/220px-Samantha_Power.jpg",
            "https://en.wikipedia.org/wiki/United_States_Ambassador_to_the_United_Nations",
            "https://en.wikipedia.org/wiki/Samantha_Power",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[65] = new Person("Orrin Hatch",
            "President pro tempore of the Senate",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Orrin_Hatch%2C_Official_Photograph.jpg/220px-Orrin_Hatch%2C_Official_Photograph.jpg",
            "https://en.wikipedia.org/wiki/President_pro_tempore_of_the_United_States_Senate",
            "https://en.wikipedia.org/wiki/Orrin_Hatch",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[66] = new Person("Patrick Leahy",
            "President pro tempore emeritus of the Senate",
            "the United States of America",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1c/Leahy2009.jpg/220px-Leahy2009.jpg",
            "https://en.wikipedia.org/wiki/President_pro_tempore_of_the_United_States_Senate#President_pro_tempore_emeritus",
            "https://en.wikipedia.org/wiki/Patrick_Leahy",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[67] = new Person("Thad Cochran",
            "Senator",
            "Mississippi",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/CochranThad%28R-MS%29.jpg/220px-CochranThad%28R-MS%29.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Mississippi",
            "https://en.wikipedia.org/wiki/Thad_Cochran",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[68] = new Person("Chuck Grassley",
            "Senator",
            "Iowa",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4a/Sen_Chuck_Grassley_official.jpg/220px-Sen_Chuck_Grassley_official.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Iowa",
            "https://en.wikipedia.org/wiki/Chuck_Grassley",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[69] = new Person("Mitch McConnell",
            "Senator",
            "Kentucky",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/Sen_Mitch_McConnell_official.jpg/473px-Sen_Mitch_McConnell_official.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Kentucky",
            "https://en.wikipedia.org/wiki/Mitch_McConnell",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[70] = new Person("Barbara Mikulski",
            "Senator",
            "Maryland",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Barbara_Mikulski_official_portrait_c._2011.jpg/220px-Barbara_Mikulski_official_portrait_c._2011.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Maryland",
            "https://en.wikipedia.org/wiki/Barbara_Mikulski",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[71] = new Person("Richard Shelby",
            "Senator",
            "Alabama",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/Richard_Shelby%2C_official_portrait%2C_112th_Congress.jpg/220px-Richard_Shelby%2C_official_portrait%2C_112th_Congress.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Alabama",
            "https://en.wikipedia.org/wiki/Richard_Shelby",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[72] = new Person("John McCain",
            "Senator",
            "Arizona",
            "https://upload.wikimedia.org/wikipedia/commons/e/e1/John_McCain_official_portrait_2009.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Arizona",
            "https://en.wikipedia.org/wiki/John_McCain",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[73] = new Person("Harry Reid",
            "Senator",
            "Nevada",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Harry_Reid_official_portrait_2009.jpg/220px-Harry_Reid_official_portrait_2009.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Nevada",
            "https://en.wikipedia.org/wiki/Harry_Reid",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[74] = new Person("Dianne Feinstein",
            "Senator",
            "California",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Dianne_Feinstein%2C_official_Senate_photo_2.jpg/220px-Dianne_Feinstein%2C_official_Senate_photo_2.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_California",
            "https://en.wikipedia.org/wiki/Dianne_Feinstein",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[75] = new Person("Barbara Boxer",
            "Senator",
            "California",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/1/18/Barbara_Boxer%2C_Official_Portrait%2C_112th_Congress.jpg/473px-Barbara_Boxer%2C_Official_Portrait%2C_112th_Congress.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_California",
            "https://en.wikipedia.org/wiki/Barbara_Boxer",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[76] = new Person("Patty Murray",
            "Senator",
            "Washington",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/Patty_Murray%2C_official_portrait%2C_113th_Congress.jpg/480px-Patty_Murray%2C_official_portrait%2C_113th_Congress.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Washington",
            "https://en.wikipedia.org/wiki/Patty_Murray",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[77] = new Person("Jim Inhofe",
            "Senator",
            "Oklahoma",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Jim_Inhofe%2C_official_photo_portrait%2C_2007.jpg/450px-Jim_Inhofe%2C_official_photo_portrait%2C_2007.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Oklahoma",
            "https://en.wikipedia.org/wiki/Jim_Inhofe",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[78] = new Person("Ron Wyden",
            "Senator",
            "Oregon",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e0/Ron_Wyden_official_photo.jpg/473px-Ron_Wyden_official_photo.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Oregon",
            "https://en.wikipedia.org/wiki/Ron_Wyden",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[79] = new Person("Pat Roberts",
            "Senator",
            "Kansas",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ea/Pat_Roberts_official_Senate_photo.jpg/398px-Pat_Roberts_official_Senate_photo.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Kansas",
            "https://en.wikipedia.org/wiki/Pat_Roberts",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[80] = new Person("Dick Durbin",
            "Senator",
            "Illinois",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/0/03/Richard_Durbin_official_photo.jpg/473px-Richard_Durbin_official_photo.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Illinois",
            "https://en.wikipedia.org/wiki/Dick_Durbin",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[81] = new Person("Jack Reed",
            "Senator",
            "Rhode Island",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fb/Jack_Reed%2C_official_portrait%2C_112th_Congress.jpg/480px-Jack_Reed%2C_official_portrait%2C_112th_Congress.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Rhode_Island",
            "https://en.wikipedia.org/wiki/Jack_Reed_(politician)",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[82] = new Person("Jeff Sessions",
            "Senator",
            "Alabama",
            "https://upload.wikimedia.org/wikipedia/commons/b/b9/Jeff_Sessions_official_portrait.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Alabama",
            "https://en.wikipedia.org/wiki/Jeff_Sessions",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[83] = new Person("Susan Collins",
            "Senator",
            "Maine",
            "https://upload.wikimedia.org/wikipedia/commons/8/8c/Sen_Susan_Collins_official.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Maine",
            "https://en.wikipedia.org/wiki/Susan_Collins",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[84] = new Person("Mike Enzi",
            "Senator",
            "Wyoming",
            "https://upload.wikimedia.org/wikipedia/commons/0/0e/Mike_Enzi%2C_official_portrait%2C_111th_Congress.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Wyoming",
            "https://en.wikipedia.org/wiki/Mike_Enzi",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[85] = new Person("Chuck Schumer",
            "Senator",
            "New York",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d6/Charles_Schumer_official_portrait.jpg/473px-Charles_Schumer_official_portrait.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_New_York",
            "https://en.wikipedia.org/wiki/Chuck_Schumer",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[86] = new Person("Mike Crapo",
            "Senator",
            "Idaho",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Mike_Crapo_Official_Photo_110th_Congress.jpg/466px-Mike_Crapo_Official_Photo_110th_Congress.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Idaho",
            "https://en.wikipedia.org/wiki/Mike_Crapo",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[87] = new Person("Bill Nelson",
            "Senator",
            "Florida",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/Bill_Nelson.jpg/435px-Bill_Nelson.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Florida",
            "https://en.wikipedia.org/wiki/Bill_Nelson",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[88] = new Person("Tom Carper",
            "Senator",
            "Delaware",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/8/85/Tom_Carper%2C_official_portrait%2C_112th_Congress.jpg/480px-Tom_Carper%2C_official_portrait%2C_112th_Congress.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Delaware",
            "https://en.wikipedia.org/wiki/Tom_Carper",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[89] = new Person("Debbie Stabenow",
            "Senator",
            "Michigan",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Debbie_Stabenow%2C_official_portrait.jpg/473px-Debbie_Stabenow%2C_official_portrait.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Michigan",
            "https://en.wikipedia.org/wiki/Debbie_Stabenow",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[90] = new Person("Maria Cantwell",
            "Senator",
            "Washington",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Maria_Cantwell%2C_official_portrait%2C_110th_Congress_2.jpg/400px-Maria_Cantwell%2C_official_portrait%2C_110th_Congress_2.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Washington",
            "https://en.wikipedia.org/wiki/Maria_Cantwell",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[91] = new Person("Lisa Murkowski",
            "Senator",
            "Alaska",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d6/Lisa_Murkowski.jpg/480px-Lisa_Murkowski.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Alaska",
            "https://en.wikipedia.org/wiki/Lisa_Murkowski",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[92] = new Person("Lindsey Graham",
            "Senator",
            "South Carolina",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Lindsey_Graham%2C_Official_Portrait_2006.jpg/473px-Lindsey_Graham%2C_Official_Portrait_2006.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_South_Carolina",
            "https://en.wikipedia.org/wiki/Lindsey_Graham",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[93] = new Person("Lamar Alexander",
            "Senator",
            "Tennessee",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/LamarAlexander.jpg/480px-LamarAlexander.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Tennessee",
            "https://en.wikipedia.org/wiki/Lamar_Alexander",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[94] = new Person("John Cornyn",
            "Senator",
            "Texas",
            "https://upload.wikimedia.org/wikipedia/commons/3/39/John_Cornyn_official_portrait%2C_2009.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Texas",
            "https://en.wikipedia.org/wiki/John_Cornyn",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[95] = new Person("Richard Burr",
            "Senator",
            "North Carolina",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a9/Richard_Burr_official_portrait.jpg/480px-Richard_Burr_official_portrait.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_North_Carolina",
            "https://en.wikipedia.org/wiki/Richard_Burr",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[96] = new Person("John Thune",
            "Senator",
            "South Dakota",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/John_Thune%2C_official_portrait%2C_111th_Congress.jpg/473px-John_Thune%2C_official_portrait%2C_111th_Congress.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_South_Dakota",
            "https://en.wikipedia.org/wiki/John_Thune",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[97] = new Person("Johnny Isakson",
            "Senator",
            "Georgia",
            "https://upload.wikimedia.org/wikipedia/commons/e/ef/Johnny_Isakson_official_Senate_photo.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Georgia",
            "https://en.wikipedia.org/wiki/Johnny_Isakson",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[98] = new Person("David Vitter",
            "Senator",
            "Louisiana",
            "https://upload.wikimedia.org/wikipedia/commons/e/e2/DVitterOfficial.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Louisiana",
            "https://en.wikipedia.org/wiki/David_Vitter",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[99] = new Person("Bob Menendez",
            "Senator",
            "New Jersey",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ed/Robert_Menendez_official_Senate_portrait.jpg/473px-Robert_Menendez_official_Senate_portrait.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_New_Jersey",
            "https://en.wikipedia.org/wiki/Bob_Menendez",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[100] = new Person("Ben Cardin",
            "Senator",
            "Maryland",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fb/Ben_Cardin_official_Senate_portrait.jpg/473px-Ben_Cardin_official_Senate_portrait.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Maryland",
            "https://en.wikipedia.org/wiki/Ben_Cardin",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[101] = new Person("Bernie Sanders",
            "Senator",
            "Vermont",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Bernie_Sanders.jpg/473px-Bernie_Sanders.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Vermont",
            "https://en.wikipedia.org/wiki/Bernie_Sanders",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[102] = new Person("Sherrod Brown",
            "Senator",
            "Ohio",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d5/Sherrod_Brown_official_photo_2009.jpg/473px-Sherrod_Brown_official_photo_2009.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Ohio",
            "https://en.wikipedia.org/wiki/Sherrod_Brown",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[103] = new Person("Bob Casey, Jr.",
            "Senator",
            "Pennsyvania",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/2/24/Senator_Bob_Casey_official_photo_2010.jpg/473px-Senator_Bob_Casey_official_photo_2010.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Pennsylvania",
            "https://en.wikipedia.org/wiki/Bob_Casey,_Jr.",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[104] = new Person("Bob Corker",
            "Senator",
            "Tennessee",
            "https://upload.wikimedia.org/wikipedia/commons/b/b2/Bob_Corker_official_Senate_photo.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Tennessee",
            "https://en.wikipedia.org/wiki/Bob_Corker",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[105] = new Person("Claire McCaskill",
            "Senator",
            "Missouri",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b3/Cm_official_photo_113th_Congress.jpg/400px-Cm_official_photo_113th_Congress.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Missouri",
            "https://en.wikipedia.org/wiki/Claire_McCaskill",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[106] = new Person("Amy Klobuchar",
            "Senator",
            "Minnesota",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b7/Amy_Klobuchar%2C_official_portrait%2C_113th_Congress.jpg/480px-Amy_Klobuchar%2C_official_portrait%2C_113th_Congress.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Minnesota",
            "https://en.wikipedia.org/wiki/Amy_Klobuchar",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[107] = new Person("Sheldon Whitehouse",
            "Senator",
            "Rhode Island",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c4/Sheldon_Whitehouse_2010.jpg/474px-Sheldon_Whitehouse_2010.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Rhode_Island",
            "https://en.wikipedia.org/wiki/Sheldon_Whitehouse",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[108] = new Person("Jon Tester",
            "Senator",
            "Montana",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1c/Jon_Tester%2C_official_110th_Congress_photo.jpg/473px-Jon_Tester%2C_official_110th_Congress_photo.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Montana",
            "https://en.wikipedia.org/wiki/Jon_Tester",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[109] = new Person("John Barrasso",
            "Senator",
            "Wyoming",
            "https://upload.wikimedia.org/wikipedia/commons/f/fb/John_Barrasso_official_portrait_112th_Congress.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Wyoming",
            "https://en.wikipedia.org/wiki/John_Barrasso",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[110] = new Person("Roger Wicker",
            "Senator",
            "Mississippi",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/SenatorRogerWicker%28R-MS%29.jpg/473px-SenatorRogerWicker%28R-MS%29.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Mississippi",
            "https://en.wikipedia.org/wiki/Roger_Wicker",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[111] = new Person("Tom Udall",
            "Senator",
            "New Mexico",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/8/87/Tom_Udall_official_Senate_portrait.jpg/473px-Tom_Udall_official_Senate_portrait.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_New_Mexico",
            "https://en.wikipedia.org/wiki/Tom_Udall",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[112] = new Person("Jeanne Shaheen",
            "Senator",
            "New Hampshire",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Jeanne_Shaheen%2C_official_Senate_photo_portrait%2C_2009.jpg/473px-Jeanne_Shaheen%2C_official_Senate_photo_portrait%2C_2009.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_New_Hampshire",
            "https://en.wikipedia.org/wiki/Jeanne_Shaheen",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[113] = new Person("Mark Warner",
            "Senator",
            "Virginia",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ae/Mark_Warner%2C_official_111th_Congress_photo_portrait.jpg/473px-Mark_Warner%2C_official_111th_Congress_photo_portrait.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Virginia",
            "https://en.wikipedia.org/wiki/Mark_Warner",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[114] = new Person("Jim Risch",
            "Senator",
            "Idaho",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b4/Jim_Risch_official_portrait.jpg/450px-Jim_Risch_official_portrait.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Idaho",
            "https://en.wikipedia.org/wiki/Jim_Risch",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[115] = new Person("Jeff Merkley",
            "Senator",
            "Oregon",
            "https://upload.wikimedia.org/wikipedia/commons/0/0a/Merkley_official_photo.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Oregon",
            "https://en.wikipedia.org/wiki/Jeff_Merkley",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[116] = new Person("Michael Bennet",
            "Senator",
            "Colorado",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Michael_Bennet_Official_Photo.jpg/473px-Michael_Bennet_Official_Photo.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Colorado",
            "https://en.wikipedia.org/wiki/Michael_Bennet",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[117] = new Person("Kirsten Gillibrand",
            "Senator",
            "New York",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/2/24/SenatorGillibrandpic.jpg/465px-SenatorGillibrandpic.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_New_York",
            "https://en.wikipedia.org/wiki/Kirsten_Gillibrand",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[118] = new Person("Al Franken",
            "Senator",
            "Minnesota",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/70/Al_Franken_Official_Senate_Portrait.jpg/473px-Al_Franken_Official_Senate_Portrait.jpg",
            "https://en.wikipedia.org/wiki/List_of_United_States_Senators_from_Minnesota",
            "https://en.wikipedia.org/wiki/Al_Franken",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[119] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[120] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[121] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[122] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[123] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[124] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[125] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[126] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[127] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[128] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[129] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[130] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[131] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[132] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[133] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[134] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[135] = new Person("Mn",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[136] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[137] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[138] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[140] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[141] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[142] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[143] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[144] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[145] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[146] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[147] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[148] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[149] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[150] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[151] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[152] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[153] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[154] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[155] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[156] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[157] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[158] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[159] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[160] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[161] = new Person("ny",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[162] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[163] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[164] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[165] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[166] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[167] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[168] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[169] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[170] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
        people[171] = new Person("n",
            "Senator",
            "location",
            "photo.jpg",
            "https:job",
            "https:person",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
//        people[xx] = new Person("name",
//            "Stitle",
//            "location",
//            "photo.jpg",
//            "https:job",
//            "https:person",
//            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
//            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
//        people[xx] = new Person("name",
//            "Stitle",
//            "location",
//            "photo.jpg",
//            "https:job",
//            "https:person",
//            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
//            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
//        people[xx] = new Person("name",
//            "Stitle",
//            "location",
//            "photo.jpg",
//            "https:job",
//            "https:person",
//            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
//            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");
//        people[xx] = new Person("name",
//            "Stitle",
//            "location",
//            "photo.jpg",
//            "https:job",
//            "https:person",
//            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/125px-Flag_of_the_United_States.svg.png",
//            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/USA_orthographic.svg/220px-USA_orthographic.svg.png");


        Random randomGenerator = new Random();
        int rand = randomGenerator.nextInt(dataSize);

        return people[rand];
    }
}
