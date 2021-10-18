package utils;


import java.util.Random;

public class TestsInfo {

    public static String getSearchObject() {
        return "DRESS";
    }


    public static String searchResult() {
        return "2";
    }

    public static String quantidade() {
        return "2";
    }

    public static String size() {
        return "m";
    }

    public static String color() {
        return "pink";
    }

    public static String modoDePagamento() {
        return "Bank wire";
    }

    public static String emailAccount() {
        Random random = new Random();
        int user = random.nextInt(1000);
        int domain = random.nextInt(1000);
        return user + "@" + domain + ".com";
    }

    //create an account info
    //Gender Mr or Mrs
    public static String gender() {return "Mr";}
    public static String customerFirstName() {return "Aaaa";}
    public static String customerLastName() {return "Eeee";}
    public static String password() {return "123456";}
    public static String days() {return "23";}
    public static String months() {return "May";}
    public static String years() {return "1990";}
    public static String company() {return "CWI";}
    public static String address1() {return "Random st";}
    public static String address2() {return "Apt";}
    public static String city() {return "Random";}
    public static String state() {return "Alaska";}
    public static String postCode() {return "22222";}
    public static String country() {return "United States";}
    public static String phone() {return "123456789";}
    public static String alias() {return "Test Home";}


}

