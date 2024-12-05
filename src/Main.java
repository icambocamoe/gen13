import java.util.*;

class Battery {
    private String brand;
    private int capacity;

    public Battery(String brand, int capacity) {
        this.brand = brand;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Battery[Brand: " + brand + ", Capacity: " + capacity + "mAh]";
    }
}

class Screen {
    private String resolution;
    private double size;

    public Screen(String resolution, double size) {
        this.resolution = resolution;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Screen[Resolution: " + resolution + ", Size: " + size + " inches]";
    }
}

class Processor {
    private String model;
    private int cores;

    public Processor(String model, int cores) {
        this.model = model;
        this.cores = cores;
    }

    @Override
    public String toString() {
        return "Processor[Model: " + model + ", Cores: " + cores + "]";
    }
}

class CellPhone {
    private Battery battery;
    private Screen screen;
    private Processor processor;

    public CellPhone(Battery battery, Screen screen, Processor processor) {
        this.battery = battery;
        this.screen = screen;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "CellPhone Details:\n" + battery + "\n" + screen + "\n" + processor;
    }
}


public class Main {

    public static void Streamers() {
        List<String> names = Arrays.asList("Ana", "Carlos", "Beatriz", "David", "Camila");

        // Sort, transform to uppercase, filter by a letter, and print the last result
        List<String> result = names.stream()
                .sorted()
                .filter(name -> name.startsWith("C"))
                .toList(); // Filter by letter 'C'

        String lastElement = result.get(result.size() - 1);
        System.out.printf(result+" "+ lastElement);

    }

    public static void Evaluacion(Scanner scanner){
        int numero=-1;
        List<Integer> lm = new ArrayList<Integer>();
        do{
            try {
                System.out.printf("Ingresa el numero natural que desees guardar. Presiona 0 para terminar: ");
                numero = scanner.nextInt();
                lm.add(numero);
            }catch (Exception e) {
                System.out.println("Error: No se admiten cadenas solo numeros.");
                scanner.nextLine();
            }
        }while(numero!=0);
        Optional<Integer> flm = lm.stream()
                .filter(num->num>10)
                .map(num->num*2)
                .reduce(Integer::sum);
        System.out.printf(String.valueOf(flm));
    }

    public static void verAnimal(Animal animal){
        animal.comer();
        animal.respirar();
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gato gato =new Gato();
        Perro perro = new Perro();
        //Evaluacion(scanner);

        verAnimal(gato);
        verAnimal(perro);

        Battery battery = new Battery("Samsung", 5000);
        Screen screen = new Screen("1080x2400", 6.5);
        Processor processor = new Processor("Snapdragon 888", 8);

        CellPhone cellPhone = new CellPhone(battery, screen, processor);
        System.out.println(cellPhone);

        scanner.close();
    }
}
