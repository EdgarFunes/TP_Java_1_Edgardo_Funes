import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ejercicio1(input);
        ejercicio2(input);
        ejercicio3(input);


    }
    public static void ejercicio1(Scanner input){
        System.out.println("----------Ejercicio 1: Generador de Horóscopo");
        /*Escribe un programa que pida al usuario su fecha de nacimiento (en formato DD/MM/AAAA) y luego
        imprima su signo del zodiaco y un mensaje de horóscopo correspondiente.*/

        boolean ingresoCorrecto = false;
        String dateString;
        do{
            System.out.print("Ingrese una fecha DD/MM/AAAA: ");
            dateString = input.nextLine().replace("/", "-");

            try{
                SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
                Date fecha = formato.parse(dateString);
                ingresoCorrecto = true;

            }catch (Exception e) {
                System.out.println("Formato incorrecto, debe ingresar una fecha valida DD-MM-YYYY");
            }
        } while (!ingresoCorrecto);
        dateString = dateString.substring(3,5) + dateString.substring(0, 2);
        int dateInt = Integer.parseInt(dateString);

        if(dateInt >= 120 && dateInt <= 218){
            System.out.println("Acuario");
            System.out.println("Hoy es un buen día para abrirte a nuevas ideas.");
        }
        if(dateInt >= 219 && dateInt <= 320){
            System.out.println("Piscis");
            System.out.println("Confía en tu intuición y sigue tu corazón.");
        }
        if(dateInt >= 321 && dateInt <= 419){
            System.out.println("Aries");
            System.out.println("Es momento de tomar la iniciativa en tus proyectos.");
        }
        if(dateInt >= 420 && dateInt <= 520){
            System.out.println("Tauro");
            System.out.println("La estabilidad financiera está en tu camino.");
        }
        if(dateInt >= 521 && dateInt <= 620){
            System.out.println("Géminis");
            System.out.println("La comunicación será clave para tus relaciones hoy.");
        }
        if(dateInt >= 621 && dateInt <= 722){
            System.out.println("Cáncer");
            System.out.println("Dedica tiempo a cuidar de ti mismo y de tus seres queridos.");
        }
        if(dateInt >= 723 && dateInt <= 822){
            System.out.println("Leo");
            System.out.println("Tu carisma atraerá nuevas oportunidades.");
        }
        if(dateInt >= 823 && dateInt <= 922){
            System.out.println("Virgo");
            System.out.println("Organiza tus pensamientos y establece prioridades.");
        }
        if(dateInt >= 923 && dateInt <= 1022){
            System.out.println("Libra");
            System.out.println("Busca el equilibrio en tus relaciones personales.");
        }
        if(dateInt >= 1023 && dateInt <= 1121){
            System.out.println("Escorpio");
            System.out.println("Tu pasión te llevará a alcanzar tus metas.");
        }
        if(dateInt >= 1122 && dateInt <= 1221){
            System.out.println("Sagitario");
            System.out.println("La aventura te espera, no dudes en explorar.");
        }
        if((dateInt >= 1222 && dateInt <= 1231) || (dateInt >= 101 && dateInt <= 119)){
            System.out.println("Capricornio");
            System.out.println("La disciplina te acercará a tus objetivos.");
        }
    }
    public static void ejercicio2(Scanner input){
        System.out.println("---------Ejercicio 2: Calculadora de Calorías Quemadas");
        /*Escribe un programa que pida al usuario su peso en kilogramos, la duración del ejercicio en
        minutos y el tipo de ejercicio (correr, nadar, andar en bicicleta), y luego calcule e imprima las
        calorías quemadas. Utiliza diferentes tasas de calorías quemadas por minuto para cada tipo de
        ejercicio.*/

        System.out.print("Ingrese su peso en kilogramos: ");
        Double peso = input.nextDouble();

        System.out.print("Ingrese la duración del ejercicio en minutos: ");
        int duracion = input.nextInt();

        input.nextLine();
        System.out.println("Ingrese el tipo de ejercicio(correr, nadar, andar en bicicleta): ");
        String ejercicio = input.nextLine();

        Double metCorrer = 8.0, metNadar = 6.0, metBicicleta = 5.0, met;

        switch(ejercicio.toLowerCase()){
            case "correr":
                met = metCorrer;
                break;
            case "nadar":
                met = metNadar;
                break;
            case "andar en bicicleta":
                met = metBicicleta;
                break;
            default:
                met = 3.5;
        }
        double caloriasPorMinuto = 0.0175 * peso * met;
        System.out.println("Para " + ejercicio + " con " + peso + "kg durante " +
                duracion + " minutos, usted pierde " + Math.round(caloriasPorMinuto)/100d +
                " calorias por minuto. En total perdió " + Math.round(caloriasPorMinuto * duracion)/100d +
                " calorias.");
    }
    public static void ejercicio3(Scanner input){
        System.out.println("---------Ejercicio 3: Generador de Rutinas de Ejercicio");
        /*Escribe un programa que pida al usuario su nivel de condición física (principiante, intermedio,
        avanzado) y luego genere una rutina de ejercicio semanal con diferentes tipos de ejercicios y
        duraciones.*/
        System.out.print("");
    }
}