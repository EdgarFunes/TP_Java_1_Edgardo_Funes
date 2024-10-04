import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0;
        do{
            try{
                System.out.print("Ingrese el numero del ejercicio a ejecutar o 0 para salir: ");
                option = input.nextInt();
                input.nextLine();

                switch (option){
                    case 0:
                        System.out.println("Finalizando ejecucion");
                        break;
                    case 1:
                        ejercicio1(input);
                        break;
                    case 2:
                        ejercicio2(input);
                        break;
                    case 3:
                        ejercicio3(input);
                        break;
                    case 4:
                        ejercicio4(input);
                    default:
                        System.out.println("Esa opcion no existe");
                        break;
                }
            }catch(Exception e){
                System.out.println("Entrada incorrecta, por favor intente nuevamente");
            }
        }while(option != 0);

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
        float peso = input.nextFloat();

        System.out.print("Ingrese la duración del ejercicio en minutos: ");
        int duracion = input.nextInt();

        input.nextLine();
        System.out.println("Ingrese el tipo de ejercicio(correr, nadar, andar en bicicleta): ");
        String ejercicio = input.nextLine();

        float metCorrer = 8.0f, metNadar = 6.0f, metBicicleta = 5.0f, met;

        met = switch (ejercicio.toLowerCase()) {
            case "correr" -> metCorrer;
            case "nadar" -> metNadar;
            case "andar en bicicleta" -> metBicicleta;
            default -> 3.5f;
        };
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
        System.out.println("""
                Escoja su nivel de condicion fisica:\s
                [1] Principiante
                [2] Intermedio
                [3] Avanzado
                [0] Salir""");
        int option = input.nextInt();
        if(option == 1){
            System.out.println("""
                    Rutina para Principiantes\s
                    Frecuencia: 3 días a la semana (por ejemplo, lunes, miércoles y viernes)\s
                    Calentamiento: 5-10 minutos de caminata ligera o bicicleta estática.\s
                    Ejercicios:\s
                    3 series de 10-12 repeticiones de flexiones de rodillas.\s
                    3 series de 10-12 repeticiones de sentadillas.\s
                    3 series de 10 repeticiones de remo con mancuernas.\s
                    3 series de 15 repeticiones de abdominales.\s
                    Enfriamiento: 5-10 minutos de estiramientos.\s
                    """);
        }else if(option == 2){
            System.out.println("""
                    Rutina para Intermedios\s
                    Frecuencia: 4 días a la semana (por ejemplo, lunes, martes, jueves y viernes)\s
                    Calentamiento: 10 minutos de trote suave.\s
                    Ejercicios:\s
                    Día 1: Pecho y tríceps\s
                    4 series de 10 repeticiones de press de banca.\s
                    3 series de 10 repeticiones de fondos.\s
                    Día 2: Espalda y bíceps\s
                    4 series de 10 repeticiones de dominadas.\s
                    3 series de 10 repeticiones de curl de bíceps.\s
                    Día 3: Piernas\s
                    4 series de 10 repeticiones de sentadillas con barra.\s
                    3 series de 12 repeticiones de prensa de piernas.\s
                    Día 4: Core y cardio\s
                    3 series de 15 repeticiones de plancha (30-60 segundos).\s
                    20 minutos de ciclismo o natación.\s
                    Enfriamiento: 10 minutos de estiramientos.\s
                    """);
        }else if(option == 3){
            System.out.println("""
                    Rutina para Avanzados\s
                    Frecuencia: 5-6 días a la semana (por ejemplo, lunes a sábado)\s
                    Calentamiento: 10-15 minutos de HIIT (entrenamiento de intervalos de alta intensidad).\s
                    Ejercicios:\s
                    Día 1: Pecho y espalda\s
                    4 series de 8-10 repeticiones de press de banca inclinado.\s
                    4 series de 8-10 repeticiones de remo con barra.\s
                    Día 2: Piernas\s
                    4 series de 8-10 repeticiones de sentadillas frontales.\s
                    4 series de 10 repeticiones de peso muerto.\s
                    Día 3: Hombros y brazos\s
                    4 series de 8-10 repeticiones de press militar.\s
                    4 series de 10 repeticiones de extensiones de tríceps.\s
                    Día 4: Core y cardio\s
                    4 series de 15 repeticiones de elevaciones de piernas.\s
                    30 minutos de circuito de cardio (correr, saltar la cuerda, etc.).\s
                    Día 5: Full body\s
                    3 series de 10 repeticiones de burpees.\s
                    3 series de 10 repeticiones de kettlebell swings.\s
                    Enfriamiento: 10-15 minutos de estiramientos y movilidad.\s
                    """);
        }else System.out.println("No existe esa opcion");
    }
    public static void ejercicio4(Scanner input){}
}