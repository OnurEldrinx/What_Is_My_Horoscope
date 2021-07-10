import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        int month,day;

        System.out.println("List of Months\n--------------");
        System.out.println("1.January\n2.February\n3.March\n4.April\n5.May\n6.June\n7.July\n8.August\n9.September\n10.October\n11.November\n12.December\n--------------");

        System.out.print("Which month were you born in: ");
        month = keyboard.nextInt();

        System.out.print("Which day of this month were you born in:");
        day = keyboard.nextInt();

        if (month == 1){

            if (day<=21){

                System.out.println("Your Horoscope: ♑ Capricorn ♑");

            }else{

                System.out.println("Your Horoscope: ♒ Aquarius ♒");


            }

        }else if (month == 2){

            if (day<=19){

                System.out.println("Your Horoscope: ♒ Aquarius ♒");

            }else{

                System.out.println("Your Horoscope: ♓ Pisces ♓");


            }

        }else if (month == 3){

            if (day<=20){

                System.out.println("Your Horoscope: ♓ Pisces ♓");

            }else{

                System.out.println("Your Horoscope: ♈ Aries ♈");


            }

        }else if (month == 4){

            if (day<=20){

                System.out.println("Your Horoscope: ♈ Aries ♈");

            }else{

                System.out.println("Your Horoscope: ♉ Taurus ♉");


            }

        }else if (month == 5){

            if (day<=21){

                System.out.println("Your Horoscope: ♉ Taurus ♉");

            }else{

                System.out.println("Your Horoscope: ♊ Gemini ♊");


            }

        }else if (month == 6){

            if (day<=22){

                System.out.println("Your Horoscope: ♊ Gemini ♊");

            }else{

                System.out.println("Your Horoscope: ♋ Cancer ♋");


            }

        }else if (month == 7){

            if (day<=22){

                System.out.println("Your Horoscope: ♋ Cancer ♋");

            }else{

                System.out.println("Your Horoscope: ♌ Leo ♌");


            }

        }else if (month == 8){

            if (day<=22){

                System.out.println("Your Horoscope: ♌ Leo ♌");

            }else{

                System.out.println("Your Horoscope: ♍ Virgo ♍");


            }

        }else if (month == 9){

            if (day<=22){

                System.out.println("Your Horoscope: ♍ Virgo ♍");

            }else{

                System.out.println("Your Horoscope: ♎ Libra ♎");


            }

        }else if (month == 10){

            if (day<=22){

                System.out.println("Your Horoscope: ♎ Libra ♎");

            }else{

                System.out.println("Your Horoscope: ♏ Scorpio ♏");


            }

        }else if (month == 11){

            if (day<=21){

                System.out.println("Your Horoscope: ♏ Scorpio ♏");

            }else{

                System.out.println("Your Horoscope: ♐ Sagittarius ♐");


            }

        }else if (month == 12){

            if (day<=21){

                System.out.println("Your Horoscope: ♐ Sagittarius ♐");

            }else{

                System.out.println("Your Horoscope: ♑ Capricorn ♑");


            }

        }else{

            System.out.println("Invalid Input");

        }








    }
}
